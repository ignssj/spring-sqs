package garcia.sqs_communication.producer;

import garcia.sqs_communication.dto.MessageDTO;
import io.awspring.cloud.sqs.operations.SqsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyProducer {

    @Autowired
    private SqsTemplate sqsTemplate;

    public void sendMessage(String message) {
        var SQS_URL = "https://localhost.localstack.cloud:4566/000000000000/my-aws-queue";
        MessageDTO my_message = new MessageDTO(message);
        sqsTemplate.send(SQS_URL, my_message);
    }
}
