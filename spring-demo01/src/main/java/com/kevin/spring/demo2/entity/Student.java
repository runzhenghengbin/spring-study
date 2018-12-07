package com.kevin.spring.demo2.entity;

/**
 * 学生
 */
public class Student extends Person{

    /**
     * 身高
     */
    public int height;

    /**
     * 有参构造函数
     * @param name
     * @param height
     */
    public Student(String name,int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
