
package ua.nure.inettech.entity;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://inettech.nure.ua}trainer" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "trainer"
})
@XmlRootElement(name = "trainers", namespace = "http://inettech.nure.ua")
public class Trainers {

    @XmlElement(namespace = "http://inettech.nure.ua", required = true)
    protected List<Trainer> trainer;

    /**
     * Gets the value of the trainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Trainer }
     * 
     * 
     */
    public List<Trainer> getTrainer() {
        if (trainer == null) {
            trainer = new ArrayList<Trainer>();
        }
        return this.trainer;
    }

    public void setTrainer(List<Trainer> trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return trainer + "";
    }
}
