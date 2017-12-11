package tech.lapsa.epayment.domain;

import java.time.Instant;
import java.util.Currency;
import java.util.Optional;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import tech.lapsa.java.commons.function.MyOptionals;

@Entity
@Table(name = "PAYMENT")
public abstract class Payment extends BaseEntity {

    private static final long serialVersionUID = 1L;

    // created

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED")
    protected Instant created = Instant.now();

    public Instant getCreated() {
	return created;
    }

    // amount

    @Basic
    @Column(name = "AMOUNT")
    protected Double amount;

    public Double getAmount() {
	return amount;
    }

    // currency

    @Basic
    @Column(name = "CURRENCY")
    protected Currency currency;

    public Currency getCurrency() {
	return currency;
    }

    // referenceNumber

    @Basic
    @Column(name = "REFERENCE_NUMBER")
    protected String referenceNumber;

    public String getReferenceNumber() {
	return referenceNumber;
    }

    // forInvoice

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "payment")
    protected Invoice forInvoice;

    public Invoice getForInvoice() {
	return forInvoice;
    }

    public Optional<Invoice> optionalForInvoice() {
	return MyOptionals.of(getForInvoice());
    }

    // method

    public abstract PaymentMethod getMethod();
}
