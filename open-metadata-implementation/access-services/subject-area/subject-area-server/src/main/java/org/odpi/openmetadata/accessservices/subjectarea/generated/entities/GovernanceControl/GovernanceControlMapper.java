/* SPDX-License-Identifier: Apache-2.0 */

// This is a generated file - do not edit - changes should be made to the templates amd/or generator to generate this file with changes.

package org.odpi.openmetadata.accessservices.subjectarea.generated.entities.GovernanceControl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

// omrs
import org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.*;
import org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.typedefs.*;
import org.odpi.openmetadata.repositoryservices.archivemanager.OMRSArchiveAccessor;

// omas
import org.odpi.openmetadata.accessservices.subjectarea.server.properties.classifications.ClassificationFactory;
import org.odpi.openmetadata.accessservices.subjectarea.properties.enums.*;

import org.odpi.openmetadata.accessservices.subjectarea.ffdc.exceptions.InvalidParameterException;
import org.odpi.openmetadata.accessservices.subjectarea.properties.enums.Status;
import org.odpi.openmetadata.accessservices.subjectarea.properties.objects.common.SystemAttributes;
import org.odpi.openmetadata.accessservices.subjectarea.utilities.SubjectAreaUtils;
import org.odpi.openmetadata.accessservices.subjectarea.properties.classifications.Classification;

/**
 * Static mapping methods to map between GovernanceControl and the omrs equivalents.
 */
public class GovernanceControlMapper {
    private static final Logger log = LoggerFactory.getLogger( GovernanceControlMapper.class);
    private static final String className = GovernanceControlMapper.class.getName();
   /**
    * @param omrsEntityDetail the supplied EntityDetail
    * @return equivalent GovernanceControl
    */
   static public org.odpi.openmetadata.accessservices.subjectarea.generated.entities.GovernanceControl.GovernanceControl mapOmrsEntityDetailToGovernanceControl(EntityDetail omrsEntityDetail) throws InvalidParameterException{
        String entityTypeName = omrsEntityDetail.getType().getTypeDefName();
        if ("GovernanceControl".equals(entityTypeName)) {
                org.odpi.openmetadata.accessservices.subjectarea.generated.entities.GovernanceControl.GovernanceControl governanceControl = new GovernanceControl();
                //set core attributes
                SystemAttributes systemAttributes = new SystemAttributes();

                InstanceStatus instanceStatus =  omrsEntityDetail.getStatus();
                Status omas_status = SubjectAreaUtils.convertInstanceStatusToStatus(instanceStatus);
                systemAttributes.setStatus(omas_status);

                systemAttributes.setCreatedBy(omrsEntityDetail.getCreatedBy());
                systemAttributes.setUpdatedBy(omrsEntityDetail.getUpdatedBy());
                systemAttributes.setCreateTime(omrsEntityDetail.getCreateTime());
                systemAttributes.setUpdateTime(omrsEntityDetail.getUpdateTime());
                systemAttributes.setVersion(omrsEntityDetail.getVersion());
                systemAttributes.setGUID(omrsEntityDetail.getGUID());
                governanceControl.setSystemAttributes(systemAttributes);


                // Set properties
                InstanceProperties omrsEntityDetailProperties = omrsEntityDetail.getProperties();
                Iterator omrsPropertyIterator = omrsEntityDetailProperties.getPropertyNames();
                while (omrsPropertyIterator.hasNext()) {
                    String name = (String) omrsPropertyIterator.next();
                    //TODO check if this is a property we expect or whether the type has been added to.
                    // this is a property we expect
                    InstancePropertyValue value = omrsEntityDetailProperties.getPropertyValue(name);

                    // supplied guid matches the expected type

                    Object actualValue;
                    switch (value.getInstancePropertyCategory()) {
                        case PRIMITIVE:
                            PrimitivePropertyValue primitivePropertyValue = (PrimitivePropertyValue) value;
                            actualValue = primitivePropertyValue.getPrimitiveValue();
                            if (governanceControl.ATTRIBUTE_NAMES_SET.contains(name)) {
                               if (name.equals("implementationDescription")) {
                                   governanceControl.setImplementationDescription((String)actualValue);
                               }
                               if (name.equals("title")) {
                                   governanceControl.setTitle((String)actualValue);
                               }
                               if (name.equals("summary")) {
                                   governanceControl.setSummary((String)actualValue);
                               }
                               if (name.equals("description")) {
                                   governanceControl.setDescription((String)actualValue);
                               }
                               if (name.equals("scope")) {
                                   governanceControl.setScope((String)actualValue);
                               }
                               if (name.equals("priority")) {
                                   governanceControl.setPriority((String)actualValue);
                               }
                               if (name.equals("qualifiedName")) {
                                   governanceControl.setQualifiedName((String)actualValue);
                               }
                            } else {
                                // put out the omrs value object
                                if (null==governanceControl.getExtraAttributes())  {
                                     governanceControl.setExtraAttributes(new HashMap<String, Object>());
                                }
                               governanceControl.getExtraAttributes().put(name, primitivePropertyValue);
                            }
                            break;
                        case ENUM:
                            EnumPropertyValue enumPropertyValue = (EnumPropertyValue) value;
                            String symbolicName = enumPropertyValue.getSymbolicName();
                            if (governanceControl.ENUM_NAMES_SET.contains(name)) {
                                 if (name.equals("domain")) {
                                       org.odpi.openmetadata.accessservices.subjectarea.properties.enums.GovernanceDomain domain = org.odpi.openmetadata.accessservices.subjectarea.properties.enums.GovernanceDomain.valueOf(symbolicName);
                                      governanceControl.setDomain(domain);
                                 }
                            } else {
                                // put out the omrs value object
                                if (null==governanceControl.getExtraAttributes())  {
                                     governanceControl.setExtraAttributes(new HashMap<String, Object>());
                                }
                                 governanceControl.getExtraAttributes().put(name, enumPropertyValue);
                             }

                            break;
                        case MAP:
                            if (governanceControl.MAP_NAMES_SET.contains(name)) {
                                 MapPropertyValue mapPropertyValue = (MapPropertyValue) value;
                                 InstanceProperties instancePropertyForMap = (InstanceProperties) mapPropertyValue.getMapValues();

                                 if (name.equals("additionalProperties")) {

                                       // Only support Map<String,String> as that is what is in the archive types at this time.
                                       Map<String, String> actualMap = new HashMap();
                                       Iterator iter = instancePropertyForMap.getPropertyNames();
                                       while (iter.hasNext()) {
                                           String mapkey = (String) iter.next();
                                           PrimitivePropertyValue primitivePropertyMapValue = (PrimitivePropertyValue) instancePropertyForMap.getPropertyValue(mapkey);
                                           String mapvalue = (String) primitivePropertyMapValue.getPrimitiveValue();
                                           actualMap.put(mapkey, mapvalue);
                                       }
                                       governanceControl.setAdditionalProperties(actualMap);
                                 }
                               }
                               break;
                        case ARRAY:
                        case STRUCT:
                        case UNKNOWN:
                            // error
                            break;
                    }

                }   // end while

                 // set classifications
                 List<org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.Classification> omrsclassifications = omrsEntityDetail.getClassifications() ;
                 if (omrsclassifications != null && !omrsclassifications.isEmpty()){
                    for (org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.Classification omrsClassification:omrsclassifications) {
                        String omrsClassificationName = omrsClassification.getName();
                        org.odpi.openmetadata.accessservices.subjectarea.properties.classifications.Classification omasClassification = ClassificationFactory.getClassification(omrsClassificationName,omrsClassification);
                        if (omasClassification !=null) {
                            // this is a classification we know about.
                            if ( governanceControl.classifications==null) {
                                 governanceControl.classifications = new ArrayList<>();
                            }
                            governanceControl.classifications.add(omasClassification);

                        } else {
                            if (null==governanceControl.getExtraClassifications())  {
                                 governanceControl.setExtraClassifications(new HashMap<String, org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.Classification>());
                            }
                            governanceControl.getExtraClassifications().put(omrsClassificationName,omrsClassification);
                        }
                    }
                 }
                 return governanceControl;
            } else {
                // TODO wrong entity type for this guid
            }
            return null;
    }
    /**
     * Map (convert) the supplied GovernanceControl to an entityDetail.
     * @param  governanceControl  supplied GovernanceControl
     * @return  entityDetail equivalent to governanceControl
     */
    static public EntityDetail mapGovernanceControlToOmrsEntityDetail(org.odpi.openmetadata.accessservices.subjectarea.generated.entities.GovernanceControl.GovernanceControl governanceControl) {
            EntityDetail omrsEntityDetail = new EntityDetail();
            SystemAttributes systemAttributes = governanceControl.getSystemAttributes();
            if (systemAttributes!=null) {
                   if (systemAttributes.getCreatedBy()!=null)
                        omrsEntityDetail.setCreatedBy(systemAttributes.getCreatedBy());
                   if (systemAttributes.getUpdatedBy()!=null)
                        omrsEntityDetail.setUpdatedBy(systemAttributes.getUpdatedBy());
                   if (systemAttributes.getCreateTime()!=null)
                        omrsEntityDetail.setCreateTime(systemAttributes.getCreateTime());
                   if (systemAttributes.getUpdateTime()!=null)
                        omrsEntityDetail.setUpdateTime(systemAttributes.getUpdateTime());
                   if (systemAttributes.getVersion()!=null)
                        omrsEntityDetail.setVersion(systemAttributes.getVersion());
                   if (systemAttributes.getGUID()!=null)
                        omrsEntityDetail.setGUID(systemAttributes.getGUID());
                   if (systemAttributes.getStatus()!=null) {
                        InstanceStatus instanceStatus = SubjectAreaUtils.convertStatusToStatusInstance(systemAttributes.getStatus());
                        omrsEntityDetail.setStatus(instanceStatus);
                   }
            }

            InstanceProperties instanceProperties = new InstanceProperties();
            // primitives

            if (governanceControl.getImplementationDescription()!=null) {
                PrimitivePropertyValue primitivePropertyValue = new PrimitivePropertyValue();
                primitivePropertyValue.setPrimitiveDefCategory(PrimitiveDefCategory.OM_PRIMITIVE_TYPE_STRING);
                primitivePropertyValue.setPrimitiveValue(governanceControl.getImplementationDescription());
                instanceProperties.setProperty("implementationDescription", primitivePropertyValue);
            }
            if (governanceControl.getTitle()!=null) {
                PrimitivePropertyValue primitivePropertyValue = new PrimitivePropertyValue();
                primitivePropertyValue.setPrimitiveDefCategory(PrimitiveDefCategory.OM_PRIMITIVE_TYPE_STRING);
                primitivePropertyValue.setPrimitiveValue(governanceControl.getTitle());
                instanceProperties.setProperty("title", primitivePropertyValue);
            }
            if (governanceControl.getSummary()!=null) {
                PrimitivePropertyValue primitivePropertyValue = new PrimitivePropertyValue();
                primitivePropertyValue.setPrimitiveDefCategory(PrimitiveDefCategory.OM_PRIMITIVE_TYPE_STRING);
                primitivePropertyValue.setPrimitiveValue(governanceControl.getSummary());
                instanceProperties.setProperty("summary", primitivePropertyValue);
            }
            if (governanceControl.getDescription()!=null) {
                PrimitivePropertyValue primitivePropertyValue = new PrimitivePropertyValue();
                primitivePropertyValue.setPrimitiveDefCategory(PrimitiveDefCategory.OM_PRIMITIVE_TYPE_STRING);
                primitivePropertyValue.setPrimitiveValue(governanceControl.getDescription());
                instanceProperties.setProperty("description", primitivePropertyValue);
            }
            if (governanceControl.getScope()!=null) {
                PrimitivePropertyValue primitivePropertyValue = new PrimitivePropertyValue();
                primitivePropertyValue.setPrimitiveDefCategory(PrimitiveDefCategory.OM_PRIMITIVE_TYPE_STRING);
                primitivePropertyValue.setPrimitiveValue(governanceControl.getScope());
                instanceProperties.setProperty("scope", primitivePropertyValue);
            }
            if (governanceControl.getPriority()!=null) {
                PrimitivePropertyValue primitivePropertyValue = new PrimitivePropertyValue();
                primitivePropertyValue.setPrimitiveDefCategory(PrimitiveDefCategory.OM_PRIMITIVE_TYPE_STRING);
                primitivePropertyValue.setPrimitiveValue(governanceControl.getPriority());
                instanceProperties.setProperty("priority", primitivePropertyValue);
            }
            if (governanceControl.getQualifiedName()!=null) {
                PrimitivePropertyValue primitivePropertyValue = new PrimitivePropertyValue();
                primitivePropertyValue.setPrimitiveDefCategory(PrimitiveDefCategory.OM_PRIMITIVE_TYPE_STRING);
                primitivePropertyValue.setPrimitiveValue(governanceControl.getQualifiedName());
                instanceProperties.setProperty("qualifiedName", primitivePropertyValue);
            }
            if (governanceControl.getDomain()!=null) {
                GovernanceDomain enumType = governanceControl.getDomain();
                EnumPropertyValue enumPropertyValue = new EnumPropertyValue();
                enumPropertyValue.setOrdinal(enumType.ordinal());
                enumPropertyValue.setSymbolicName(enumType.name());
                instanceProperties.setProperty("domain", enumPropertyValue);
            }
            if (governanceControl.getAdditionalProperties()!=null) {

                Map<String,String> map =governanceControl.getAdditionalProperties();
                MapPropertyValue mapPropertyValue = new MapPropertyValue();

                for (String key:map.keySet()) {
                   PrimitivePropertyValue primitivePropertyValue = new PrimitivePropertyValue();
                   primitivePropertyValue.setPrimitiveDefCategory(PrimitiveDefCategory.OM_PRIMITIVE_TYPE_STRING);
                   primitivePropertyValue.setPrimitiveValue(map.get(key));
                   mapPropertyValue.setMapValue(key,primitivePropertyValue);
                }

                instanceProperties.setProperty("additionalProperties", mapPropertyValue);
            }
            omrsEntityDetail.setProperties(instanceProperties);
            // set the type in the entity
            OMRSArchiveAccessor archiveAccessor = OMRSArchiveAccessor.getInstance();
            TypeDef typeDef = archiveAccessor.getEntityDefByName("GovernanceControl");
            InstanceType template = SubjectAreaUtils.createTemplateFromTypeDef(typeDef);
            InstanceType instanceType = new InstanceType(template);
            omrsEntityDetail.setType(instanceType);

            // map the classifications
            populateOmrsEntityWithBeanClassifications(omrsEntityDetail,(List<org.odpi.openmetadata.accessservices.subjectarea.properties.classifications.Classification>)governanceControl.getClassifications());
            return omrsEntityDetail;
    }

    private static void populateOmrsEntityWithBeanClassifications(EntityDetail omrsEntityDetail, List<org.odpi.openmetadata.accessservices.subjectarea.properties.classifications.Classification> beanClassifications) {
        if (beanClassifications!= null && beanClassifications.size()>0) {
            ArrayList<org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.Classification> omrsClassifications = new ArrayList<org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.Classification>();
            for (org.odpi.openmetadata.accessservices.subjectarea.properties.classifications.Classification beanClassification : beanClassifications) {
                SystemAttributes systemAttributes = beanClassification.getSystemAttributes();
                org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.Classification omrsClassification = new org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.Classification();

                if (systemAttributes != null) {
                    if (systemAttributes.getCreatedBy() != null)
                        omrsClassification.setCreatedBy(systemAttributes.getCreatedBy());
                    if (systemAttributes.getUpdatedBy() != null)
                        omrsClassification.setUpdatedBy(systemAttributes.getUpdatedBy());
                    if (systemAttributes.getCreateTime() != null)
                        omrsClassification.setCreateTime(systemAttributes.getCreateTime());
                    if (systemAttributes.getUpdateTime() != null)
                        omrsClassification.setUpdateTime(systemAttributes.getUpdateTime());
                    if (systemAttributes.getVersion() != null)
                        omrsClassification.setVersion(systemAttributes.getVersion());
                }
                // copy over the classification name
                omrsClassification.setName(beanClassification.getClassificationName());
                // copy over the classification properties
                omrsClassification.setProperties( beanClassification.obtainInstanceProperties());
                omrsClassifications.add(omrsClassification);
            }
            omrsEntityDetail.setClassifications(omrsClassifications);
        }
    }
}
