package ml.bootcode.kafka.streams;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface NamesStreams {

	String INPUT = "names_in";
	String OUTPUT = "names_out";

	@Input(INPUT)
	SubscribableChannel inboundNames();

	@Output(OUTPUT)
	MessageChannel outboundNames();
}
