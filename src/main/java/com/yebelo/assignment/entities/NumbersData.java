package com.yebelo.assignment.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NumbersData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String categoryCode;
    private String value;

    public NumbersData() {
    }

    public NumbersData(String categoryCode, String value) {
        this.categoryCode = categoryCode;
        this.value = value;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Numbers [categoryCode=" + categoryCode + ", value=" + value + "]";
    }

}
