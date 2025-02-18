package validators;

import digit.web.models.WaterConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import digit.repository.WaterConnectionRepository;
import digit.exception.CustomException;
import digit.util.ObjectUtils;
import digit.web.models.WaterConnectionRequest;

@Component
public class WaterConnectionValidator {

    @Autowired
    private WaterConnectionRepository repository;

    // Validate the water connection request
    public void validate(WaterConnectionRequest waterConnectionRequest) {
        waterConnectionRequest.getWaterConnectionApplications().forEach(application -> {
            // Check if tenantId is empty
            if (ObjectUtils.isEmpty(application.getTenantId())) {
                throw new CustomException("EG_WC_APP_ERR", "tenantId is mandatory for creating water connection applications");
            }
        });
    }

    // Optional method to validate application existence
    public WaterConnection validateApplicationExistence(WaterConnection waterConnectionApplication) {
        return repository.getApplications(WaterConnectionSearchCriteria.builder()
                .applicationNumber(waterConnectionApplication.getApplicationNumber())
                .build()).get(0);
    }
}
