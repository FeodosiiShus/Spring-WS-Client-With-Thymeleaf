
package ua.nure.inettech.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="orderStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Отменен"/>
 *     &lt;enumeration value="Принят"/>
 *     &lt;enumeration value="Активен"/>
 *     &lt;enumeration value="Срок истек"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "orderStatus", namespace = "http://inettech.nure.ua")
@XmlEnum
public enum OrderStatus {

    @XmlEnumValue("\u041e\u0442\u043c\u0435\u043d\u0435\u043d")
    ОТМЕНЕН("\u041e\u0442\u043c\u0435\u043d\u0435\u043d"),
    @XmlEnumValue("\u041f\u0440\u0438\u043d\u044f\u0442")
    ПРИНЯТ("\u041f\u0440\u0438\u043d\u044f\u0442"),
    @XmlEnumValue("\u0410\u043a\u0442\u0438\u0432\u0435\u043d")
    АКТИВЕН("\u0410\u043a\u0442\u0438\u0432\u0435\u043d"),
    @XmlEnumValue("\u0421\u0440\u043e\u043a \u0438\u0441\u0442\u0435\u043a")
    СРОК_ИСТЕК("\u0421\u0440\u043e\u043a \u0438\u0441\u0442\u0435\u043a");
    private final String value;

    OrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderStatus fromValue(String v) {
        for (OrderStatus c: OrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
