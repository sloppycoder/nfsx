package com.fictional.ibank.profile.persistence.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "nfsx_customers")
public class CustomerEntity extends AbstractPersistable<Long> {

    @Column(name="country_code", length = 3, nullable = false)
    private String countryCode;

    @Column(name="customer_id", length = 10, nullable = false)
    private String customerId;

    @Column(name="customer_name", length = 100, nullable = false)
    private String name;

    @Column(name="login", length = 32, nullable = false)
    private String login;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_upate", columnDefinition = "timestamp default sysdate", nullable = false)
    private Date lastUpdate;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CustomerEntity that = (CustomerEntity) o;

        if (!countryCode.equals(that.countryCode)) return false;
        if (!customerId.equals(that.customerId)) return false;
        if (!name.equals(that.name)) return false;
        return login.equals(that.login);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + countryCode.hashCode();
        result = 31 * result + customerId.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + login.hashCode();
        return result;
    }
}
