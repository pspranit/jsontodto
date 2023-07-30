
package com.dto;
import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class CreditScoreFactor {

    @SerializedName("bureauCode")
    @Expose
    private String bureauCode;
    @SerializedName("FactorType")
    @Expose
    private String factorType;
    @SerializedName("Factor")
    @Expose
    @Valid
    private Factor factor;
    @SerializedName("FactorText")
    @Expose
    @Valid
    @JsonAdapter(FactorTextDeserilizer.class)
    private List<FactorText> factorText;

    public String getBureauCode() {
        return bureauCode;
    }

    public void setBureauCode(String bureauCode) {
        this.bureauCode = bureauCode;
    }

    public String getFactorType() {
        return factorType;
    }

    public void setFactorType(String factorType) {
        this.factorType = factorType;
    }

    public Factor getFactor() {
        return factor;
    }

    public void setFactor(Factor factor) {
        this.factor = factor;
    }

    public List<FactorText> getFactorText() {
        return factorText;
    }

    public void setFactorText(List<FactorText> factorText) {
        this.factorText = factorText;
    }

}
