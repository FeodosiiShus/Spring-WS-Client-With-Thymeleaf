package ua.nure.inettech.repository;

import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import ua.nure.inettech.entity.Gyms;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.StringReader;

@Component
public class GymRepository extends WebServiceGatewaySupport {
    private static final String MESSAGE_GET_ALL_GYMS = "<GymList xmlns=\"http://inettech.nure.ua\"></GymList>";

    private final WebServiceTemplate webServiceTemplate = new WebServiceTemplate();

    JAXBContext jaxbContext;

    public Gyms AllGyms() throws Throwable{
        StreamSource source = new StreamSource(new StringReader(MESSAGE_GET_ALL_GYMS));
        StreamResult result = new StreamResult(new File("src/main/resources/xmlfiles/all_gym.xml"));
        webServiceTemplate.sendSourceAndReceiveToResult("http://localhost:80/ws/fitnessclub", source, new SoapActionCallback("http://inettech.nure.ua/GymList"), result);
        jaxbContext = JAXBContext.newInstance(Gyms.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Gyms gymList = (Gyms) unmarshaller.unmarshal(new File("src/main/resources/xmlfiles/all_gym.xml"));
        return gymList;
    }
}
