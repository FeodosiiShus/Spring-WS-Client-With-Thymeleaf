package ua.nure.inettech.repository;

import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import ua.nure.inettech.entity.Gym;
import ua.nure.inettech.entity.Gyms;
import ua.nure.inettech.entity.User;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.StringReader;

@Component
public class GymRepository extends WebServiceGatewaySupport {
    private static final String MESSAGE_GET_ALL_GYMS = "<GymList xmlns=\"http://inettech.nure.ua\"></GymList>";
    private static final String MESSAGE_GYM_NAME_START =
            "<Gyms xmlns=\"http://inettech.nure.ua\">" +
                    "<gymName>";
    private static final String MESSAGE_GYM_NAME_END = "</gymName>" + "</Gyms>";

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

    public Gyms findGymByName(String name) throws Throwable{
        StreamSource source = new StreamSource(new StringReader(MESSAGE_GYM_NAME_START+name+MESSAGE_GYM_NAME_END));
        StreamResult result = new StreamResult(new File("src/main/resources/xmlfiles/find_gym.xml"));
        webServiceTemplate.sendSourceAndReceiveToResult("http://localhost:80/ws/fitnessclub", source, new SoapActionCallback("http://inettech.nure.ua/Gyms"), result);
        jaxbContext = JAXBContext.newInstance(Gyms.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Gyms gymList = (Gyms) unmarshaller.unmarshal(new File("src/main/resources/xmlfiles/find_gym.xml"));
        return gymList;
    }

    public Gyms addGym(Gym gym) throws Throwable{
        StreamSource source = new StreamSource(new StringReader(addGymSettings(gym)));
        StreamResult result = new StreamResult(new File("src/main/resources/xmlfiles/add_gym.xml"));
        webServiceTemplate.sendSourceAndReceiveToResult("http://localhost:80/ws/fitnessclub", source, new SoapActionCallback("http://inettech.nure.ua/Gyms"), result);
        jaxbContext = JAXBContext.newInstance(Gyms.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Gyms gymList = (Gyms) unmarshaller.unmarshal(new File("src/main/resources/xmlfiles/add_gym.xml"));
        return gymList;
    }

    public String addGymSettings(Gym gym){
        StringBuilder str = new StringBuilder();
        str.append("<AddGym id=\"+"+gym.getId()+"+\" xmlns=\"http://inettech.nure.ua\">" +
                "<gymName>"+gym.getGymName()+"</gymName>" +
                "<gymMaximumUser>"+gym.getGymMaximumUser()+"</gymMaximumUser>" +
                "<gymInformation>"+ gym.getGymInformation() +"</gymInformation>" +
                "</AddGym>");
        return str.toString();
    }
}
