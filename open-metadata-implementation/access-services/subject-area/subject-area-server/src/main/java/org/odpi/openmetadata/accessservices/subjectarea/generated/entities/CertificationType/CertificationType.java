/* SPDX-License-Identifier: Apache-2.0 */

// This is a generated file - do not edit - changes should be made to the templates amd/or generator to generate this file with changes.

package org.odpi.openmetadata.accessservices.subjectarea.generated.entities.CertificationType;

import java.io.Serializable;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.odpi.openmetadata.accessservices.subjectarea.properties.objects.common.SystemAttributes;
import org.odpi.openmetadata.accessservices.subjectarea.ffdc.exceptions.InvalidParameterException;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;

// omrs
import org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.EnumPropertyValue;
import org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.InstanceProperties;
import org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.MapPropertyValue;
import org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.PrimitivePropertyValue;
// omrs bean
import org.odpi.openmetadata.accessservices.subjectarea.properties.classifications.Classification;
import org.odpi.openmetadata.accessservices.subjectarea.properties.enums.*;

/**
 * CertificationType entity in the Subject Area OMAS.
   A specific type of certification required by a regulation.
 */
@JsonAutoDetect(getterVisibility=PUBLIC_ONLY, setterVisibility=PUBLIC_ONLY, fieldVisibility=NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class  CertificationType implements Serializable {
    private static final Logger log = LoggerFactory.getLogger(CertificationType.class);
    private static final String className = CertificationType.class.getName();
    private SystemAttributes systemAttributes = null;
    List<Classification> classifications = null;

    private Map<String, Object> extraAttributes =null;
    private Map<String, org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.Classification> extraClassifications =null;


    /**
     * Get the system attributes
     * @return
     */
    public SystemAttributes getSystemAttributes() {
        return systemAttributes;
    }

    public void setSystemAttributes(SystemAttributes systemAttributes) {
        this.systemAttributes = systemAttributes;
    }

    // attributes
    public static final String[] PROPERTY_NAMES_SET_VALUES = new String[] {
        "details",
        "title",
        "summary",
        "description",
        "scope",
        "domain",
        "priority",
        "implications",
        "outcomes",
        "results",
        "qualifiedName",
        "additionalProperties",

    // Terminate the list
        null
    };
    public static final String[] ATTRIBUTE_NAMES_SET_VALUES = new String[] {
        "details",
        "title",
        "summary",
        "description",
        "scope",
        "priority",
        "implications",
        "outcomes",
        "results",
        "qualifiedName",

     // Terminate the list
        null
    };
    public static final String[] ENUM_NAMES_SET_VALUES = new String[] {
         "domain",

         // Terminate the list
          null
    };
    public static final String[] MAP_NAMES_SET_VALUES = new String[] {
         "additionalProperties",

         // Terminate the list
         null
    };
    public static final java.util.Set<String> PROPERTY_NAMES_SET = new HashSet(new HashSet<>(Arrays.asList(PROPERTY_NAMES_SET_VALUES)));
    public static final java.util.Set<String> ATTRIBUTE_NAMES_SET = new HashSet(new HashSet<>(Arrays.asList(ATTRIBUTE_NAMES_SET_VALUES)));
    public static final java.util.Set<String> ENUM_NAMES_SET = new HashSet(new HashSet<>(Arrays.asList(ENUM_NAMES_SET_VALUES)));
    public static final java.util.Set<String> MAP_NAMES_SET = new HashSet(new HashSet<>(Arrays.asList(MAP_NAMES_SET_VALUES)));


    InstanceProperties obtainInstanceProperties() {
        final String methodName = "obtainInstanceProperties";
        if (log.isDebugEnabled()) {
               log.debug("==> Method: " + methodName);
        }
        InstanceProperties instanceProperties = new InstanceProperties();
        EnumPropertyValue enumPropertyValue=null;
        enumPropertyValue = new EnumPropertyValue();
        // governance domain for this governance definition.
        enumPropertyValue.setOrdinal(domain.ordinal());
        enumPropertyValue.setSymbolicName(domain.name());
        instanceProperties.setProperty("domain",enumPropertyValue);
        MapPropertyValue mapPropertyValue=null;
        // Additional properties for the element.
        mapPropertyValue = new MapPropertyValue();
        PrimitivePropertyValue primitivePropertyValue=null;
        primitivePropertyValue = new PrimitivePropertyValue();
        primitivePropertyValue.setPrimitiveValue(details);
        instanceProperties.setProperty("details",primitivePropertyValue);
        primitivePropertyValue = new PrimitivePropertyValue();
        primitivePropertyValue.setPrimitiveValue(title);
        instanceProperties.setProperty("title",primitivePropertyValue);
        primitivePropertyValue = new PrimitivePropertyValue();
        primitivePropertyValue.setPrimitiveValue(summary);
        instanceProperties.setProperty("summary",primitivePropertyValue);
        primitivePropertyValue = new PrimitivePropertyValue();
        primitivePropertyValue.setPrimitiveValue(description);
        instanceProperties.setProperty("description",primitivePropertyValue);
        primitivePropertyValue = new PrimitivePropertyValue();
        primitivePropertyValue.setPrimitiveValue(scope);
        instanceProperties.setProperty("scope",primitivePropertyValue);
        primitivePropertyValue = new PrimitivePropertyValue();
        primitivePropertyValue.setPrimitiveValue(priority);
        instanceProperties.setProperty("priority",primitivePropertyValue);
        primitivePropertyValue = new PrimitivePropertyValue();
        primitivePropertyValue.setPrimitiveValue(implications);
        instanceProperties.setProperty("implications",primitivePropertyValue);
        primitivePropertyValue = new PrimitivePropertyValue();
        primitivePropertyValue.setPrimitiveValue(outcomes);
        instanceProperties.setProperty("outcomes",primitivePropertyValue);
        primitivePropertyValue = new PrimitivePropertyValue();
        primitivePropertyValue.setPrimitiveValue(results);
        instanceProperties.setProperty("results",primitivePropertyValue);
        primitivePropertyValue = new PrimitivePropertyValue();
        primitivePropertyValue.setPrimitiveValue(qualifiedName);
        instanceProperties.setProperty("qualifiedName",primitivePropertyValue);
        if (log.isDebugEnabled()) {
               log.debug("<== Method: " + methodName);
        }
        return instanceProperties;
    }

       private String details;
       /**
        * Description of the requirements associated with the certification.
        * @return String
        */
       public String getDetails() {
           return this.details;
       }
       public void setDetails(String details)  {
           this.details = details;
       }
       private String title;
       /**
        * Title describing the governance definition.
        * @return String
        */
       public String getTitle() {
           return this.title;
       }
       public void setTitle(String title)  {
           this.title = title;
       }
       private String summary;
       /**
        * Short summary of the governance definition.
        * @return String
        */
       public String getSummary() {
           return this.summary;
       }
       public void setSummary(String summary)  {
           this.summary = summary;
       }
       private String description;
       /**
        * Detailed description of the governance definition.
        * @return String
        */
       public String getDescription() {
           return this.description;
       }
       public void setDescription(String description)  {
           this.description = description;
       }
       private String scope;
       /**
        * Scope of impact for this governance definition.
        * @return String
        */
       public String getScope() {
           return this.scope;
       }
       public void setScope(String scope)  {
           this.scope = scope;
       }
       private GovernanceDomain domain;
       /**
        * Governance domain for this governance definition.
        * @return GovernanceDomain
        */
       public GovernanceDomain getDomain() {
           return this.domain;
       }
       public void setDomain(GovernanceDomain domain)  {
           this.domain = domain;
       }
       private String priority;
       /**
        * Relative importance of this governance definition compared to its peers.
        * @return String
        */
       public String getPriority() {
           return this.priority;
       }
       public void setPriority(String priority)  {
           this.priority = priority;
       }
       private List<String> implications;
       /**
        * Impact on the organization, people and services when adopting the recommendation in this governance definition.
        * @return List<String>
        */
       public List<String> getImplications() {
           return this.implications;
       }
       public void setImplications(List<String> implications)  {
           this.implications = implications;
       }
       private List<String> outcomes;
       /**
        * Expected outcomes.
        * @return List<String>
        */
       public List<String> getOutcomes() {
           return this.outcomes;
       }
       public void setOutcomes(List<String> outcomes)  {
           this.outcomes = outcomes;
       }
       private List<String> results;
       /**
        * Actual results.
        * @return List<String>
        */
       public List<String> getResults() {
           return this.results;
       }
       public void setResults(List<String> results)  {
           this.results = results;
       }
       private String qualifiedName;
       /**
        * Unique identifier for the entity.
        * @return String
        */
       public String getQualifiedName() {
           return this.qualifiedName;
       }
       public void setQualifiedName(String qualifiedName)  {
           this.qualifiedName = qualifiedName;
       }
       private Map<String,String> additionalProperties;
       /**
        * Additional properties for the element.
        * @return Map<String,String>
        */
       public Map<String,String> getAdditionalProperties() {
           return this.additionalProperties;
       }
       public void setAdditionalProperties(Map<String,String> additionalProperties)  {
           this.additionalProperties = additionalProperties;
       }

    public void setExtraAttributes(Map<String, Object> extraAttributes) {
        this.extraAttributes = extraAttributes;
    }

    public void setClassifications(List<Classification> classifications) {
        this.classifications = classifications;
    }

    /**
     * Get the extra attributes - ones that are in addition to the standard types.
     * @return
     */
    public Map<String, Object> getExtraAttributes() {
        return extraAttributes;
    }

     /**
     * Classifications
     * @return
     */
    public List<Classification> getClassifications() {
        return classifications;
    }
    /**
      * Extra classifications are classifications that are not in the open metadata model - we include the OMRS Classifications.
      */
    public Map<String, org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.Classification> getExtraClassifications() {
        return extraClassifications;
    }

    public void setExtraClassifications(Map<String, org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.Classification> extraClassifications) {
        this.extraClassifications = extraClassifications;
    }

    public StringBuilder toString(StringBuilder sb) {
        if (sb == null) {
            sb = new StringBuilder();
        }

        sb.append("CertificationType{");
        if (systemAttributes !=null) {
            sb.append("systemAttributes='").append(systemAttributes.toString()).append('\'');
        }
        sb.append("CertificationType Attributes{");
    	sb.append("Details=" +this.details);
    	sb.append("Title=" +this.title);
    	sb.append("Summary=" +this.summary);
    	sb.append("Description=" +this.description);
    	sb.append("Scope=" +this.scope);
    	sb.append("Domain=" +this.domain);
    	sb.append("Priority=" +this.priority);
    	sb.append("Implications=" +this.implications);
    	sb.append("Outcomes=" +this.outcomes);
    	sb.append("Results=" +this.results);
    	sb.append("QualifiedName=" +this.qualifiedName);
    	sb.append("AdditionalProperties=" +this.additionalProperties);

        sb.append('}');
        if (classifications != null) {
        sb.append(", classifications=[");
            for (Classification classification:classifications) {
                sb.append(classification.toString()).append(", ");
            }
            sb.append(" ],");
        }
        sb.append(", extraAttributes=[");
        if (extraAttributes !=null) {
            for (String attrname: extraAttributes.keySet()) {
                sb.append(attrname).append(":");
                sb.append(extraAttributes.get(attrname)).append(", ");
            }
        }
        sb.append(" ]");

        sb.append('}');

        return sb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        if (!super.equals(o)) { return false; }

        CertificationType that = (CertificationType) o;
        if (this.details != null && !Objects.equals(this.details,that.getDetails())) {
             return false;
        }
        if (this.title != null && !Objects.equals(this.title,that.getTitle())) {
             return false;
        }
        if (this.summary != null && !Objects.equals(this.summary,that.getSummary())) {
             return false;
        }
        if (this.description != null && !Objects.equals(this.description,that.getDescription())) {
             return false;
        }
        if (this.scope != null && !Objects.equals(this.scope,that.getScope())) {
             return false;
        }
        if (this.domain != null && !Objects.equals(this.domain,that.getDomain())) {
             return false;
        }
        if (this.priority != null && !Objects.equals(this.priority,that.getPriority())) {
             return false;
        }
        if (this.implications != null && !Objects.equals(this.implications,that.getImplications())) {
             return false;
        }
        if (this.outcomes != null && !Objects.equals(this.outcomes,that.getOutcomes())) {
             return false;
        }
        if (this.results != null && !Objects.equals(this.results,that.getResults())) {
             return false;
        }
        if (this.qualifiedName != null && !Objects.equals(this.qualifiedName,that.getQualifiedName())) {
             return false;
        }
        if (this.additionalProperties != null && !Objects.equals(this.additionalProperties,that.getAdditionalProperties())) {
             return false;
        }

        // We view certificationTypes as logically equal by checking the properties that the OMAS knows about - i.e. without accounting for extra attributes and references from the org.odpi.openmetadata.accessservices.subjectarea.server.
        return Objects.equals(systemAttributes, that.systemAttributes) &&
                Objects.equals(classifications, that.classifications) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),
         systemAttributes.hashCode(),
         classifications.hashCode()
          , this.details
          , this.title
          , this.summary
          , this.description
          , this.scope
          , this.domain
          , this.priority
          , this.implications
          , this.outcomes
          , this.results
          , this.qualifiedName
          , this.additionalProperties
        );
    }

    @Override
    public String toString() {
        return toString(new StringBuilder()).toString();
    }
}
