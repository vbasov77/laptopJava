package org.example;

public class Laptop {

    private String title;
    private Integer ramMemory;// Оперативная память
    private String operatingSystem;// Операционная система
    private String color;
    private Integer display;
    private int price;

    public Laptop(String title, Integer ramMemory, String operatingSystem, String color, Integer display, int price) {
        this.title = title;
        this.ramMemory = ramMemory;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.display = display;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Integer getRamMemory() {
        return ramMemory;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public Integer getDisplay() {
        return display;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", ramMemory=" + ramMemory +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", color='" + color + '\'' +
                ", display=" + display +
                ", price=" + price +
                '}';
    }
}
