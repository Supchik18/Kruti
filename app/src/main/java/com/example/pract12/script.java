package com.example.pract12;

public class script {
    private String name;
    private String color;
    private int picResource;

    public script(String name, String color, int picResource){
        this.name = name;
        this.color = color;
        this.picResource = picResource;
    }

    public String getName() {return this.name; }
    public void setName(String name) {this.name = name;}

    public String getColor() {return this.color; }
    public void setColor(String color) {this.color = color;}

    public int getPicResource() {return this.picResource; }
    public void setPicResource(int picResource) {this.picResource = picResource;}
}
