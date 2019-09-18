package org.envirocar.trackcount.kafka;

import org.envirocar.trackcount.JsonConstants;
import org.envirocar.trackcount.model.FeatureCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaTrackListener {
    private static final Logger LOG = LoggerFactory.getLogger(KafkaTrackListener.class);

    @Autowired
    public KafkaTrackListener() {
    }

    @KafkaListener(topics = "tracks")
    public void onNewTrack(FeatureCollection track) {
        String id = track.getProperties().path(JsonConstants.ID).textValue();
        LOG.info("Received track {}", id);
    }
}
