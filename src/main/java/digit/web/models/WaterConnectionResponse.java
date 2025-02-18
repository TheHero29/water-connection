package digit.web.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import digit.web.models.ResponseInfo;
import digit.web.models.WaterConnection;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * Contains the ResponseHeader and the created/updated property
 */
@Schema(description = "Contains the ResponseHeader and the created/updated property")
@Validated
@jakarta.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2025-02-18T05:38:10.679553475+05:30[Asia/Kolkata]")
public class WaterConnectionResponse   {
        @JsonProperty("ResponseInfo")

          @Valid
                private ResponseInfo responseInfo = null;

        @JsonProperty("TotalCount")

                private Integer totalCount = null;

        @JsonProperty("WaterConnection")
          @Valid
                private List<WaterConnection> waterConnection = null;

    /**
        * Get responseInfo
    * @return responseInfo
    **/
    @ApiModelProperty(value = "")
    
  @Valid
  public ResponseInfo getResponseInfo() {
    return responseInfo;
    }

    public void setResponseInfo(ResponseInfo responseInfo) {
    this.responseInfo = responseInfo;
    }
    /**
        * Get totalCount
    * @return totalCount
    **/
    @ApiModelProperty(value = "")
    
  public Integer getTotalCount() {
    return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
    }

        public WaterConnectionResponse addWaterConnectionItem(WaterConnection waterConnectionItem) {
            if (this.waterConnection == null) {
            this.waterConnection = new ArrayList<>();
            }
        this.waterConnection.add(waterConnectionItem);
        return this;
        }
    /**
        * Get waterConnection
    * @return waterConnection
    **/
    @ApiModelProperty(value = "")
      @Valid
  public List<WaterConnection> getWaterConnection() {
    return waterConnection;
    }

    public void setWaterConnection(List<WaterConnection> waterConnection) {
    this.waterConnection = waterConnection;
    }

@Override
public boolean equals(java.lang.Object o) {
if (this == o) {
return true;
}
if (o == null || getClass() != o.getClass()) {
return false;
}
    WaterConnectionResponse waterConnectionResponse = (WaterConnectionResponse) o;
    return Objects.equals(this.responseInfo, waterConnectionResponse.responseInfo) &&
    Objects.equals(this.totalCount, waterConnectionResponse.totalCount) &&
    Objects.equals(this.waterConnection, waterConnectionResponse.waterConnection);
}

@Override
public int hashCode() {
return Objects.hash(responseInfo, totalCount, waterConnection);
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class WaterConnectionResponse {\n");

sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
sb.append("    waterConnection: ").append(toIndentedString(waterConnection)).append("\n");
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
