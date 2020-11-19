
package ua.nure.inettech.entity;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>Java class for gym complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gym">
 *   &lt;complexContent>
 *     &lt;extension base="{http://inettech.nure.ua}Id">
 *       &lt;sequence>
 *         &lt;element name="gymName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gymMaximumUser" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="gymInformation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gym", namespace = "http://inettech.nure.ua", propOrder = {
    "gymName",
    "gymMaximumUser",
    "gymInformation"
})
public class Gym
    extends Id
{

    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected String gymName;
    @XmlElement(namespace = "http://inettech.nure.ua")
    @XmlSchemaType(name = "Integer")
    protected Integer gymMaximumUser;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected String gymInformation;

    /**
     * Gets the value of the gymName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGymName() {
        return gymName;
    }

    /**
     * Sets the value of the gymName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGymName(String value) {
        this.gymName = value;
    }

    /**
     * Gets the value of the gymMaximumUser property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public Integer getGymMaximumUser() {
        return gymMaximumUser;
    }

    /**
     * Sets the value of the gymMaximumUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGymMaximumUser(Integer value) {
        this.gymMaximumUser = value;
    }

    /**
     * Gets the value of the gymInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGymInformation() {
        return gymInformation;
    }

    /**
     * Sets the value of the gymInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGymInformation(String value) {
        this.gymInformation = value;
    }

    @Override
    public String toString() {
        return "Id = " + id + ", "+
                "gymName = " + gymName +", "+
                "gymMaximumUser= " + gymMaximumUser +", "+
                "gymInformation= " + gymInformation;
    }
}
