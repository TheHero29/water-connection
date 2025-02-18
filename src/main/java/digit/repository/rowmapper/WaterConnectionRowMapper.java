package digit.repository.rowmapper;

import digit.web.models.AuditDetails;
import digit.web.models.WaterConnection;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class WaterConnectionRowMapper implements ResultSetExtractor<List<WaterConnection>> {
    @Override
    public List<WaterConnection> extractData(ResultSet rs) throws SQLException {
        List<WaterConnection> waterConnections = new ArrayList<>();
        while (rs.next()) {
            WaterConnection waterConnection = new WaterConnection();
            waterConnection.setId(rs.getString("id"));
            waterConnection.setTenantId(rs.getString("tenantId"));

            AuditDetails auditDetails = new AuditDetails();
            auditDetails.setCreatedBy(rs.getString("createdBy"));
            auditDetails.setCreatedTime(rs.getTimestamp("createdTime").getTime());
            auditDetails.setLastModifiedBy(rs.getString("lastModifiedBy"));
            auditDetails.setLastModifiedTime(rs.getTimestamp("lastModifiedTime").getTime());
            waterConnection.setAuditDetails(auditDetails);

            waterConnections.add(waterConnection);
        }
        return waterConnections;
    }
}