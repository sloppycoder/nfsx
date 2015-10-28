package com.fictional.ibank.profile.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.sun.istack.internal.NotNull;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

@JsonRootName("customer")
public class Customer {

    private BigDecimal id;

    @NotNull
    @Size(min=2, max=2)
    private String countryCode;

    @NotNull
    @Size(min=5, max=10)
    private String customerId;

    @NotNull
    private String name;

    @NotNull
    @Size(min=6, max=31)
    private String login;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date lastUpdate;

    public Customer() {
    }

    public Customer(String id) {
        //No error handling here for now..
        countryCode = id.substring(0,2);
        customerId = id.substring(2);
    }

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

    public String getLogin() {  return login;   }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }
}
