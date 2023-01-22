package org.abodah.auth.model;

import javax.validation.constraints.NotBlank;

import java.io.Serializable;

public class TagModel implements Serializable {


    private long uuid;

    @NotBlank(message = "Name is mandatory")
    private String tagName;

    public long getUuid () {
        return uuid;
    }

    public void setUuid(long uuid){
        this.uuid = uuid;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }


}
