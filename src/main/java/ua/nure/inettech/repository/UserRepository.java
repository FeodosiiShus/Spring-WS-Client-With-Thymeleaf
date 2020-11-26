package ua.nure.inettech.repository;

import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import ua.nure.inettech.entity.*;

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

    public Users allUsers() throws Throwable {
        StreamSource source = new StreamSource(new StringReader(MESSAGE_GET_ALL_USERS));
        StreamResult result = new StreamResult(new File("src/main/resources/xmlfiles/all_user.xml"));
        webServiceTemplate.sendSourceAndReceiveToResult("http://localhost:80/ws/fitnessclub", source, new SoapActionCallback("http://inettech.nure.ua/UserList"), result);
        jaxbContext = JAXBContext.newInstance(Gyms.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Users users = (Users) unmarshaller.unmarshal(new File("src/main/resources/xmlfiles/all_user.xml"));
        return users;
    }

    public Users addUser(User user, String phone, Order order, String orderStatus, Subscription subscription, Gym gym, Trainer trainer, String trainerPhone) throws Throwable {
        StreamSource source = new StreamSource(new StringReader(addUserSettings(user, phone, order, orderStatus, subscription, gym, trainer, trainerPhone)));
        StreamResult result = new StreamResult(new File("src/main/resources/xmlfiles/add_user.xml"));
        webServiceTemplate.sendSourceAndReceiveToResult("http://localhost:80/ws/fitnessclub", source, new SoapActionCallback("http://inettech.nure.ua/AddUser"), result);
        jaxbContext = JAXBContext.newInstance(Gyms.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Users users = (Users) unmarshaller.unmarshal(new File("src/main/resources/xmlfiles/add_user.xml"));
        return users;
    }

    public String addUserSettings(User user, String phone, Order order, String orderStatus, Subscription subscription, Gym gym, Trainer trainer, String trainerPhone) {
        StringBuilder str = new StringBuilder();
        str.append("<AddUser id=\"" + user.getId() + "\" xmlns=\"http://inettech.nure.ua\">" +
                "            <userName>" + user.getUserName() + "</userName>" +
                "            <userLastName>" + user.getUserLastName() + "</userLastName>" +
                "            <userBirthdayDate>" + user.getUserBirthdayDate() + "</userBirthdayDate>" +
                "            <userInformation>" + user.getUserInformation() + "</userInformation>" +
                "            <phones>" +
                "                <phone>" + phone + "</phone>" +
                "            </phones>" +
                "            <order id=\"" + order.getId() + "\">" +
                "                <orderSubscription id=\"" + subscription.getId() + "\">" +
                "                    <subscriptionName>" + subscription.getSubscriptionName() + "</subscriptionName>" +
                "                    <subscriptionPrice>" + subscription.getSubscriptionPrice() + "</subscriptionPrice>" +
                "                    <subscriptionCountVisits>" + subscription.getSubscriptionCountVisits().toString() + "</subscriptionCountVisits>" +
                "                    <gyms>" +
                "                        <!--1 or more repetitions:-->" +
                "                        <gym id=\"" + gym.getId() + "\">" +
                "                            <gymName>" + gym.getGymName() + "</gymName>" +
                "                            <gymMaximumUser>" + gym.getGymMaximumUser().toString() + "</gymMaximumUser>" +
                "                            <gymInformation>" + gym.getGymInformation() + "</gymInformation>" +
                "                        </gym>" +
                "                    </gyms>" +
                "                </orderSubscription>" +
                "                <orderStartDateSubscription>" + order.getOrderStartDateSubscription() + "</orderStartDateSubscription>" +
                "                <orderEndDateSubscription>" + order.getOrderEndDateSubscription() + "</orderEndDateSubscription>" +
                "                <orderStatus>" + orderStatus + "</orderStatus>" +
                "</order>" +
                "<trainer id=\"" + trainer.getId() + "\">" +
                "            <trainerName>" + trainer.getTrainerName() + "</trainerName>" +
                "            <trainerLastName>" + trainer.getTrainerLastName() + "</trainerLastName>" +
                "            <trainerExperienceYear>" + trainer.getTrainerExperienceYear() + "</trainerExperienceYear>" +
                "            <trainerInformation>" + trainer.getTrainerInformation() + "</trainerInformation>" +
                "            <phones>" +
                "                <phone>" + trainerPhone + "</phone>" +
                "            </phones>" +
                "            <gym id=\"" + gym.getId() + "\">" +
                "                            <gymName>" + gym.getGymName() + "</gymName>" +
                "                            <gymMaximumUser>" + gym.getGymMaximumUser().toString() + "</gymMaximumUser>" +
                "                            <gymInformation>" + gym.getGymInformation() + "</gymInformation>" +
                "                        </gym>" +
                "        </trainer>" +
                "</AddUser>");
        return str.toString();
    }
}
