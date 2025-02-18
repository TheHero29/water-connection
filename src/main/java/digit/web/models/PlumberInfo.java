package digit.web.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import digit.web.models.AuditDetails;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * PlumberInfo
 */
@Validated
@jakarta.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2025-02-18T05:38:10.679553475+05:30[Asia/Kolkata]")
public class PlumberInfo   {
        @JsonProperty("additionalDetails")

                private Object additionalDetails = null;

        @JsonProperty("auditDetails")

          @Valid
                private AuditDetails auditDetails = null;

        @JsonProperty("correspondenceAddress")

        @Size(max=1024)         private String correspondenceAddress = null;

        @JsonProperty("fatherOrHusbandName")

        @Size(max=256)         private String fatherOrHusbandName = null;

        @JsonProperty("gender")

        @Size(max=256)         private String gender = null;

        @JsonProperty("id")

        @Size(max=256)         private String id = null;

        @JsonProperty("licenseNo")

        @Size(max=256)         private String licenseNo = null;

        @JsonProperty("mobileNumber")

        @Size(max=256)         private String mobileNumber = null;

        @JsonProperty("name")

        @Size(max=256)         private String name = null;

        @JsonProperty("relationship")

                private String relationship = null;

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
        * The current address of the owner for correspondence.
    * @return correspondenceAddress
    **/
    @ApiModelProperty(value = "The current address of the owner for correspondence.")
    
@Size(max=1024)   public String getCorrespondenceAddress() {
    return correspondenceAddress;
    }

    public void setCorrespondenceAddress(String correspondenceAddress) {
    this.correspondenceAddress = correspondenceAddress;
    }
    /**
        * Father or Husband name of the user.
    * @return fatherOrHusbandName
    **/
    @ApiModelProperty(value = "Father or Husband name of the user.")
    
@Size(max=256)   public String getFatherOrHusbandName() {
    return fatherOrHusbandName;
    }

    public void setFatherOrHusbandName(String fatherOrHusbandName) {
    this.fatherOrHusbandName = fatherOrHusbandName;
    }
    /**
        * Gender of the user.
    * @return gender
    **/
    @ApiModelProperty(value = "Gender of the user.")
    
@Size(max=256)   public String getGender() {
    return gender;
    }

    public void setGender(String gender) {
    this.gender = gender;
    }
    /**
        * The id of the user.
    * @return id
    **/
    @ApiModelProperty(value = "The id of the user.")
    
@Size(max=256)   public String getId() {
    return id;
    }

    public void setId(String id) {
    this.id = id;
    }
    /**
        * Plumber unique license number.
    * @return licenseNo
    **/
    @ApiModelProperty(value = "Plumber unique license number.")
    
@Size(max=256)   public String getLicenseNo() {
    return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
    this.licenseNo = licenseNo;
    }
    /**
        * MobileNumber of the user.
    * @return mobileNumber
    **/
    @ApiModelProperty(value = "MobileNumber of the user.")
    
@Size(max=256)   public String getMobileNumber() {
    return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    }
    /**
        * The name of the user.
    * @return name
    **/
    @ApiModelProperty(value = "The name of the user.")
    
@Size(max=256)   public String getName() {
    return name;
    }

    public void setName(String name) {
    this.name = name;
    }
    /**
        * The relationship of gaurdian.
    * @return relationship
    **/
    @ApiModelProperty(value = "The relationship of gaurdian.")
    
  public String getRelationship() {
    return relationship;
    }

    public void setRelationship(String relationship) {
    this.relationship = relationship;
    }

@Override
public boolean equals(java.lang.Object o) {
if (this == o) {
return true;
}
if (o == null || getClass() != o.getClass()) {
return false;
}
    PlumberInfo plumberInfo = (PlumberInfo) o;
    return Objects.equals(this.additionalDetails, plumberInfo.additionalDetails) &&
    Objects.equals(this.auditDetails, plumberInfo.auditDetails) &&
    Objects.equals(this.correspondenceAddress, plumberInfo.correspondenceAddress) &&
    Objects.equals(this.fatherOrHusbandName, plumberInfo.fatherOrHusbandName) &&
    Objects.equals(this.gender, plumberInfo.gender) &&
    Objects.equals(this.id, plumberInfo.id) &&
    Objects.equals(this.licenseNo, plumberInfo.licenseNo) &&
    Objects.equals(this.mobileNumber, plumberInfo.mobileNumber) &&
    Objects.equals(this.name, plumberInfo.name) &&
    Objects.equals(this.relationship, plumberInfo.relationship);
}

@Override
public int hashCode() {
return Objects.hash(additionalDetails, auditDetails, correspondenceAddress, fatherOrHusbandName, gender, id, licenseNo, mobileNumber, name, relationship);
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class PlumberInfo {\n");

sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
sb.append("    auditDetails: ").append(toIndentedString(auditDetails)).append("\n");
sb.append("    correspondenceAddress: ").append(toIndentedString(correspondenceAddress)).append("\n");
sb.append("    fatherOrHusbandName: ").append(toIndentedString(fatherOrHusbandName)).append("\n");
sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
sb.append("    id: ").append(toIndentedString(id)).append("\n");
sb.append("    licenseNo: ").append(toIndentedString(licenseNo)).append("\n");
sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
sb.append("    name: ").append(toIndentedString(name)).append("\n");
sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
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
