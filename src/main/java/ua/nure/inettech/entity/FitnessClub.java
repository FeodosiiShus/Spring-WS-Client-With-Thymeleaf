
package ua.nure.inettech.entity;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://inettech.nure.ua}Id">
 *       &lt;sequence>
 *         &lt;element name="clubName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clubAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clubStartWorkTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="clubEndWorkTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="clubEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clubInformation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://inettech.nure.ua}phones"/>
 *         &lt;element ref="{http://inettech.nure.ua}subscriptions"/>
 *         &lt;element ref="{http://inettech.nure.ua}users"/>
 *         &lt;element ref="{http://inettech.nure.ua}trainers"/>
 *         &lt;element ref="{http://inettech.nure.ua}gyms"/>
 *         &lt;element ref="{http://inettech.nure.ua}orders"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clubName",
    "clubAddress",
    "clubStartWorkTime",
    "clubEndWorkTime",
    "clubEmail",
    "clubInformation",
    "phones",
    "subscriptions",
    "users",
    "trainers",
    "gyms",
    "orders"
})
@XmlRootElement(name = "fitnessClub", namespace = "http://inettech.nure.ua")
public class FitnessClub
    extends Id
{

    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected String clubName;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected String clubAddress;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar clubStartWorkTime;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar clubEndWorkTime;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected String clubEmail;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected String clubInformation;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected Phones phones;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected Subscriptions subscriptions;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected Users users;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected Trainers trainers;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected Gyms gyms;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected Orders orders;

    /**
     * Gets the value of the clubName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClubName() {
        return clubName;
    }

    /**
     * Sets the value of the clubName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClubName(String value) {
        this.clubName = value;
    }

    /**
     * Gets the value of the clubAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClubAddress() {
        return clubAddress;
    }

    /**
     * Sets the value of the clubAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClubAddress(String value) {
        this.clubAddress = value;
    }

    /**
     * Gets the value of the clubStartWorkTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClubStartWorkTime() {
        return clubStartWorkTime;
    }

    /**
     * Sets the value of the clubStartWorkTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClubStartWorkTime(XMLGregorianCalendar value) {
        this.clubStartWorkTime = value;
    }

    /**
     * Gets the value of the clubEndWorkTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClubEndWorkTime() {
        return clubEndWorkTime;
    }

    /**
     * Sets the value of the clubEndWorkTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClubEndWorkTime(XMLGregorianCalendar value) {
        this.clubEndWorkTime = value;
    }

    /**
     * Gets the value of the clubEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClubEmail() {
        return clubEmail;
    }

    /**
     * Sets the value of the clubEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClubEmail(String value) {
        this.clubEmail = value;
    }

    /**
     * Gets the value of the clubInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClubInformation() {
        return clubInformation;
    }

    /**
     * Sets the value of the clubInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClubInformation(String value) {
        this.clubInformation = value;
    }

    /**
     * Gets the value of the phones property.
     * 
     * @return
     *     possible object is
     *     {@link Phones }
     *     
     */
    public Phones getPhones() {
        return phones;
    }

    /**
     * Sets the value of the phones property.
     * 
     * @param value
     *     allowed object is
     *     {@link Phones }
     *     
     */
    public void setPhones(Phones value) {
        this.phones = value;
    }

    /**
     * Gets the value of the subscriptions property.
     * 
     * @return
     *     possible object is
     *     {@link Subscriptions }
     *     
     */
    public Subscriptions getSubscriptions() {
        return subscriptions;
    }

    /**
     * Sets the value of the subscriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscriptions }
     *     
     */
    public void setSubscriptions(Subscriptions value) {
        this.subscriptions = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link Users }
     *     
     */
    public Users getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link Users }
     *     
     */
    public void setUsers(Users value) {
        this.users = value;
    }

    /**
     * Gets the value of the trainers property.
     * 
     * @return
     *     possible object is
     *     {@link Trainers }
     *     
     */
    public Trainers getTrainers() {
        return trainers;
    }

    /**
     * Sets the value of the trainers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trainers }
     *     
     */
    public void setTrainers(Trainers value) {
        this.trainers = value;
    }

    /**
     * Gets the value of the gyms property.
     * 
     * @return
     *     possible object is
     *     {@link Gyms }
     *     
     */
    public Gyms getGyms() {
        return gyms;
    }

    /**
     * Sets the value of the gyms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gyms }
     *     
     */
    public void setGyms(Gyms value) {
        this.gyms = value;
    }

    /**
     * Gets the value of the orders property.
     * 
     * @return
     *     possible object is
     *     {@link Orders }
     *     
     */
    public Orders getOrders() {
        return orders;
    }

    /**
     * Sets the value of the orders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Orders }
     *     
     */
    public void setOrders(Orders value) {
        this.orders = value;
    }

}
