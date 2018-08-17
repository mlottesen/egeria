/* SPDX-License-Identifier: Apache-2.0 */
package org.odpi.openmetadata.accessservices.assetowner.properties;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;

/**
 * AssetOwnerElementHeader provides a common base for all instance information from the access service.
 * It implements Serializable.
 */
@JsonAutoDetect(getterVisibility=PUBLIC_ONLY, setterVisibility=PUBLIC_ONLY, fieldVisibility=NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "class")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Asset.class, name = "Asset"),
        @JsonSubTypes.Type(value = Classification.class, name = "Classification")
})
public abstract class AssetOwnerElementHeader implements Serializable
{
    private static final long serialVersionUID = 1L;


    /**
     * Default Constructor sets the properties to nulls
     */
    public AssetOwnerElementHeader()
    {
        /*
         * Nothing to do.
         */
    }


    /**
     * Copy/clone constructor set values from the template
     *
     * @param template object to copy
     */
    public AssetOwnerElementHeader(AssetOwnerElementHeader template)
    {
        /*
         * Nothing to do.
         */
    }
}
