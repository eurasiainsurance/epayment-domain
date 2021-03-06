package tech.lapsa.epayment.domain;

import java.util.Locale;
import java.util.function.Function;

import tech.lapsa.java.commons.localization.LocalizedElement;

public enum Localization implements LocalizedElement {
    BANK_NAME,
    //
    INVOICE_NAME,
    INVOICE_FIELD_AMOUNT,
    //
    QAZKOMORDER_NAME, //
    QAZKOMORDER_FIELD_AMOUNT,
    //
    QAZKOMPAYMENT_NAME, //
    //
    QAZKOMERROR_NAME, //
    //
    QAZKOMXMLDOC_EMPTYNAME, //
    //
    UNKNOWNPAYMENT_NAME,
    //
    ITEM_EMPTYNAME,
    ITEM_FIELD_PRICE,
    ITEM_FIELD_QUANTITY,
    ITEM_FIELD_TOTAL,
    //
    PAYMENT_FIELD_AMOUNT,
    //
    FIELD_CREATED, //
    FIELD_NUMBER, //
    FIELD_STATUS, //
    FIELD_NAME, //
    FIELD_CODE, //
    ;

    public Function<String, String> fieldAsCaptionMapper(final LocalizationVariant variant,
	    final Locale locale) {
	return x -> localized(variant, locale) + " '" + x + "'";
    }
}
