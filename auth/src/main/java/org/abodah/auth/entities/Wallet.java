package org.abodah.auth.entities;

import javax.persistence.*;

@Entity
@Table(name = "WALLET")
@SequenceGenerator(name = "seqWallet", sequenceName = "seqWallet", initialValue = 1, allocationSize = 1)
public class Wallet {
    @Id
    @Column(name = "WALLET_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqWallet")
    private Long uuid;

    @Column(name = "NAME")
    private String name;

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
