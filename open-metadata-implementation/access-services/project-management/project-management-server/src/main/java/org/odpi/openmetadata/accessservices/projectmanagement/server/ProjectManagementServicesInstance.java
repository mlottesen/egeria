/* SPDX-License-Identifier: Apache 2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.accessservices.projectmanagement.server;

import org.odpi.openmetadata.accessservices.projectmanagement.ffdc.ProjectManagementErrorCode;
import org.odpi.openmetadata.adminservices.configuration.registration.AccessServiceDescription;
import org.odpi.openmetadata.commonservices.multitenant.OCFOMASServiceInstance;
import org.odpi.openmetadata.commonservices.multitenant.ffdc.exceptions.NewInstanceException;
import org.odpi.openmetadata.repositoryservices.auditlog.OMRSAuditLog;
import org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.repositoryconnector.OMRSRepositoryConnector;

import java.util.List;

/**
 * ProjectManagementServicesInstance caches references to objects for a specific server.
 * It is also responsible for registering itself in the instance map.
 */
public class ProjectManagementServicesInstance extends OCFOMASServiceInstance
{
    private static AccessServiceDescription myDescription = AccessServiceDescription.PROJECT_MANAGEMENT_OMAS;


    /**
     * Set up the handlers for this server.
     *
     * @param repositoryConnector link to the repository responsible for servicing the REST calls.
     * @param supportedZones list of zones that ProjectManagement is allowed to serve Assets from.
     * @param auditLog destination for audit log events.
     * @param localServerUserId userId used for server initiated actions
     * @param maxPageSize maximum number of results that can be returned on a single call
     * @throws NewInstanceException a problem occurred during initialization
     */
    public ProjectManagementServicesInstance(OMRSRepositoryConnector repositoryConnector,
                                             List<String>            supportedZones,
                                             OMRSAuditLog            auditLog,
                                             String                  localServerUserId,
                                             int                     maxPageSize) throws NewInstanceException
    {
        super(myDescription.getAccessServiceName() + " OMAS",
              repositoryConnector,
              supportedZones,
              null,
              auditLog,
              localServerUserId,
              maxPageSize);

        final String methodName = "new ServiceInstance";

        if (repositoryHandler != null)
        {
            /* Add handlers here */
        }
        else
        {
            ProjectManagementErrorCode errorCode    = ProjectManagementErrorCode.OMRS_NOT_INITIALIZED;
            String                     errorMessage = errorCode.getErrorMessageId() + errorCode.getFormattedErrorMessage(methodName);

            throw new NewInstanceException(errorCode.getHTTPErrorCode(),
                                           this.getClass().getName(),
                                           methodName,
                                           errorMessage,
                                           errorCode.getSystemAction(),
                                           errorCode.getUserAction());

        }
    }

}