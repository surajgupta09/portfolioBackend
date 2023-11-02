package com.suraj.personal.portfolio.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class WorkExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String position;
    private String date;
    private String description;
    private String certificateURL;

    public WorkExperience() {
    }

    public WorkExperience(Long id, String position, String date, String description, String certificateURL) {
        this.id = id;
        this.position = position;
        this.date = date;
        this.description = description;
        this.certificateURL = certificateURL;
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "id=" + id +
                ", position='" + position + '\'' +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", certificateURL='" + certificateURL + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCertificateURL() {
        return certificateURL;
    }

    public void setCertificateURL(String certificateURL) {
        this.certificateURL = certificateURL;
    }
}
