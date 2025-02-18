package service;

import digit.repository.WaterConnectionRepository;
import digit.web.models.WaterConnectionRequest;
import digit.web.models.WaterConnectionResponse;
import enrichment.WaterConnectionEnrichment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import validators.WaterConnectionValidator;

@Service
public class WaterConnectionService {

    @Autowired
    private WaterConnectionRepository repository;

    @Autowired
    private WaterConnectionValidator validator;

    @Autowired
    private WaterConnectionEnrichment enrichment;

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void createWaterConnection(WaterConnectionRequest request) {
        // Validate request
        validator.validate(request);

        // Enrich request data
        enrichment.enrich(request);

        // Push request to Kafka for persistence
        kafkaTemplate.send("water-connection-topic", request);

        repository.save(request);
    }

    public WaterConnectionResponse searchWaterConnection(String connectionId) {
        return repository.findById(connectionId).orElse(null);
    }

    public void updateWaterConnection(WaterConnectionRequest request) {
        // Validate request
        validator.validate(request);

        // Enrich request data
        enrichment.enrich(request);

        // Update existing record
        repository.save(request);

        // Push update to Kafka for persistence
        kafkaTemplate.send("water-connection-topic", request);
    }
}

