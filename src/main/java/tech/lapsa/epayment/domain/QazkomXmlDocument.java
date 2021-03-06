package tech.lapsa.epayment.domain;

import java.util.Base64;
import java.util.Locale;
import java.util.Optional;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.Table;

import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.java.commons.function.MyOptionals;
import tech.lapsa.java.commons.function.MyStrings;
import tech.lapsa.patterns.domain.HashCodePrime;

@Entity
@Table(name = "QAZKOM_XML_DOCUMENT")
@HashCodePrime(19)
public class QazkomXmlDocument extends EntitySuperclass {

    private static final long serialVersionUID = 1L;

    public static enum DocumentType {
	ORDER, PAYMENT, CART, ERROR;
    }

    public QazkomXmlDocument() {
    }

    public QazkomXmlDocument(final String rawXml, final DocumentType type) throws IllegalArgumentException {
	this.rawXml = MyStrings.requireNonEmpty(rawXml, "rawXml");
	this.type = MyObjects.requireNonNull(type, "type");
    }

    @Override
    public String localized(final LocalizationVariant variant, final Locale locale) {
	return MyOptionals.of(rawXml) //
		.orElseGet(() -> Localization.QAZKOMXMLDOC_EMPTYNAME.localized(variant, locale));
    }

    // rawXml

    @Basic
    @Lob
    @Column(name = "RAW_XML")
    protected String rawXml;

    public String getRawXml() {
	return rawXml;
    }

    public Optional<String> optionalRawXml() {
	return MyOptionals.of(getRawXml());
    }

    public String getBase64Xml() {
	return optionalRawXml() //
		.map(String::getBytes) //
		.map(Base64.getEncoder()::encodeToString) //
		.orElse(null);
    }

    public Optional<String> optionalBase64Xml() {
	return MyOptionals.of(getBase64Xml());
    }

    // type

    @Basic
    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE")
    protected DocumentType type;

    public DocumentType getType() {
	return type;
    }

    public boolean isOrder() {
	return type == DocumentType.ORDER;
    }

    public boolean isCart() {
	return type == DocumentType.CART;
    }

    public boolean isPayment() {
	return type == DocumentType.PAYMENT;
    }

    public boolean isError() {
	return type == DocumentType.ERROR;
    }

    // controllers

    @Override
    public void unlazy() {
    }
}
