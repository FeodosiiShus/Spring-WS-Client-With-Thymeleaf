
package ua.nure.inettech.entity;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for user complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="user">
 *   &lt;complexContent>
 *     &lt;extension base="{http://inettech.nure.ua}Id">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userBirthdayDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="userInformation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://inettech.nure.ua}phones"/>
 *         &lt;element ref="{http://inettech.nure.ua}order"/>
 *         &lt;element ref="{http://inettech.nure.ua}trainer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", namespace = "http://inettech.nure.ua", propOrder = {
    "userName",
    "userLastName",
    "userBirthdayDate",
    "userInformation",
    "phones",
    "order",
    "trainer"
})
public class User
    extends Id
{

    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected String userName;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected String userLastName;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar userBirthdayDate;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected String userInformation;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected Phones phones;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected Order order;
    @XmlElement(namespace = "http://inettech.nure.ua")
    protected Trainer trainer;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLastName() {
        return userLastName;
    }

    /**
     * Sets the value of the userLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLastName(String value) {
        this.userLastName = value;
    }

    /**
     * Gets the value of the userBirthdayDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUserBirthdayDate() {
        return userBirthdayDate;
    }

    /**
     * Sets the value of the userBirthdayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUserBirthdayDate(XMLGregorianCalendar value) {
        this.userBirthdayDate = value;
    }

    /**
     * Gets the value of the userInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserInformation() {
        return userInformation;
    }

    /**
     * Sets the value of the userInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserInformation(String value) {
        this.userInformation = value;
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
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setOrder(Order value) {
        this.order = value;
    }

    /**
     * Gets the value of the trainer property.
     * 
     * @return
     *     possible object is
     *     {@link Trainer }
     *     
     */
    public Trainer getTrainer() {
        return trainer;
    }

    /**
     * Sets the value of the trainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trainer }
     *     
     */
    public void setTrainer(Trainer value) {
        this.trainer = value;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                "userName='" + userName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", userBirthdayDate=" + userBirthdayDate +
                ", userInformation='" + userInformation + '\'' +
                ", phones=" + phones +
                ", order=" + order +
                ", trainer=" + trainer +
                '}';
    }
}
