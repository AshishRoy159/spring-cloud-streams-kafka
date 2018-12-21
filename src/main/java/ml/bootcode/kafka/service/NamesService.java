package ml.bootcode.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import ml.bootcode.kafka.models.Names;
import ml.bootcode.kafka.streams.NamesStreams;

@Service
public class NamesService {

	private final NamesStreams namesStreams;

	private static final Logger log = LoggerFactory.getLogger(NamesService.class);

	public NamesService(NamesStreams namesStreams) {
		this.namesStreams = namesStreams;
	}

	public void sendName(final Names names) {

		log.info("Sending name {}", names);

		MessageChannel messageChannel = namesStreams.outboundNames();
		messageChannel.send(MessageBuilder.withPayload(names)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build());
	}
}
