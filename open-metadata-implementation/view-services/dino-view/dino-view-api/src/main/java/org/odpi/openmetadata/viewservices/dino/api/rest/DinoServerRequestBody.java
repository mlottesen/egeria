/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.viewservices.dino.api.rest;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;


@JsonAutoDetect(getterVisibility=PUBLIC_ONLY, setterVisibility=PUBLIC_ONLY, fieldVisibility=NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class DinoServerRequestBody {


    /*
     * The DinoServerRequestBody class provides a body for REST requests to the platform-oriented Dino REST APIs
     */

    private String                    serverName;                    // must be non-null
    private String                    platformName;                  // must be non-null
    private String                    serverInstanceName;
    private String                    description;


    public DinoServerRequestBody() {
       // No initialization yet
    }

    /*
     * Getters for Jackson
     */

    public String getServerName() { return serverName; }

    public void setServerName(String serverName) { this.serverName = serverName; }

    public String getPlatformName() { return platformName; }

    public void setPlatformName(String platformName) { this.platformName = platformName; }

    public String getServerInstanceName() { return serverInstanceName; }

    public void setServerInstanceName(String serverInstanceName) { this.serverInstanceName = serverInstanceName; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString()
    {
        return "DinoServerRequestBody{" +
                ", serverName=" + serverName +
                ", platformName=" + platformName +
                ", serverInstanceName=" + serverInstanceName +
                ", description=" + description +
                '}';
    }



}
