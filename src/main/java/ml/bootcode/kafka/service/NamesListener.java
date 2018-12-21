package ml.bootcode.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import ml.bootcode.kafka.models.Names;
import ml.bootcode.kafka.streams.NamesStreams;

@Service
public class NamesListener {

	private static final Logger log = LoggerFactory.getLogger(NamesListener.class);

	@StreamListener(NamesStreams.INPUT)
	public void handleGreetings(@Payload Names names) {
		log.info("Received names: {}", names);
	}
}
