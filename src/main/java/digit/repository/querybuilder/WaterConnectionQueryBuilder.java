package digit.repository.querybuilder;

import digit.web.models.WaterConnectionSearchCriteria;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WaterConnectionQueryBuilder {

    private static final String BASE_WC_QUERY = "SELECT * FROM water_connection wc";

    public String getWaterConnectionSearchQuery(WaterConnectionSearchCriteria searchCriteria, List<Object> params) {
        StringBuilder query = new StringBuilder(BASE_WC_QUERY);

        boolean whereAdded = false;
        whereAdded = addClauseIfRequired(query, "wc.connection_number", searchCriteria.getConnectionNumber(), whereAdded, params);
        whereAdded = addClauseIfRequired(query, "wc.status", searchCriteria.getStatus(), whereAdded, params);
        whereAdded = addClauseIfRequired(query, "wc.tenant_id", searchCriteria.getTenantId(), whereAdded, params);

        return query.toString();
    }

    private boolean addClauseIfRequired(StringBuilder query, String column, Object value, boolean whereAdded, List<Object> params) {
        if (value != null) {
            if (!whereAdded) {
                query.append(" WHERE ");
            } else {
                query.append(" AND ");
            }
            query.append(column).append(" = ?");
            params.add(value);
            return true;
        }
        return whereAdded;
    }
}
