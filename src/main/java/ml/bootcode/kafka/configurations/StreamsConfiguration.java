package ml.bootcode.kafka.configurations;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

import ml.bootcode.kafka.streams.NamesStreams;

@Configuration
@EnableBinding(NamesStreams.class)
public class StreamsConfiguration {

}
