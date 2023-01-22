package org.abodah.auth.entities;

import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TEMPLATE")
@Validated
@SequenceGenerator(name = "seqTemplate", sequenceName = "seqTemplate", initialValue = 1, allocationSize = 1)
public class Template {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqTemplate")
    @Column(name="TEMPLATE_ID")
    private Long id;
    @NotBlank(message = "Name is mandatory")
    private String name;
    @NotBlank(message = "Name is mandatory")
    private String value;
    @NotNull(message = "Name is mandatory")
    @JoinColumn(name = "WALLET_ID") //, referencedColumnName = "UUID"
    @OneToOne
    private Wallet wallet;

    @NotEmpty(message = "Input movie list cannot be empty.")
    @OneToMany
    @JoinTable(name = "TEMPLATE_TAG", joinColumns = {
            @JoinColumn(name = "TEMPLATE_ID", referencedColumnName = "TEMPLATE_ID") }, inverseJoinColumns = {
                    @JoinColumn(name = "TAG_ID", referencedColumnName = "TAG_ID", unique = true) })
    private List<@Valid Tag> tags = new ArrayList<>();


    public Template() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
