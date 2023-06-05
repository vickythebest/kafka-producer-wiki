package kafka.producer.wiki.media;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.common.serialization.StringSerializer;

public class WikiMediaChangesProducer {
	public static void main(String[] args) {
		System.out.println("hello");
		
		String bootstrapServer="192.168.55.11:9092";
		Properties properties=new Properties();
		properties.setProperty("bootstrap.servers", bootstrapServer);
		properties.setProperty("sasl.jaas.config", "org.apache.kafka.common.security.plain.PlainLoginModule");
		properties.setProperty("sasl.machanism", "PLAIN");
		properties.setProperty("key.serializer", StringSerializer.class.getName());
		properties.setProperty("value.serializer", StringSerializer.class.getName());
		
		KafkaProducer<String, String> producer = new KafkaProducer<>(properties);
		
		String topic="wikimedia_recentchange";
		
//		Eventha
	}

}
