package com.lapsa.kkb.core;

import static com.lapsa.kkb.core.DisplayNameElements.*;

import java.util.Locale;
import java.util.StringJoiner;

import tech.lapsa.java.commons.function.MyOptionals;

public class KKBPaymentErrorDocument extends KKBDocument {
    private static final long serialVersionUID = -3421596583719107336L;
    private static final int PRIME = 19;
    private static final int MULTIPLIER = 19;

    @Override
    protected int getPrime() {
	return PRIME;
    }

    @Override
    protected int getMultiplier() {
	return MULTIPLIER;
    }

    @Override
    public String localized(LocalizationVariant variant, Locale locale) {
	StringBuilder sb = new StringBuilder();

	sb.append(PAYMENT_ERROR_DOCUMENT.localized(variant, locale));

	StringJoiner sj = new StringJoiner(", ", " ", "");
	sj.setEmptyValue("");

	MyOptionals.of(created) //
		.map(DisplayNames.instantMapper(locale) //
			.andThen(FIELD_CREATED.fieldAsCaptionMapper(variant, locale))) //
		.ifPresent(sj::add);

	return sb.append(sj.toString()) //
		.append(appendEntityId()) //
		.toString();
    }
}
