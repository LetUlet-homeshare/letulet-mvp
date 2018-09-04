package com.letulet.utils.email;

import com.letulet.backend.utils.WorkerThreads;
import com.letulet.utils.Log;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by stephan on 07/11/17.
 *
 * Provides simple convenience methods for sending mails.
 * All configs harcoded
 */
public class SimpleMailer {

	/**
	 * The singleton instance.
	 */
	private static final SimpleMailer	instance	= new SimpleMailer ();

	/**
	 * @return the singleton instance
	 */
	public static SimpleMailer getInstance () {

		return instance;
	}

	//private final static String	SMTP_HOST	= Config.getAsString ("mailer.smtp.host", "localhost");
	//private final static int	SMTP_PORT	= Config.getAsInteger ("mailer.smtp.port", 25);

    private final static String	SMTP_HOST	= "smtp.gmail.com";
    private final static int	SMTP_PORT	= 587;

    private final static String MIME_TYPE_HTML = "text/html; charset=UTF-8";
    private final static String	DEFAULT_FROM_NAME = "LetULet";
	private SimpleMailer () {

	}

    /* Same as send() but done in a new thread for faster server response to user */
    public void spawnThreadAndSend(String from, String to, String subject, String body, String replyTo) {

        final String ffrom = from;
        final String fto = to;
        final String fsubject = subject;
        final String fbody = body;
        final String rreplyto = replyTo;

        try {
            WorkerThreads.submit("Nofification Cleaner", new Runnable() {
                public void run() {
                    send(ffrom, null, fto, fsubject, fbody, null, null, rreplyto);
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void spawnThreadAndSend(String from, String fromName, String to, String subject, String body, String cc, String bcc, String replyTo) {

        final String ffrom = from;
        final String ffromName = fromName;
        final String fto = to;
        final String fsubject = subject;
        final String fbody = body;
        final String fcc = cc;
        final String fbcc = bcc;
        final String rreplyto = replyTo;

        try {
            WorkerThreads.submit("Nofification Cleaner", new Runnable() {
                public void run() {
                    send (ffrom, ffromName, fto, fsubject, fbody, fcc, fbcc, rreplyto);
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


	/**
	 * Sends a mail to a fixed recipient (given by configuration).
	 *
	 * @param from the sender mail address; used in the message header, not for contacting the SMTP server
	 * @param to the receiver mail address
	 * @param subject message subject
	 * @param body the message to send
	 */
	public void send (String from, String fromName, String to, String subject, String body, String cc, String bcc, String replyTo) {

		// prepare message to use in log messages
		String msg = new StringBuilder ().append ("from ").append (from).append (" to ").append (to).append (" (")
				.append (subject).append (")...").toString ();

		try {
			Properties props = new Properties ();
			props.put ("mail.smtp.host", SMTP_HOST);
			props.put ("mail.smtp.port", "" + SMTP_PORT);

            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            Authenticator auth =  new SMTPAuthenticator("admin@letulet.com", "lul2018!!"); //TODO: should NOT HARDCODE PASSWORD!!!
            Message mail = new MimeMessage(Session.getInstance(props, auth));

            if(fromName == null) {
                fromName = DEFAULT_FROM_NAME;
            }

			// set message headers
			mail.setFrom (new InternetAddress (from, fromName));
            if(replyTo == null) {
                replyTo = from;
            }
			mail.setReplyTo (new InternetAddress [] {
				new InternetAddress (replyTo)
			});
			mail.setRecipient (Message.RecipientType.TO, new InternetAddress (to));
			mail.setSubject (subject);
			mail.setContent (body, MIME_TYPE_HTML);

            if(cc != null) {
                mail.setRecipient (Message.RecipientType.CC, new InternetAddress (cc));
            }

            if(bcc != null) {
                mail.setRecipient (Message.RecipientType.BCC, new InternetAddress (bcc));
            }

			// send mail
			Transport.send (mail);

			Log.info(getClass(), "mail successfully sent: " + msg);
		}
		catch (AddressException e) {
			Log.error (getClass (), "could not send mail: " + msg, e);
		}
		catch (MessagingException e) {
			Log.error (getClass (), "could not send mail: " + msg, e);
		}
        catch (Exception e) {
            Log.error (getClass (), "could not send mail: " + msg, e);
        }
	}


    private class SMTPAuthenticator extends javax.mail.Authenticator
    {
        private final String username;
        private final String password;

        public SMTPAuthenticator(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public PasswordAuthentication getPasswordAuthentication()
        {
            return new PasswordAuthentication(username, password);
        }
    }
}
