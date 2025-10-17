package com.placement.placement_management.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Placement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate date;
    private String qualification;
    private int year;

    public Placement() {
    }

    public Placement(Long id, String name, LocalDate date, String qualification, int year) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.qualification = qualification;
        this.year = year;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getQualification() { return qualification; }
    public void setQualification(String qualification) { this.qualification = qualification; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
}
