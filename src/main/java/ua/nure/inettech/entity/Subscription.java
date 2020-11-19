
package ua.nure.inettech.entity;


import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>Java class for subscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subscription">
 *   &lt;complexContent>
 *     &lt;extension base="{http://inettech.nure.ua}Id">
 *       &lt;sequence>
 *         &lt;element name="subscriptionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subscriptionPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="subscriptionCountVisits" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element ref="{http://inettech.nure.ua}gyms"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subscription", namespace = "http://inettech.nure.ua", propOrder = {
    "subscriptionName",
    "subscriptionPrice",
    "subscriptionCountVisits",
    "gyms"
})
public class Subscription
    extends Id
{

    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected String subscriptionName;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected double subscriptionPrice;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    @XmlSchemaType(name = "Integer")
    protected Integer subscriptionCountVisits;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected Gyms gyms;

    /**
     * Gets the value of the subscriptionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionName() {
        return subscriptionName;
    }

    /**
     * Sets the value of the subscriptionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionName(String value) {
        this.subscriptionName = value;
    }

    /**
     * Gets the value of the subscriptionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public double getSubscriptionPrice() {
        return subscriptionPrice;
    }

    /**
     * Sets the value of the subscriptionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubscriptionPrice(double value) {
        this.subscriptionPrice = value;
    }

    /**
     * Gets the value of the subscriptionCountVisits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public Integer getSubscriptionCountVisits() {
        return subscriptionCountVisits;
    }

    /**
     * Sets the value of the subscriptionCountVisits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubscriptionCountVisits(Integer value) {
        this.subscriptionCountVisits = value;
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

    @Override
    public String toString() {
        return "Subscriptions\n" +
                "Id: " + id +
                "\nsubscriptionName: " + subscriptionName +
                "\nsubscriptionPrice: " + subscriptionPrice +
                "\nsubscriptionCountVisits: " + subscriptionCountVisits +
                "\n\tGyms" + gyms;
    }
}
