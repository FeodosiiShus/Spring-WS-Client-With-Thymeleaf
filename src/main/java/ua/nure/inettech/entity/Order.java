
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
 *         &lt;element name="orderSubscription" type="{http://inettech.nure.ua}subscription"/>
 *         &lt;element name="orderStartDateSubscription" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="orderEndDateSubscription" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="orderStatus" type="{http://inettech.nure.ua}orderStatus"/>
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
    "orderSubscription",
    "orderStartDateSubscription",
    "orderEndDateSubscription",
    "orderStatus"
})
@XmlRootElement(name = "order", namespace = "http://inettech.nure.ua")
public class Order
    extends Id
{

    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected Subscription orderSubscription;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderStartDateSubscription;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderEndDateSubscription;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    @XmlSchemaType(name = "string")
    protected OrderStatus orderStatus;

    /**
     * Gets the value of the orderSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link Subscription }
     *     
     */
    public Subscription getOrderSubscription() {
        return orderSubscription;
    }

    /**
     * Sets the value of the orderSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscription }
     *     
     */
    public void setOrderSubscription(Subscription value) {
        this.orderSubscription = value;
    }

    /**
     * Gets the value of the orderStartDateSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderStartDateSubscription() {
        return orderStartDateSubscription;
    }

    /**
     * Sets the value of the orderStartDateSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderStartDateSubscription(XMLGregorianCalendar value) {
        this.orderStartDateSubscription = value;
    }

    /**
     * Gets the value of the orderEndDateSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderEndDateSubscription() {
        return orderEndDateSubscription;
    }

    /**
     * Sets the value of the orderEndDateSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderEndDateSubscription(XMLGregorianCalendar value) {
        this.orderEndDateSubscription = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus }
     *     
     */
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus }
     *     
     */
    public void setOrderStatus(OrderStatus value) {
        this.orderStatus = value;
    }

}
