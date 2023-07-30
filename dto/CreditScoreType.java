
package com.dto;

import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class CreditScoreType {

    @SerializedName("riskScore")
    @Expose
    private String riskScore;
    @SerializedName("scoreName")
    @Expose
    private String scoreName;
    @SerializedName("populationRank")
    @Expose
    private String populationRank;
    @SerializedName("inquiriesAffectedScore")
    @Expose
    private String inquiriesAffectedScore;
    @SerializedName("CreditScoreFactor")
    @Expose
    @Valid
    private List<CreditScoreFactor> creditScoreFactor;
    @SerializedName("CreditScoreModel")
    @Expose
    @Valid
    private CreditScoreModel creditScoreModel;
    @SerializedName("NoScoreReason")
    @Expose
    @Valid
    private NoScoreReason noScoreReason;
    @SerializedName("Source")
    @Expose
    @Valid
    private Source source;

    public String getRiskScore() {
        return riskScore;
    }

    public void setRiskScore(String riskScore) {
        this.riskScore = riskScore;
    }

    public String getScoreName() {
        return scoreName;
    }

    public void setScoreName(String scoreName) {
        this.scoreName = scoreName;
    }

    public String getPopulationRank() {
        return populationRank;
    }

    public void setPopulationRank(String populationRank) {
        this.populationRank = populationRank;
    }

    public String getInquiriesAffectedScore() {
        return inquiriesAffectedScore;
    }

    public void setInquiriesAffectedScore(String inquiriesAffectedScore) {
        this.inquiriesAffectedScore = inquiriesAffectedScore;
    }

    public List<CreditScoreFactor> getCreditScoreFactor() {
        return creditScoreFactor;
    }

    public void setCreditScoreFactor(List<CreditScoreFactor> creditScoreFactor) {
        this.creditScoreFactor = creditScoreFactor;
    }

    public CreditScoreModel getCreditScoreModel() {
        return creditScoreModel;
    }

    public void setCreditScoreModel(CreditScoreModel creditScoreModel) {
        this.creditScoreModel = creditScoreModel;
    }

    public NoScoreReason getNoScoreReason() {
        return noScoreReason;
    }

    public void setNoScoreReason(NoScoreReason noScoreReason) {
        this.noScoreReason = noScoreReason;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

}
