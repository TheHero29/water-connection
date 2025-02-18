package digit.web.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import digit.web.models.AuditDetails;
import digit.web.models.Document;
import digit.web.models.OwnerInfo;
import digit.web.models.PlumberInfo;
import digit.web.models.ProcessInstance;
import digit.web.models.RoadCuttingInfo;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * This is lightweight property object that can be used as reference by definitions needing property linking. Actual Property Object extends this to include more elaborate attributes of the property.
 */
@Schema(description = "This is lightweight property object that can be used as reference by definitions needing property linking. Actual Property Object extends this to include more elaborate attributes of the property.")
@Validated
@jakarta.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2025-02-18T05:38:10.679553475+05:30[Asia/Kolkata]")
public class WaterConnection   {
        @JsonProperty("additionalDetails")

                private Object additionalDetails = null;

        @JsonProperty("applicationNo")

        @Size(min=1,max=64)         private String applicationNo = null;

        @JsonProperty("applicationStatus")

                private String applicationStatus = null;

        @JsonProperty("applicationType")

                private String applicationType = null;

        @JsonProperty("auditDetails")

          @Valid
                private AuditDetails auditDetails = null;

        @JsonProperty("channel")

                private String channel = null;

        @JsonProperty("connectionCategory")
          @NotNull

        @Size(min=2,max=32)         private String connectionCategory = null;

        @JsonProperty("connectionExecutionDate")

                private Long connectionExecutionDate = null;

        @JsonProperty("connectionHolders")
          @Valid
                private List<OwnerInfo> connectionHolders = null;

        @JsonProperty("connectionNo")

        @Size(min=1,max=64)         private String connectionNo = null;

        @JsonProperty("connectionType")
          @NotNull

        @Size(min=2,max=32)         private String connectionType = null;

        @JsonProperty("dateEffectiveFrom")

                private Long dateEffectiveFrom = null;

        @JsonProperty("disconnectionExecutionDate")

                private Long disconnectionExecutionDate = null;

        @JsonProperty("disconnectionReason")

                private String disconnectionReason = null;

        @JsonProperty("documents")
          @Valid
                private List<Document> documents = null;

        @JsonProperty("id")

        @Size(min=1,max=64)         private String id = null;

        @JsonProperty("isDisconnectionTemporary")

                private Boolean isDisconnectionTemporary = null;

        @JsonProperty("meterId")

                private String meterId = null;

        @JsonProperty("meterInstallationDate")

                private Long meterInstallationDate = null;

        @JsonProperty("noOfTaps")

                private Integer noOfTaps = null;

        @JsonProperty("oldApplication")

                private Boolean oldApplication = null;

        @JsonProperty("oldConnectionNo")

        @Size(min=1,max=64)         private String oldConnectionNo = null;

        @JsonProperty("pipeSize")

                private Double pipeSize = null;

        @JsonProperty("plumberInfo")
          @Valid
                private List<PlumberInfo> plumberInfo = null;

        @JsonProperty("processInstance")

          @Valid
                private ProcessInstance processInstance = null;

        @JsonProperty("propertyId")

                private String propertyId = null;

        @JsonProperty("proposedPipeSize")

                private Double proposedPipeSize = null;

        @JsonProperty("proposedTaps")

                private Integer proposedTaps = null;

        @JsonProperty("roadCuttingArea")

                private Float roadCuttingArea = null;

        @JsonProperty("roadCuttingInfo")
          @Valid
                private List<RoadCuttingInfo> roadCuttingInfo = null;

        @JsonProperty("roadType")

        @Size(min=2,max=32)         private String roadType = null;

            /**
            * Gets or Sets status
            */
            public enum StatusEnum {
                        ACTIVE("Active"),
                        
                        INACTIVE("Inactive");
            
            private String value;
            
            StatusEnum(String value) {
            this.value = value;
            }
            
            @Override
            @JsonValue
            public String toString() {
            return String.valueOf(value);
            }
            
            @JsonCreator
            public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
            return b;
            }
            }
            return null;
            }
            }        @JsonProperty("status")

                private StatusEnum status = null;

        @JsonProperty("tenantId")

        @Size(min=2,max=256)         private String tenantId = null;

        @JsonProperty("waterSource")

                private String waterSource = null;

    /**
        * Json object to capture any extra information which is not accommodated of model
    * @return additionalDetails
    **/
    @ApiModelProperty(value = "Json object to capture any extra information which is not accommodated of model")
    
  public Object getAdditionalDetails() {
    return additionalDetails;
    }

    public void setAdditionalDetails(Object additionalDetails) {
    this.additionalDetails = additionalDetails;
    }
    /**
        * Formatted application number, which will be generated using ID-Gen at the time .
    * @return applicationNo
    **/
    @ApiModelProperty(readOnly = true, value = "Formatted application number, which will be generated using ID-Gen at the time .")
    
@Size(min=1,max=64)   public String getApplicationNo() {
    return applicationNo;
    }

    public void setApplicationNo(String applicationNo) {
    this.applicationNo = applicationNo;
    }
    /**
        * Get applicationStatus
    * @return applicationStatus
    **/
    @ApiModelProperty(value = "")
    
  public String getApplicationStatus() {
    return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
    this.applicationStatus = applicationStatus;
    }
    /**
        * Get applicationType
    * @return applicationType
    **/
    @ApiModelProperty(readOnly = true, value = "")
    
  public String getApplicationType() {
    return applicationType;
    }

    public void setApplicationType(String applicationType) {
    this.applicationType = applicationType;
    }
    /**
        * Get auditDetails
    * @return auditDetails
    **/
    @ApiModelProperty(value = "")
    
  @Valid
  public AuditDetails getAuditDetails() {
    return auditDetails;
    }

    public void setAuditDetails(AuditDetails auditDetails) {
    this.auditDetails = auditDetails;
    }
    /**
        * Get channel
    * @return channel
    **/
    @ApiModelProperty(readOnly = true, value = "")
    
  public String getChannel() {
    return channel;
    }

    public void setChannel(String channel) {
    this.channel = channel;
    }
    /**
        * It is a master data, defined in MDMS
    * @return connectionCategory
    **/
    @ApiModelProperty(required = true, value = "It is a master data, defined in MDMS")
      @NotNull

@Size(min=2,max=32)   public String getConnectionCategory() {
    return connectionCategory;
    }

    public void setConnectionCategory(String connectionCategory) {
    this.connectionCategory = connectionCategory;
    }
    /**
        * Get connectionExecutionDate
    * @return connectionExecutionDate
    **/
    @ApiModelProperty(readOnly = true, value = "")
    
  public Long getConnectionExecutionDate() {
    return connectionExecutionDate;
    }

    public void setConnectionExecutionDate(Long connectionExecutionDate) {
    this.connectionExecutionDate = connectionExecutionDate;
    }

        public WaterConnection addConnectionHoldersItem(OwnerInfo connectionHoldersItem) {
            if (this.connectionHolders == null) {
            this.connectionHolders = new ArrayList<>();
            }
        this.connectionHolders.add(connectionHoldersItem);
        return this;
        }
    /**
        * The connection holder info will enter by employee or citizen
    * @return connectionHolders
    **/
    @ApiModelProperty(value = "The connection holder info will enter by employee or citizen")
      @Valid
  public List<OwnerInfo> getConnectionHolders() {
    return connectionHolders;
    }

    public void setConnectionHolders(List<OwnerInfo> connectionHolders) {
    this.connectionHolders = connectionHolders;
    }
    /**
        * Formatted connection number, which will be generated using ID-Gen service after aproval of connection application in case of new application. If the source of data is \"DATA_ENTRY\" then application status will be considered as \"APROVED\" application.
    * @return connectionNo
    **/
    @ApiModelProperty(readOnly = true, value = "Formatted connection number, which will be generated using ID-Gen service after aproval of connection application in case of new application. If the source of data is \"DATA_ENTRY\" then application status will be considered as \"APROVED\" application.")
    
@Size(min=1,max=64)   public String getConnectionNo() {
    return connectionNo;
    }

    public void setConnectionNo(String connectionNo) {
    this.connectionNo = connectionNo;
    }
    /**
        * It is a master data, defined in MDMS.
    * @return connectionType
    **/
    @ApiModelProperty(required = true, value = "It is a master data, defined in MDMS.")
      @NotNull

@Size(min=2,max=32)   public String getConnectionType() {
    return connectionType;
    }

    public void setConnectionType(String connectionType) {
    this.connectionType = connectionType;
    }
    /**
        * Get dateEffectiveFrom
    * @return dateEffectiveFrom
    **/
    @ApiModelProperty(readOnly = true, value = "")
    
  public Long getDateEffectiveFrom() {
    return dateEffectiveFrom;
    }

    public void setDateEffectiveFrom(Long dateEffectiveFrom) {
    this.dateEffectiveFrom = dateEffectiveFrom;
    }
    /**
        * Get disconnectionExecutionDate
    * @return disconnectionExecutionDate
    **/
    @ApiModelProperty(value = "")
    
  public Long getDisconnectionExecutionDate() {
    return disconnectionExecutionDate;
    }

    public void setDisconnectionExecutionDate(Long disconnectionExecutionDate) {
    this.disconnectionExecutionDate = disconnectionExecutionDate;
    }
    /**
        * Get disconnectionReason
    * @return disconnectionReason
    **/
    @ApiModelProperty(value = "")
    
  public String getDisconnectionReason() {
    return disconnectionReason;
    }

    public void setDisconnectionReason(String disconnectionReason) {
    this.disconnectionReason = disconnectionReason;
    }

        public WaterConnection addDocumentsItem(Document documentsItem) {
            if (this.documents == null) {
            this.documents = new ArrayList<>();
            }
        this.documents.add(documentsItem);
        return this;
        }
    /**
        * The documents attached by owner for exemption.
    * @return documents
    **/
    @ApiModelProperty(value = "The documents attached by owner for exemption.")
      @Valid
  public List<Document> getDocuments() {
    return documents;
    }

    public void setDocuments(List<Document> documents) {
    this.documents = documents;
    }
    /**
        * Unique Identifier of the connection for internal reference.
    * @return id
    **/
    @ApiModelProperty(readOnly = true, value = "Unique Identifier of the connection for internal reference.")
    
@Size(min=1,max=64)   public String getId() {
    return id;
    }

    public void setId(String id) {
    this.id = id;
    }
    /**
        * Get isDisconnectionTemporary
    * @return isDisconnectionTemporary
    **/
    @ApiModelProperty(value = "")
    
  public Boolean isisIsDisconnectionTemporary() {
    return isDisconnectionTemporary;
    }

    public void setIsDisconnectionTemporary(Boolean isDisconnectionTemporary) {
    this.isDisconnectionTemporary = isDisconnectionTemporary;
    }
    /**
        * Get meterId
    * @return meterId
    **/
    @ApiModelProperty(value = "")
    
  public String getMeterId() {
    return meterId;
    }

    public void setMeterId(String meterId) {
    this.meterId = meterId;
    }
    /**
        * Get meterInstallationDate
    * @return meterInstallationDate
    **/
    @ApiModelProperty(value = "")
    
  public Long getMeterInstallationDate() {
    return meterInstallationDate;
    }

    public void setMeterInstallationDate(Long meterInstallationDate) {
    this.meterInstallationDate = meterInstallationDate;
    }
    /**
        * Get noOfTaps
    * @return noOfTaps
    **/
    @ApiModelProperty(value = "")
    
  public Integer getNoOfTaps() {
    return noOfTaps;
    }

    public void setNoOfTaps(Integer noOfTaps) {
    this.noOfTaps = noOfTaps;
    }
    /**
        *  
    * @return oldApplication
    **/
    @ApiModelProperty(example = "false", value = " ")
    
  public Boolean isisOldApplication() {
    return oldApplication;
    }

    public void setOldApplication(Boolean oldApplication) {
    this.oldApplication = oldApplication;
    }
    /**
        * Mandatory if source is \"DATA_ENTRY\".
    * @return oldConnectionNo
    **/
    @ApiModelProperty(readOnly = true, value = "Mandatory if source is \"DATA_ENTRY\".")
    
@Size(min=1,max=64)   public String getOldConnectionNo() {
    return oldConnectionNo;
    }

    public void setOldConnectionNo(String oldConnectionNo) {
    this.oldConnectionNo = oldConnectionNo;
    }
    /**
        * Get pipeSize
    * @return pipeSize
    **/
    @ApiModelProperty(value = "")
    
  public Double getPipeSize() {
    return pipeSize;
    }

    public void setPipeSize(Double pipeSize) {
    this.pipeSize = pipeSize;
    }

        public WaterConnection addPlumberInfoItem(PlumberInfo plumberInfoItem) {
            if (this.plumberInfo == null) {
            this.plumberInfo = new ArrayList<>();
            }
        this.plumberInfo.add(plumberInfoItem);
        return this;
        }
    /**
        * The documents attached by owner for exemption.
    * @return plumberInfo
    **/
    @ApiModelProperty(value = "The documents attached by owner for exemption.")
      @Valid
  public List<PlumberInfo> getPlumberInfo() {
    return plumberInfo;
    }

    public void setPlumberInfo(List<PlumberInfo> plumberInfo) {
    this.plumberInfo = plumberInfo;
    }
    /**
        * Get processInstance
    * @return processInstance
    **/
    @ApiModelProperty(value = "")
    
  @Valid
  public ProcessInstance getProcessInstance() {
    return processInstance;
    }

    public void setProcessInstance(ProcessInstance processInstance) {
    this.processInstance = processInstance;
    }
    /**
        * UUID of the property.
    * @return propertyId
    **/
    @ApiModelProperty(value = "UUID of the property.")
    
  public String getPropertyId() {
    return propertyId;
    }

    public void setPropertyId(String propertyId) {
    this.propertyId = propertyId;
    }
    /**
        * Get proposedPipeSize
    * @return proposedPipeSize
    **/
    @ApiModelProperty(value = "")
    
  public Double getProposedPipeSize() {
    return proposedPipeSize;
    }

    public void setProposedPipeSize(Double proposedPipeSize) {
    this.proposedPipeSize = proposedPipeSize;
    }
    /**
        * Get proposedTaps
    * @return proposedTaps
    **/
    @ApiModelProperty(value = "")
    
  public Integer getProposedTaps() {
    return proposedTaps;
    }

    public void setProposedTaps(Integer proposedTaps) {
    this.proposedTaps = proposedTaps;
    }
    /**
        * Capture the road cutting area in sqft.
    * @return roadCuttingArea
    **/
    @ApiModelProperty(value = "Capture the road cutting area in sqft.")
    
  public Float getRoadCuttingArea() {
    return roadCuttingArea;
    }

    public void setRoadCuttingArea(Float roadCuttingArea) {
    this.roadCuttingArea = roadCuttingArea;
    }

        public WaterConnection addRoadCuttingInfoItem(RoadCuttingInfo roadCuttingInfoItem) {
            if (this.roadCuttingInfo == null) {
            this.roadCuttingInfo = new ArrayList<>();
            }
        this.roadCuttingInfo.add(roadCuttingInfoItem);
        return this;
        }
    /**
        * The road cutting information given by owner
    * @return roadCuttingInfo
    **/
    @ApiModelProperty(value = "The road cutting information given by owner")
      @Valid
  public List<RoadCuttingInfo> getRoadCuttingInfo() {
    return roadCuttingInfo;
    }

    public void setRoadCuttingInfo(List<RoadCuttingInfo> roadCuttingInfo) {
    this.roadCuttingInfo = roadCuttingInfo;
    }
    /**
        * It is a master data, defined in MDMS. If road cutting is required to established the connection then we need to capture the details of road type.
    * @return roadType
    **/
    @ApiModelProperty(value = "It is a master data, defined in MDMS. If road cutting is required to established the connection then we need to capture the details of road type.")
    
@Size(min=2,max=32)   public String getRoadType() {
    return roadType;
    }

    public void setRoadType(String roadType) {
    this.roadType = roadType;
    }
    /**
        * Get status
    * @return status
    **/
    @ApiModelProperty(value = "")
    
  public StatusEnum getStatus() {
    return status;
    }

    public void setStatus(StatusEnum status) {
    this.status = status;
    }
    /**
        * Unique ULB identifier.
    * @return tenantId
    **/
    @ApiModelProperty(value = "Unique ULB identifier.")
    
@Size(min=2,max=256)   public String getTenantId() {
    return tenantId;
    }

    public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
    }
    /**
        * Get waterSource
    * @return waterSource
    **/
    @ApiModelProperty(value = "")
    
  public String getWaterSource() {
    return waterSource;
    }

    public void setWaterSource(String waterSource) {
    this.waterSource = waterSource;
    }

@Override
public boolean equals(java.lang.Object o) {
if (this == o) {
return true;
}
if (o == null || getClass() != o.getClass()) {
return false;
}
    WaterConnection waterConnection = (WaterConnection) o;
    return Objects.equals(this.additionalDetails, waterConnection.additionalDetails) &&
    Objects.equals(this.applicationNo, waterConnection.applicationNo) &&
    Objects.equals(this.applicationStatus, waterConnection.applicationStatus) &&
    Objects.equals(this.applicationType, waterConnection.applicationType) &&
    Objects.equals(this.auditDetails, waterConnection.auditDetails) &&
    Objects.equals(this.channel, waterConnection.channel) &&
    Objects.equals(this.connectionCategory, waterConnection.connectionCategory) &&
    Objects.equals(this.connectionExecutionDate, waterConnection.connectionExecutionDate) &&
    Objects.equals(this.connectionHolders, waterConnection.connectionHolders) &&
    Objects.equals(this.connectionNo, waterConnection.connectionNo) &&
    Objects.equals(this.connectionType, waterConnection.connectionType) &&
    Objects.equals(this.dateEffectiveFrom, waterConnection.dateEffectiveFrom) &&
    Objects.equals(this.disconnectionExecutionDate, waterConnection.disconnectionExecutionDate) &&
    Objects.equals(this.disconnectionReason, waterConnection.disconnectionReason) &&
    Objects.equals(this.documents, waterConnection.documents) &&
    Objects.equals(this.id, waterConnection.id) &&
    Objects.equals(this.isDisconnectionTemporary, waterConnection.isDisconnectionTemporary) &&
    Objects.equals(this.meterId, waterConnection.meterId) &&
    Objects.equals(this.meterInstallationDate, waterConnection.meterInstallationDate) &&
    Objects.equals(this.noOfTaps, waterConnection.noOfTaps) &&
    Objects.equals(this.oldApplication, waterConnection.oldApplication) &&
    Objects.equals(this.oldConnectionNo, waterConnection.oldConnectionNo) &&
    Objects.equals(this.pipeSize, waterConnection.pipeSize) &&
    Objects.equals(this.plumberInfo, waterConnection.plumberInfo) &&
    Objects.equals(this.processInstance, waterConnection.processInstance) &&
    Objects.equals(this.propertyId, waterConnection.propertyId) &&
    Objects.equals(this.proposedPipeSize, waterConnection.proposedPipeSize) &&
    Objects.equals(this.proposedTaps, waterConnection.proposedTaps) &&
    Objects.equals(this.roadCuttingArea, waterConnection.roadCuttingArea) &&
    Objects.equals(this.roadCuttingInfo, waterConnection.roadCuttingInfo) &&
    Objects.equals(this.roadType, waterConnection.roadType) &&
    Objects.equals(this.status, waterConnection.status) &&
    Objects.equals(this.tenantId, waterConnection.tenantId) &&
    Objects.equals(this.waterSource, waterConnection.waterSource);
}

@Override
public int hashCode() {
return Objects.hash(additionalDetails, applicationNo, applicationStatus, applicationType, auditDetails, channel, connectionCategory, connectionExecutionDate, connectionHolders, connectionNo, connectionType, dateEffectiveFrom, disconnectionExecutionDate, disconnectionReason, documents, id, isDisconnectionTemporary, meterId, meterInstallationDate, noOfTaps, oldApplication, oldConnectionNo, pipeSize, plumberInfo, processInstance, propertyId, proposedPipeSize, proposedTaps, roadCuttingArea, roadCuttingInfo, roadType, status, tenantId, waterSource);
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class WaterConnection {\n");

sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
sb.append("    applicationNo: ").append(toIndentedString(applicationNo)).append("\n");
sb.append("    applicationStatus: ").append(toIndentedString(applicationStatus)).append("\n");
sb.append("    applicationType: ").append(toIndentedString(applicationType)).append("\n");
sb.append("    auditDetails: ").append(toIndentedString(auditDetails)).append("\n");
sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
sb.append("    connectionCategory: ").append(toIndentedString(connectionCategory)).append("\n");
sb.append("    connectionExecutionDate: ").append(toIndentedString(connectionExecutionDate)).append("\n");
sb.append("    connectionHolders: ").append(toIndentedString(connectionHolders)).append("\n");
sb.append("    connectionNo: ").append(toIndentedString(connectionNo)).append("\n");
sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
sb.append("    dateEffectiveFrom: ").append(toIndentedString(dateEffectiveFrom)).append("\n");
sb.append("    disconnectionExecutionDate: ").append(toIndentedString(disconnectionExecutionDate)).append("\n");
sb.append("    disconnectionReason: ").append(toIndentedString(disconnectionReason)).append("\n");
sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
sb.append("    id: ").append(toIndentedString(id)).append("\n");
sb.append("    isDisconnectionTemporary: ").append(toIndentedString(isDisconnectionTemporary)).append("\n");
sb.append("    meterId: ").append(toIndentedString(meterId)).append("\n");
sb.append("    meterInstallationDate: ").append(toIndentedString(meterInstallationDate)).append("\n");
sb.append("    noOfTaps: ").append(toIndentedString(noOfTaps)).append("\n");
sb.append("    oldApplication: ").append(toIndentedString(oldApplication)).append("\n");
sb.append("    oldConnectionNo: ").append(toIndentedString(oldConnectionNo)).append("\n");
sb.append("    pipeSize: ").append(toIndentedString(pipeSize)).append("\n");
sb.append("    plumberInfo: ").append(toIndentedString(plumberInfo)).append("\n");
sb.append("    processInstance: ").append(toIndentedString(processInstance)).append("\n");
sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
sb.append("    proposedPipeSize: ").append(toIndentedString(proposedPipeSize)).append("\n");
sb.append("    proposedTaps: ").append(toIndentedString(proposedTaps)).append("\n");
sb.append("    roadCuttingArea: ").append(toIndentedString(roadCuttingArea)).append("\n");
sb.append("    roadCuttingInfo: ").append(toIndentedString(roadCuttingInfo)).append("\n");
sb.append("    roadType: ").append(toIndentedString(roadType)).append("\n");
sb.append("    status: ").append(toIndentedString(status)).append("\n");
sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
sb.append("    waterSource: ").append(toIndentedString(waterSource)).append("\n");
sb.append("}");
return sb.toString();
}

/**
* Convert the given object to string with each line indented by 4 spaces
* (except the first line).
*/
private String toIndentedString(java.lang.Object o) {
if (o == null) {
return "null";
}
return o.toString().replace("\n", "\n    ");
}
}
