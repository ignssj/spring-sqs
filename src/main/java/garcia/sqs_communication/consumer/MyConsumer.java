package garcia.sqs_communication.consumer;

import garcia.sqs_communication.dto.MessageDTO;
import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class MyConsumer {

    @SqsListener("my-aws-queue")
    public void listen(MessageDTO message){
        System.out.println(message.content());
    }

}
