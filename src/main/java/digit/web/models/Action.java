package digit.web.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import digit.web.models.AuditDetails;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * A Object holds the basic data for a Trade License
 */
@Schema(description = "A Object holds the basic data for a Trade License")
@Validated
@jakarta.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2025-02-18T05:38:10.679553475+05:30[Asia/Kolkata]")
public class Action   {
        @JsonProperty("action")

        @Size(max=256)         private String action = null;

        @JsonProperty("auditDetails")

          @Valid
                private AuditDetails auditDetails = null;

        @JsonProperty("currentState")

        @Size(max=256)         private String currentState = null;

        @JsonProperty("nextState")

        @Size(max=256)         private String nextState = null;

        @JsonProperty("roles")

                private List<String> roles = null;

        @JsonProperty("tenantId")

        @Size(max=256)         private String tenantId = null;

        @JsonProperty("uuid")

        @Size(max=256)         private String uuid = null;

    /**
        * Get action
    * @return action
    **/
    @ApiModelProperty(value = "")
    
@Size(max=256)   public String getAction() {
    return action;
    }

    public void setAction(String action) {
    this.action = action;
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
        * Get currentState
    * @return currentState
    **/
    @ApiModelProperty(value = "")
    
@Size(max=256)   public String getCurrentState() {
    return currentState;
    }

    public void setCurrentState(String currentState) {
    this.currentState = currentState;
    }
    /**
        * Get nextState
    * @return nextState
    **/
    @ApiModelProperty(value = "")
    
@Size(max=256)   public String getNextState() {
    return nextState;
    }

    public void setNextState(String nextState) {
    this.nextState = nextState;
    }

        public Action addRolesItem(String rolesItem) {
            if (this.roles == null) {
            this.roles = new ArrayList<>();
            }
        this.roles.add(rolesItem);
        return this;
        }
    /**
        * Get roles
    * @return roles
    **/
    @ApiModelProperty(value = "")
    
  public List<String> getRoles() {
    return roles;
    }

    public void setRoles(List<String> roles) {
    this.roles = roles;
    }
    /**
        * Get tenantId
    * @return tenantId
    **/
    @ApiModelProperty(value = "")
    
@Size(max=256)   public String getTenantId() {
    return tenantId;
    }

    public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
    }
    /**
        * Get uuid
    * @return uuid
    **/
    @ApiModelProperty(value = "")
    
@Size(max=256)   public String getUuid() {
    return uuid;
    }

    public void setUuid(String uuid) {
    this.uuid = uuid;
    }

@Override
public boolean equals(java.lang.Object o) {
if (this == o) {
return true;
}
if (o == null || getClass() != o.getClass()) {
return false;
}
    Action action = (Action) o;
    return Objects.equals(this.action, action.action) &&
    Objects.equals(this.auditDetails, action.auditDetails) &&
    Objects.equals(this.currentState, action.currentState) &&
    Objects.equals(this.nextState, action.nextState) &&
    Objects.equals(this.roles, action.roles) &&
    Objects.equals(this.tenantId, action.tenantId) &&
    Objects.equals(this.uuid, action.uuid);
}

@Override
public int hashCode() {
return Objects.hash(action, auditDetails, currentState, nextState, roles, tenantId, uuid);
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class Action {\n");

sb.append("    action: ").append(toIndentedString(action)).append("\n");
sb.append("    auditDetails: ").append(toIndentedString(auditDetails)).append("\n");
sb.append("    currentState: ").append(toIndentedString(currentState)).append("\n");
sb.append("    nextState: ").append(toIndentedString(nextState)).append("\n");
sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
