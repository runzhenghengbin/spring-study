package com.kevin.spring.demo4.entity;

/**
 * 车
 */
public class Car {

    private String name;

    public Car() {
        System.out.println("Car 初始化了");
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
