package com.fictional.ibank.card.persistence.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ibank_cards")
public class CreditCardEntity extends AbstractPersistable<Long> {

    @Column(name="country_code", length = 3, nullable = false)
    private String countryCode;

    @Column(name="customer_id", length = 10, nullable = false)
    private String customerId;

    @Column(name="product_name", length = 100, nullable = false)
    private String getProductName;

    @Column(name="balance", precision=10, scale=4, nullable = false)
    private double balance;

    @Column(name="avail_limit", precision=10, scale=4, nullable = false)
    private double availableLimit;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_update", columnDefinition = "timestamp default sysdate", nullable = false)
    private Date lastUpdate;

    @Temporal(TemporalType.DATE)
    @Column(name = "expiry_date", columnDefinition = "date", nullable = false)
    private Date expiryDate;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getGetProductName() {
        return getProductName;
    }

    public void setGetProductName(String getProductName) {
        this.getProductName = getProductName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public double getAvailableLimit() {
        return availableLimit;
    }

    public void setAvailableLimit(double availableLimit) {
        this.availableLimit = availableLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreditCardEntity that = (CreditCardEntity) o;

        if (Double.compare(that.balance, balance) != 0) return false;
        if (Double.compare(that.availableLimit, availableLimit) != 0) return false;
        if (!countryCode.equals(that.countryCode)) return false;
        if (!customerId.equals(that.customerId)) return false;
        if (!getProductName.equals(that.getProductName)) return false;
        return expiryDate.equals(that.expiryDate);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + countryCode.hashCode();
        result = 31 * result + customerId.hashCode();
        result = 31 * result + getProductName.hashCode();
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(availableLimit);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + expiryDate.hashCode();
        return result;
    }
}
