package digit.web.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * PlainAccessRequest
 */
@Validated
@jakarta.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2025-02-18T05:38:10.679553475+05:30[Asia/Kolkata]")
public class PlainAccessRequest   {
        @JsonProperty("plainRequestFields")

                private List<String> plainRequestFields = null;

        @JsonProperty("recordId")

                private String recordId = null;


        public PlainAccessRequest addPlainRequestFieldsItem(String plainRequestFieldsItem) {
            if (this.plainRequestFields == null) {
            this.plainRequestFields = new ArrayList<>();
            }
        this.plainRequestFields.add(plainRequestFieldsItem);
        return this;
        }
    /**
        * Get plainRequestFields
    * @return plainRequestFields
    **/
    @ApiModelProperty(value = "")
    
  public List<String> getPlainRequestFields() {
    return plainRequestFields;
    }

    public void setPlainRequestFields(List<String> plainRequestFields) {
    this.plainRequestFields = plainRequestFields;
    }
    /**
        * Get recordId
    * @return recordId
    **/
    @ApiModelProperty(value = "")
    
  public String getRecordId() {
    return recordId;
    }

    public void setRecordId(String recordId) {
    this.recordId = recordId;
    }

@Override
public boolean equals(java.lang.Object o) {
if (this == o) {
return true;
}
if (o == null || getClass() != o.getClass()) {
return false;
}
    PlainAccessRequest plainAccessRequest = (PlainAccessRequest) o;
    return Objects.equals(this.plainRequestFields, plainAccessRequest.plainRequestFields) &&
    Objects.equals(this.recordId, plainAccessRequest.recordId);
}

@Override
public int hashCode() {
return Objects.hash(plainRequestFields, recordId);
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class PlainAccessRequest {\n");

sb.append("    plainRequestFields: ").append(toIndentedString(plainRequestFields)).append("\n");
sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
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
