package ua.nure.inettech.repository;

import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import ua.nure.inettech.entity.Gym;
import ua.nure.inettech.entity.Gyms;
import ua.nure.inettech.entity.Subscription;
import ua.nure.inettech.entity.Subscriptions;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SubscriptionRepository extends WebServiceGatewaySupport {
    private static final String MESSAGE_GET_ALL_SUBSCRIPTION = "<SubscriptionList xmlns=\"http://inettech.nure.ua\"></SubscriptionList>";
    private final WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
    JAXBContext jaxbContext;

    public Subscriptions allSubscriptions() throws Throwable{
        StreamSource source = new StreamSource(new StringReader(MESSAGE_GET_ALL_SUBSCRIPTION));
        StreamResult result = new StreamResult(new File("src/main/resources/xmlfiles/all_subscription.xml"));
        webServiceTemplate.sendSourceAndReceiveToResult("http://localhost:80/ws/fitnessclub", source, new SoapActionCallback("http://inettech.nure.ua/SubscriptionList"), result);
        jaxbContext = JAXBContext.newInstance(Subscriptions.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Subscriptions subscriptionsList = (Subscriptions) unmarshaller.unmarshal(new File("src/main/resources/xmlfiles/all_subscription.xml"));

        return subscriptionsList;
    }
}
