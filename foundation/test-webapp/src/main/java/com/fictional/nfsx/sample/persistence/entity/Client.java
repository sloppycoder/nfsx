package com.fictional.nfsx.sample.persistence.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;
import javax.persistence.*;

@Entity
@Table(name = "cif")
public class Client extends AbstractPersistable<Long> {

    @Column(name="country_code", length = 3, nullable = false)
    private String countryCode;

    @Column(name="cif_id", length = 10, nullable = false)
    private String clientId;

    @Column(name="secret_notes", length = 10, nullable = false)
    private String notes;

    @Column(name="rm_id", length = 8, nullable = false)
    private String relationshipManagerId;

}
