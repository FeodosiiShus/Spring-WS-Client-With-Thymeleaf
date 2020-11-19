
package ua.nure.inettech.entity;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


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
 *         &lt;element name="trainerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trainerLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trainerExperienceYear" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="trainerInformation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://inettech.nure.ua}phones"/>
 *         &lt;element name="gym" type="{http://inettech.nure.ua}gym"/>
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
    "trainerName",
    "trainerLastName",
    "trainerExperienceYear",
    "trainerInformation",
    "phones",
    "gym"
})
@XmlRootElement(name = "trainer", namespace = "http://inettech.nure.ua")
public class Trainer
    extends Id
{

    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected String trainerName;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected String trainerLastName;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected Integer trainerExperienceYear;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected String trainerInformation;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected Phones phones;
    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected Gym gym;

    /**
     * Gets the value of the trainerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainerName() {
        return trainerName;
    }

    /**
     * Sets the value of the trainerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainerName(String value) {
        this.trainerName = value;
    }

    /**
     * Gets the value of the trainerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainerLastName() {
        return trainerLastName;
    }

    /**
     * Sets the value of the trainerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainerLastName(String value) {
        this.trainerLastName = value;
    }

    /**
     * Gets the value of the trainerExperienceYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public Integer getTrainerExperienceYear() {
        return trainerExperienceYear;
    }

    /**
     * Sets the value of the trainerExperienceYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrainerExperienceYear(Integer value) {
        this.trainerExperienceYear = value;
    }

    /**
     * Gets the value of the trainerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainerInformation() {
        return trainerInformation;
    }

    /**
     * Sets the value of the trainerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainerInformation(String value) {
        this.trainerInformation = value;
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
     * Gets the value of the gym property.
     * 
     * @return
     *     possible object is
     *     {@link Gym }
     *     
     */
    public Gym getGym() {
        return gym;
    }

    /**
     * Sets the value of the gym property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gym }
     *     
     */
    public void setGym(Gym value) {
        this.gym = value;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "id= "+ id +
                "trainerName='" + trainerName + '\'' +
                ", trainerLastName='" + trainerLastName + '\'' +
                ", trainerExperienceYear=" + trainerExperienceYear +
                ", trainerInformation='" + trainerInformation + '\'' +
                ", phones=" + phones +
                ", gym=" + gym +
                '}';
    }
}
