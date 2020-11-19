
package ua.nure.inettech.entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OrderStatus_QNAME = new QName("http://inettech.nure.ua", "orderStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Trainers }
     * 
     */
    public Trainers createTrainers() {
        return new Trainers();
    }

    /**
     * Create an instance of {@link Trainer }
     * 
     */
    public Trainer createTrainer() {
        return new Trainer();
    }

    /**
     * Create an instance of {@link Id }
     * 
     */
    public Id createId() {
        return new Id();
    }

    /**
     * Create an instance of {@link Phones }
     * 
     */
    public Phones createPhones() {
        return new Phones();
    }

    /**
     * Create an instance of {@link Gym }
     * 
     */
    public Gym createGym() {
        return new Gym();
    }

    /**
     * Create an instance of {@link Subscriptions }
     * 
     */
    public Subscriptions createSubscriptions() {
        return new Subscriptions();
    }

    /**
     * Create an instance of {@link Subscription }
     * 
     */
    public Subscription createSubscription() {
        return new Subscription();
    }

    /**
     * Create an instance of {@link FitnessClub }
     * 
     */
    public FitnessClub createFitnessClub() {
        return new FitnessClub();
    }

    /**
     * Create an instance of {@link Users }
     * 
     */
    public Users createUsers() {
        return new Users();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Gyms }
     * 
     */
    public Gyms createGyms() {
        return new Gyms();
    }

    /**
     * Create an instance of {@link Orders }
     * 
     */
    public Orders createOrders() {
        return new Orders();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inettech.nure.ua", name = "orderStatus")
    public JAXBElement<OrderStatus> createOrderStatus(OrderStatus value) {
        return new JAXBElement<OrderStatus>(_OrderStatus_QNAME, OrderStatus.class, null, value);
    }

}
