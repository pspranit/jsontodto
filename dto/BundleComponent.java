
package com.dto;

import javax.annotation.Generated;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class BundleComponent {

    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("CreditScoreType")
    @Expose
    @Valid
    private CreditScoreType creditScoreType;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreditScoreType getCreditScoreType() {
        return creditScoreType;
    }

    public void setCreditScoreType(CreditScoreType creditScoreType) {
        this.creditScoreType = creditScoreType;
    }

}
