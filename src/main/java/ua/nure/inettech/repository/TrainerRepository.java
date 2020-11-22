package ua.nure.inettech.repository;

import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import ua.nure.inettech.entity.Subscriptions;
import ua.nure.inettech.entity.Trainers;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.StringReader;

@Component
public class TrainerRepository extends WebServiceGatewaySupport {
    private static final String MESSAGE_GET_ALL_TRAINERS = "<TrainerList xmlns=\"http://inettech.nure.ua\"></TrainerList>";
    private final WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
    JAXBContext jaxbContext;

    public Trainers allTrainers() throws Throwable{
        StreamSource source = new StreamSource(new StringReader(MESSAGE_GET_ALL_TRAINERS));
        StreamResult result = new StreamResult(new File("src/main/resources/xmlfiles/all_trainer.xml"));
        webServiceTemplate.sendSourceAndReceiveToResult("http://localhost:80/ws/fitnessclub", source, new SoapActionCallback("http://inettech.nure.ua/GymList"), result);
        jaxbContext = JAXBContext.newInstance(Subscriptions.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Trainers trainers = (Trainers) unmarshaller.unmarshal(new File("src/main/resources/xmlfiles/all_trainer.xml"));
        return trainers;
    }
}
