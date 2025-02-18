package digit.web.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * View
 */
@Validated
@jakarta.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2025-02-18T05:38:10.679553475+05:30[Asia/Kolkata]")
public class View   {
        @JsonProperty("contentType")

                private String contentType = null;

    /**
        * Get contentType
    * @return contentType
    **/
    @ApiModelProperty(value = "")
    
  public String getContentType() {
    return contentType;
    }

    public void setContentType(String contentType) {
    this.contentType = contentType;
    }

@Override
public boolean equals(java.lang.Object o) {
if (this == o) {
return true;
}
if (o == null || getClass() != o.getClass()) {
return false;
}
    View view = (View) o;
    return Objects.equals(this.contentType, view.contentType);
}

@Override
public int hashCode() {
return Objects.hash(contentType);
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class View {\n");

sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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
