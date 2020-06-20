package com.company.model;

import com.company.customAnnotation.Loggable;

public class Circle {
    private String name;

    public String getName() {
        return name;
    }
   @Loggable
    public void setName(String name) {
        this.name = name;
    }
    public String setStatus(String name) throws Exception {
        throw new Exception("Exception...........");
    }
    public String getStatus() throws Exception {
        throw new Exception("Exception...........");
    }
}
