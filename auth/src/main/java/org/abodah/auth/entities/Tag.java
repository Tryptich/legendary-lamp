package org.abodah.auth.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "TAG")
@SequenceGenerator(name = "SeqTag", sequenceName = "SeqTag", initialValue = 1, allocationSize = 1)
public class Tag {

    @Id
    @Column(name = "TAG_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SeqTag")
    private Long uuid;
    @NotBlank(message = "Name is mandatory")
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
