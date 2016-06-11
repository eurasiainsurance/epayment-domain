package com.lapsa.kkb.xml;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "customer")
public class KKBCustomer implements Serializable {
    private static final long serialVersionUID = -2444954410632492009L;

    // Имя покупателя указанное в системе авторизации
    @XmlAttribute(name = "name")
    private String name;

    // Email адрес покупателя указанный в системе авторизации
    @XmlAttribute(name = "mail")
    private String emailAddress;

    // Телефон покупателя указанный в системе авторизации
    @XmlAttribute(name = "phone")
    private String phone;

    // исходный запрос
    @XmlElementRef
    private KKBMerchant sourceMerchant;

    // подпись исходного запроса
    @XmlElementRef
    private KKBMerchantSign sourceMerchantSign;

    // GENERATED

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getEmailAddress() {
	return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
    }

    public String getPhone() {
	return phone;
    }

    public void setPhone(String phone) {
	this.phone = phone;
    }

    public KKBMerchant getSourceMerchant() {
	return sourceMerchant;
    }

    public void setSourceMerchant(KKBMerchant sourceMerchant) {
	this.sourceMerchant = sourceMerchant;
    }

    public KKBMerchantSign getSourceMerchantSign() {
	return sourceMerchantSign;
    }

    public void setSourceMerchantSign(KKBMerchantSign sourceMerchantSign) {
	this.sourceMerchantSign = sourceMerchantSign;
    }

}
