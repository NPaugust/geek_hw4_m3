package com.example.m3l5hw;

public class Element {

    private Integer model;
    private int image;
    private String element_name;


    public Element(Integer model, int image, String element_name) {
        this.model = model;
        this.image = image;
        this.element_name = element_name;
    }

    public Element(int image, String element_name) {
        this.image = image;
        this.element_name = element_name;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getElement_name() {
        return element_name;
    }

    public void setElement_name(String element_name) {
        this.element_name = element_name;
    }
}


