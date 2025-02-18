package enrichment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import digit.util.IdgenUtil;
import digit.web.models.WaterConnectionRequest;
import digit.web.models.WaterConnection;
import digit.web.models.AuditDetails;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.UUID;

@Component
@Slf4j
public class WaterConnectionEnrichment {

    @Autowired
    private IdgenUtil idgenUtil;

    // Enrich water connection request with system-generated values like UUID and audit details
    public void enrich(WaterConnectionRequest waterConnectionRequest) {
        List<String> waterConnectionIdList = idgenUtil.getIdList(
                waterConnectionRequest.getRequestInfo(),
                waterConnectionRequest.getWaterConnection().getTenantId(),
                "wc.connectionid", "",
                waterConnectionRequest.getWaterConnection().getConnectionHolders().size()
        );

        Integer index = 0;
        WaterConnection application = waterConnectionRequest.getWaterConnection();
            AuditDetails auditDetails = new AuditDetails()
                    .createdBy(waterConnectionRequest.getRequestInfo().getUserInfo().getUuid())
                    .createdTime(System.currentTimeMillis())
                    .lastModifiedBy(waterConnectionRequest.getRequestInfo().getUserInfo().getUuid())
                    .lastModifiedTime(System.currentTimeMillis())
                    .build();
            application.setAuditDetails(auditDetails);
            application.setId(UUID.randomUUID().toString());
            application.setApplicationNumber(waterConnectionIdList.get(index++));
            application.getAddress().setApplicationNumber(application.getId());
            application.getAddress().setId(UUID.randomUUID().toString());
        }


    // Update audit details and last modified time when water connection is updated
    public void enrichWaterConnectionUponUpdate(WaterConnectionRequest waterConnectionRequest) {
        waterConnectionRequest.getWaterConnectionApplications().get(0).getAuditDetails()
                .setLastModifiedTime(System.currentTimeMillis());
        waterConnectionRequest.getWaterConnectionApplications().get(0).getAuditDetails()
                .setLastModifiedBy(waterConnectionRequest.getRequestInfo().getUserInfo().getUuid());
    }
}
