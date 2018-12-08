package com.kevin.spring.demo4.entity;

/**
 * 轮胎
 * @author: kevin
 * @Date: 2018/12/8
 */
public class Tyre {

    private String name;

    public Tyre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "name='" + name + '\'' +
                '}';
    }
}
