package com.fictional.nfsx.sample.persistence.entity;

import com.fictional.nfsx.sample.persistence.converter.EncryptedStringConverter;
import org.springframework.data.jpa.domain.AbstractPersistable;
import javax.persistence.*;

@Entity
@Table(name = "cif")
public class Client extends AbstractPersistable<Long> {

    @Column(name="country_code", length = 3, nullable = false)
    private String countryCode;

    @Column(name="cif_id", length = 10, nullable = false)
    private String clientId;

    @Column(name="name", length = 10, nullable = false)
    @Convert(converter = EncryptedStringConverter.class)
    private String name;

    @Column(name="rm_id", length = 8, nullable = false)
    private String relationshipManagerId;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelationshipManagerId() {
        return relationshipManagerId;
    }

    public void setRelationshipManagerId(String relationshipManagerId) {
        this.relationshipManagerId = relationshipManagerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Client client = (Client) o;

        if (!countryCode.equals(client.countryCode)) return false;
        if (!clientId.equals(client.clientId)) return false;
        if (name != null ? !name.equals(client.name) : client.name != null) return false;
        return relationshipManagerId.equals(client.relationshipManagerId);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + countryCode.hashCode();
        result = 31 * result + clientId.hashCode();
        result = 31 * result + relationshipManagerId.hashCode();
        return result;
    }
}
