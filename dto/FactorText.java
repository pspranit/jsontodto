
package com.dto;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class FactorText {

    @SerializedName("FactorText")
    @Expose
    private String factorText;

    public String getFactorText() {
        return factorText;
    }

    public void setFactorText(String factorText) {
        this.factorText = factorText;
    }

}
