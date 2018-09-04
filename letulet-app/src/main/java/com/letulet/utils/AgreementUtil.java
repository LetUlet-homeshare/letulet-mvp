package com.letulet.utils;

import com.letulet.backend.model.Agreement;
import com.letulet.backend.model.LandlordManager;
import com.letulet.backend.model.TenantManager;
import com.letulet.utils.email.TemplateEngine;

/**
 * Created by cedric on 2018-04-20.
 */
public class AgreementUtil {

    public static String getTextAgreement (Agreement agreement, boolean withHtml) {

        String textAgreement = TemplateEngine.get("proposal.html", "en_US");
        textAgreement = StringUtil.replace(
                textAgreement,
                new String[] {
                        "[$AGREEMENT_LANDLORD_NAME$]",
                        "[$AGREEMENT_TENANT_NAME$]",
                        "[$AGREEMENT_PROPERTY_ADDRESS$]",
                        "[$AGREEMENT_LANDLORD_COMMISSION$]",
                        "[$AGREEMENT_SD$]",
                        "[$AGREEMENT_MAXIMUM_GUESTS$]",
                        "[$AGREEMENT_MAXIMUM_DAYS$]",
                        "[$AGREEMENT_MAXIMUM_BOOKING$]",
                }, new String[] {
                        LandlordManager.getInstance().showBestProfile(agreement.getProperty().getLandlord()),
                        TenantManager.getInstance().showBestProfile(agreement.getProperty().getTenant()),
                        agreement.getProperty().getAddress1() + ", " + agreement.getProperty().getCity(),
                        agreement.getLandlordCommissionRate()  + "",
                        agreement.getProperty().getSecurityDepositAmount()  + "",
                        agreement.getProperty().getMaximumGuests()  + "",
                        agreement.getProperty().getMaximumDaysPerYear()  + "",
                        agreement.getProperty().getMaximumReservationsPerYear() + ""
                });

        if (!withHtml) {

            textAgreement = StringUtil.removeHtmlAttributes(textAgreement);
        }

        return textAgreement;
    }
}
