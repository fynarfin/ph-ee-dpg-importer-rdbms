package org.mifos.pheedpgimporterrdbms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import java.util.Properties;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PhEeDpgImporterRdbmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhEeDpgImporterRdbmsApplication.class, args);


//        try {
//            Properties props = new Properties();
//            props.put(StreamsConfig.APPLICATION_ID_CONFIG, "basic-consumer");
//            props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//            props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
//            props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());
//
//
//            // Build the topology
//            StreamsBuilder builder = new StreamsBuilder();
//            KStream<String, String> source = builder.stream("conductor", Consumed.with(Serdes.String(), Serdes.String()));
//
//            // Process the stream
//            source.foreach((key, value) -> {
//                System.out.println("Received message: Key = " + key + ", Value = " + value);
//            });
//
//            // Create and start the KafkaStreams instance
//            KafkaStreams streams = new KafkaStreams(builder.build(), props);
//            streams.start();
//
//            Thread.sleep(10000); // Add a delay to allow time for assignment
//            System.out.println("Assigned partitions: " + streams.allMetadataForStore("your-store-name"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

}
