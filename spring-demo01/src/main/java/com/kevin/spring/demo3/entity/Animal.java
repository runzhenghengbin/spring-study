package com.kevin.spring.demo3.entity;

/**
 * 动物
 */
public class Animal {

    /**
     * 动物名称
     */
    private String name;

    public Animal() {

    }

    public Animal(String name) {
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
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
