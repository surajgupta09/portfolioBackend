package com.suraj.personal.portfolio.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Education {

    @Id
    private Long id;
    private String name;
    private String date;
    private String course;

    public Education() {
    }

    public Education(Long id, String name, String date, String course) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Education{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
