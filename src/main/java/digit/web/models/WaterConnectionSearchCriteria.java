package digit.web.models;

public class WaterConnectionSearchCriteria {
    private String tenantId;
    private String connectionNumber;
    private String status;

    // Constructors
    public WaterConnectionSearchCriteria() {}

    public WaterConnectionSearchCriteria(String tenantId, String connectionNumber, String status) {
        this.tenantId = tenantId;
        this.connectionNumber = connectionNumber;
        this.status = status;
    }

    // Getters and Setters
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getConnectionNumber() {
        return connectionNumber;
    }

    public void setConnectionNumber(String connectionNumber) {
        this.connectionNumber = connectionNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
