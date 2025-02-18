package digit.web.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import digit.web.models.RequestInfo;
import digit.web.models.WaterConnection;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


/**
 * Contract class to receive request. Array of Property items  are used in case of create . Where as single Property item is used for update
 */
@Schema(description = "Contract class to receive request. Array of Property items  are used in case of create . Where as single Property item is used for update")
@Validated
@jakarta.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2025-02-18T05:38:10.679553475+05:30[Asia/Kolkata]")
public class WaterConnectionRequest   {
        @JsonProperty("RequestInfo")

          @Valid
                private RequestInfo requestInfo = null;

        @JsonProperty("WaterConnection")

          @Valid
                private WaterConnection waterConnection = null;

        @JsonProperty("disconnectRequest")

                private Boolean disconnectRequest = null;

        @JsonProperty("isCreateCall")

                private Boolean isCreateCall = null;

        @JsonProperty("isOldDataEncryptionRequest")

                private Boolean isOldDataEncryptionRequest = null;

    /**
        * Get requestInfo
    * @return requestInfo
    **/
    @ApiModelProperty(value = "")
    
  @Valid
  public RequestInfo getRequestInfo() {
    return requestInfo;
    }

    public void setRequestInfo(RequestInfo requestInfo) {
    this.requestInfo = requestInfo;
    }
    /**
        * Get waterConnection
    * @return waterConnection
    **/
    @ApiModelProperty(value = "")
    
  @Valid
  public WaterConnection getWaterConnection() {
    return waterConnection;
    }

    public void setWaterConnection(WaterConnection waterConnection) {
    this.waterConnection = waterConnection;
    }
    /**
        * Get disconnectRequest
    * @return disconnectRequest
    **/
    @ApiModelProperty(value = "")
    
  public Boolean isisDisconnectRequest() {
    return disconnectRequest;
    }

    public void setDisconnectRequest(Boolean disconnectRequest) {
    this.disconnectRequest = disconnectRequest;
    }
    /**
        * Get isCreateCall
    * @return isCreateCall
    **/
    @ApiModelProperty(value = "")
    
  public Boolean isisIsCreateCall() {
    return isCreateCall;
    }

    public void setIsCreateCall(Boolean isCreateCall) {
    this.isCreateCall = isCreateCall;
    }
    /**
        * Get isOldDataEncryptionRequest
    * @return isOldDataEncryptionRequest
    **/
    @ApiModelProperty(value = "")
    
  public Boolean isisIsOldDataEncryptionRequest() {
    return isOldDataEncryptionRequest;
    }

    public void setIsOldDataEncryptionRequest(Boolean isOldDataEncryptionRequest) {
    this.isOldDataEncryptionRequest = isOldDataEncryptionRequest;
    }

@Override
public boolean equals(java.lang.Object o) {
if (this == o) {
return true;
}
if (o == null || getClass() != o.getClass()) {
return false;
}
    WaterConnectionRequest waterConnectionRequest = (WaterConnectionRequest) o;
    return Objects.equals(this.requestInfo, waterConnectionRequest.requestInfo) &&
    Objects.equals(this.waterConnection, waterConnectionRequest.waterConnection) &&
    Objects.equals(this.disconnectRequest, waterConnectionRequest.disconnectRequest) &&
    Objects.equals(this.isCreateCall, waterConnectionRequest.isCreateCall) &&
    Objects.equals(this.isOldDataEncryptionRequest, waterConnectionRequest.isOldDataEncryptionRequest);
}

@Override
public int hashCode() {
return Objects.hash(requestInfo, waterConnection, disconnectRequest, isCreateCall, isOldDataEncryptionRequest);
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class WaterConnectionRequest {\n");

sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
sb.append("    waterConnection: ").append(toIndentedString(waterConnection)).append("\n");
sb.append("    disconnectRequest: ").append(toIndentedString(disconnectRequest)).append("\n");
sb.append("    isCreateCall: ").append(toIndentedString(isCreateCall)).append("\n");
sb.append("    isOldDataEncryptionRequest: ").append(toIndentedString(isOldDataEncryptionRequest)).append("\n");
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
