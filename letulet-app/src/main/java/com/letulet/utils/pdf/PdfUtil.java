package com.letulet.utils.pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Created by stephan on 07/11/17.
 */
public class PdfUtil {

    public static boolean convertToPdfFromHtmlString(final String html, final String pdfLocation) {
        return doConvertToPdfFromHtml(new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8)),
                pdfLocation);
    }

    public static boolean convertToPdfFromHtmlFile(final String htmlLocation, final String pdfLocation) {
        try {
            return doConvertToPdfFromHtml(new FileInputStream(htmlLocation), pdfLocation);
        } catch (FileNotFoundException e) {
            System.out.println("Error generationg pdf. Invalid html file location: " + htmlLocation);
        }

        return false;
    }

    private static boolean doConvertToPdfFromHtml(final InputStream source, final String pdfLocation) {
        try {
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdfLocation));
            document.open();

            XMLWorkerHelper.getInstance().parseXHtml(writer, document, source);

            document.close();

            System.out.println("PDF file created: " + pdfLocation);

            return true;
        } catch (FileNotFoundException e) {
            System.out.println("Error generationg pdf. Invalid pdf file location: " + pdfLocation);
        } catch (IOException e) {
            System.out.println("Error generationg pdf. Error parsing html source.");
        } catch (DocumentException e) {
            System.out.println("Error generationg pdf. Document cannot be created.");
        }

        return false;
    }
}
