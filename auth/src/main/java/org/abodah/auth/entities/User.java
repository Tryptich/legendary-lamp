package org.abodah.auth.entities;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "USER")
@SequenceGenerator(name = "seqUser", sequenceName = "seqUser", initialValue = 1, allocationSize = 1)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqUser")
    @Column(name = "USER_ID")
    private Long uuid;
    @NotBlank(message = "login is mandatory")
    private String login;
    @NotBlank(message = "password is mandatory")
    private String password;
    @NotBlank(message = "First Name is mandatory")
    private String first_name;
    @NotBlank(message = "Last Name is mandatory")
    private String last_name;

    @OneToMany(orphanRemoval = true)
    @JoinTable(name = "USER_WALLET", joinColumns = {
        @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID") }, inverseJoinColumns = {
                @JoinColumn(name = "WALLET_ID", referencedColumnName = "WALLET_ID", unique = true) })
    List<@Valid Wallet> wallets = new ArrayList<>();

    @OneToMany
    @JoinTable(name = "USER_TAG", joinColumns = {
            @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID") }, inverseJoinColumns = {
                    @JoinColumn(name = "TAG_ID", referencedColumnName = "TAG_ID", unique = true) })
    List<@Valid Tag> tags = new ArrayList<>();

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public List<Wallet> getWallets() {
        return wallets;
    }

    public void setWallets(List<Wallet> wallets) {
        this.wallets = wallets;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
