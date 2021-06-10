package model;

import jakarta.xml.bind.annotation.XmlElement;

import jakarta.xml.bind.annotation.XmlRootElement;
import model.PhoneNumber;

import java.io.Serializable;

@XmlRootElement
public class Employee implements Serializable {
    private String name;
    private int birthYear;
    private String position;
    private PhoneNumber phoneNumber;

    public Employee(){
    }

    public Employee(String name, int birthYear, String position) {
        this.name = name;
        this.birthYear = birthYear;
        this.position = position;

    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @XmlElement
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @XmlElement
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "model.Employee{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", position='" + position + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
