package com.vlad.jdbci.model;

import java.time.LocalDate;

public class Class {
    private Integer id;
    private Integer schoolId;
    private String name;
    private Integer quantity;
    private LocalDate openClass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDate getOpenClass() {
        return openClass;
    }

    public void setOpenClass(LocalDate openClass) {
        this.openClass = openClass;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", schoolId=" + schoolId +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", openClass=" + openClass +
                '}';
    }
}
