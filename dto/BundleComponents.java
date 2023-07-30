
package com.dto;

import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class BundleComponents {

    @SerializedName("BundleComponent")
    @Expose
    @Valid
    private List<BundleComponent> bundleComponent;

    public List<BundleComponent> getBundleComponent() {
        return bundleComponent;
    }

    public void setBundleComponent(List<BundleComponent> bundleComponent) {
        this.bundleComponent = bundleComponent;
    }

}
