package model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PhoneNumber {
    private String networkCode;
    private String subscriberNumber;

    public PhoneNumber() {
    }

    public PhoneNumber(String networkCode, String subscriberNumber) {
        this.networkCode = networkCode;
        this.subscriberNumber = subscriberNumber;
    }

    @XmlElement
    public String getNetworkCode() {
        return networkCode;
    }

    public void setNetworkCode(String networkCode) {
        this.networkCode = networkCode;
    }

    @XmlElement
    public String getSubscriberNumber() {
        return subscriberNumber;
    }

    public void setSubscriberNumber(String subscriberNumber) {
        this.subscriberNumber = subscriberNumber;
    }

    @Override
    public String toString() {
        return "model.PhoneNumber{" +
                "networkCode=" + networkCode +
                ", subscriberNumber=" + subscriberNumber +
                '}';
    }
}
