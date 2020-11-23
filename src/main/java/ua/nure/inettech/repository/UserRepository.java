package ua.nure.inettech.repository;

import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import ua.nure.inettech.entity.Gyms;
import ua.nure.inettech.entity.Users;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.StringReader;

@Component
public class UserRepository extends WebServiceGatewaySupport {
    private static final String MESSAGE_GET_ALL_USERS = "<UserList xmlns=\"http://inettech.nure.ua\"></UserList>";
    private final WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
    JAXBContext jaxbContext;

    public Users allUsers() throws Throwable{
        StreamSource source = new StreamSource(new StringReader(MESSAGE_GET_ALL_USERS));
        StreamResult result = new StreamResult(new File("src/main/resources/xmlfiles/all_user.xml"));
        webServiceTemplate.sendSourceAndReceiveToResult("http://localhost:80/ws/fitnessclub", source, new SoapActionCallback("http://inettech.nure.ua/UserList"), result);
        jaxbContext = JAXBContext.newInstance(Gyms.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Users users = (Users) unmarshaller.unmarshal(new File("src/main/resources/xmlfiles/all_user.xml"));
        return users;
    }
}
