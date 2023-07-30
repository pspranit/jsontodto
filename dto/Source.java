
package com.dto;

import javax.annotation.Generated;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Source {

    @SerializedName("BorrowerKey")
    @Expose
    private String borrowerKey;
    @SerializedName("Bureau")
    @Expose
    @Valid
    private Bureau bureau;
    @SerializedName("InquiryDate")
    @Expose
    private String inquiryDate;
    @SerializedName("Reference")
    @Expose
    private String reference;

    public String getBorrowerKey() {
        return borrowerKey;
    }

    public void setBorrowerKey(String borrowerKey) {
        this.borrowerKey = borrowerKey;
    }

    public Bureau getBureau() {
        return bureau;
    }

    public void setBureau(Bureau bureau) {
        this.bureau = bureau;
    }

    public String getInquiryDate() {
        return inquiryDate;
    }

    public void setInquiryDate(String inquiryDate) {
        this.inquiryDate = inquiryDate;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

}
