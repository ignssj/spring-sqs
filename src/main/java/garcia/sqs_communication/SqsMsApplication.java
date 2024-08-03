package garcia.sqs_communication;

import garcia.sqs_communication.producer.MyProducer;
import io.awspring.cloud.sqs.operations.SqsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqsMsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SqsMsApplication.class, args);
	}

	@Autowired
	MyProducer myProducer;
	@Override
	public void run(String... args) throws Exception {
		myProducer.sendMessage("Hello SQS!");
	}
}
