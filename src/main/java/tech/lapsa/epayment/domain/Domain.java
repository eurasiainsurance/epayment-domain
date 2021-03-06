package tech.lapsa.epayment.domain;

import java.io.Serializable;

import tech.lapsa.java.commons.localization.Localized;
import tech.lapsa.patterns.domain.MyHcEqToStr;

public abstract class Domain implements Localized, Serializable {

    private static final long serialVersionUID = 1L;

    protected Domain() {
    }

    @Override
    public String toString() {
	return localized(LocalizationVariant.NORMAL, MyHcEqToStr.toStringLocaleOf(this.getClass()));
    }

    @Override
    public final int hashCode() {
	return MyHcEqToStr.hashCode(this);
    }

    @Override
    public final boolean equals(final Object other) {
	return MyHcEqToStr.equals(this, other);
    }

    public void unlazy() {
    }
}
