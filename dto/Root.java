
package com.dto;

import javax.annotation.Generated;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Root {

    @SerializedName("BundleComponents")
    @Expose
    @Valid
    private BundleComponents bundleComponents;

    public BundleComponents getBundleComponents() {
        return bundleComponents;
    }

    public void setBundleComponents(BundleComponents bundleComponents) {
        this.bundleComponents = bundleComponents;
    }

}
