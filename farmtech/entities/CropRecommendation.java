package com.farmtech.farmtech.entities;

import javax.persistence.*;

@Entity
public class CropRecommendation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String adhaarId;
    private String result;

    public CropRecommendation(long id, String adhaarId, String result) {
        Id = id;
        this.adhaarId = adhaarId;
        this.result = result;
    }

    public CropRecommendation() {
        super();
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getAdhaarId() {
        return adhaarId;
    }

    public void setAdhaarId(String adhaarId) {
        this.adhaarId = adhaarId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "CropRecommendation{" +
                "Id=" + Id +
                ", adhaarId='" + adhaarId + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
