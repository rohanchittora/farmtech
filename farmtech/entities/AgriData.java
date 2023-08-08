package com.farmtech.farmtech.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AgriData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String adhaarId;
    private String country;
    private String nitrogen;
    private String phosphorus;
    private String potassium;
    private String temperature;
    private String rainfall;
    private String humidity;
    private String pH;

    public AgriData(long id, String adhaarId, String name, String country, String nitrogen, String phosphorus, String potassium, String temperature, String rainfall, String humidity, String pH) {
        this.id = id;
        this.adhaarId = adhaarId;
        this.name = name;
        this.country = country;
        this.nitrogen = nitrogen;
        this.phosphorus = phosphorus;
        this.potassium = potassium;
        this.temperature = temperature;
        this.rainfall = rainfall;
        this.humidity = humidity;
        this.pH = pH;
    }

    public AgriData() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdhaarId() {
        return adhaarId;
    }

    public void setAdhaarId(String adhaarId) {
        this.adhaarId = adhaarId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNitrogen() {
        return nitrogen;
    }

    public void setNitrogen(String nitrogen) {
        this.nitrogen = nitrogen;
    }

    public String getPhosphorus() {
        return phosphorus;
    }

    public void setPhosphorus(String phosphorus) {
        this.phosphorus = phosphorus;
    }

    public String getPotassium() {
        return potassium;
    }

    public void setPotassium(String potassium) {
        this.potassium = potassium;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getRainfall() {
        return rainfall;
    }

    public void setRainfall(String rainfall) {
        this.rainfall = rainfall;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getpH() {
        return pH;
    }

    public void setpH(String pH) {
        this.pH = pH;
    }

    @Override
    public String toString() {
        return "AgriData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adhaarId='" + adhaarId + '\'' +
                ", country='" + country + '\'' +
                ", nitrogen='" + nitrogen + '\'' +
                ", phosphorus='" + phosphorus + '\'' +
                ", potassium='" + potassium + '\'' +
                ", temperature='" + temperature + '\'' +
                ", rainfall='" + rainfall + '\'' +
                ", humidity='" + humidity + '\'' +
                ", pH='" + pH + '\'' +
                '}';
    }
}
