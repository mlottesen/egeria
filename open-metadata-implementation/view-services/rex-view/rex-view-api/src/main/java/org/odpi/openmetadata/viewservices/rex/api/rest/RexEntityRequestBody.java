/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.viewservices.rex.api.rest;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;


@JsonAutoDetect(getterVisibility=PUBLIC_ONLY, setterVisibility=PUBLIC_ONLY, fieldVisibility=NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class RexEntityRequestBody {


    /*
     * The RexTraversalRequestBody class provides a body for REST requests to perform a rex-traversal
     */

    private String                    serverName;                    // must be non-null
    private String                    serverRootURL;                 // must be non-null
    private String                    entityGUID;                    // must be non-null, GUID of root of traversal
    private Boolean                   enterpriseOption;
    private Integer                   gen;                           // indicator of the current gen of the traversal


    public RexEntityRequestBody() {
       // No initialization yet
    }

    /*
     * Getters for Jackson
     */

    public String getServerName() { return serverName; }

    public String getServerRootURL() { return serverRootURL; }

    public String getEntityGUID() { return entityGUID; }

    public Boolean getEnterpriseOption() { return enterpriseOption; }

    public Integer getGen() { return gen; }

    // ---
    public void setServerName(String serverName) { this.serverName = serverName; }

    public void setServerRootURL(String serverRootURL) { this.serverRootURL = serverRootURL; }

    public void setEntityGUID(String entityGUID) { this.entityGUID = entityGUID; }

    public void setEnterpriseOption(Boolean enterpriseOption) { this.enterpriseOption = enterpriseOption; }

    public void setGen(Integer gen) { this.gen = gen; }





    @Override
    public String toString()
    {
        return "RexEntityRequestBody{" +
                ", serverName=" + serverName +
                ", serverRootURL=" + serverRootURL +
                ", entityGUID=" + entityGUID +
                ", enterpriseOption=" + enterpriseOption +
                ", gen=" + gen +
                '}';
    }



}
