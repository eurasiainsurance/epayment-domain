package com.lapsa.kkb.core;

import static com.lapsa.kkb.core.DisplayNameElements.*;

import java.util.Arrays;
import java.util.Locale;
import java.util.StringJoiner;

import tech.lapsa.java.commons.function.MyOptionals;
import tech.lapsa.java.commons.localization.Localized;

public class KKBSignedData extends KKBBaseDomain {
    private static final long serialVersionUID = -7295482069867034544L;
    private static final int PRIME = 17;
    private static final int MULTIPLIER = 17;

    @Override
    protected int getPrime() {
	return PRIME;
    }

    @Override
    protected int getMultiplier() {
	return MULTIPLIER;
    }

    protected byte[] data;
    protected byte[] digest;
    protected boolean inverted = true;
    protected KKBSignatureStatus status = KKBSignatureStatus.UNCHECKED;

    public byte[] getData() {
	return data;
    }

    public void setData(byte[] data) {
	if (!Arrays.equals(this.data, data))
	    status = KKBSignatureStatus.UNCHECKED;
	this.data = data;
    }

    public byte[] getDigest() {
	return digest;
    }

    public void setDigest(byte[] digest) {
	if (!Arrays.equals(this.digest, digest))
	    status = KKBSignatureStatus.UNCHECKED;
	this.digest = digest;
    }

    public boolean isInverted() {
	return inverted;
    }

    public void setInverted(boolean inverted) {
	if (this.inverted != inverted)
	    status = KKBSignatureStatus.UNCHECKED;
	this.inverted = inverted;
    }

    public KKBSignatureStatus getStatus() {
	return status;
    }

    public void setStatus(KKBSignatureStatus status) {
	this.status = status;
    }

    @Override
    public String displayName(LocalizationVariant variant, Locale locale) {
	StringBuilder sb = new StringBuilder();

	sb.append(PAYMENT_SIGNED_DATA.localized(variant, locale));

	StringJoiner sj = new StringJoiner(", ", " ", "");
	sj.setEmptyValue("");

	MyOptionals.of(status) //
		.map(Localized.toLocalizedMapper(variant, locale) //
			.andThen(FIELD_STATUS.fieldAsCaptionMapper(variant, locale))) //
		.ifPresent(sj::add);

	return sb.append(sj.toString()) //
		.toString();
    }

}
