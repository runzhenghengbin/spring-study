package com.kevin.spring.demo2.entity;

/**
 * 学生
 */
public class Student extends Person {

    /**
     * 身高
     */
    public int height;

    /**
     * 有参构造函数
     *
     * @param name
     * @param height
     */
    public Student(String name, int height) {
        this.name = name;
        this.height = height;
        System.out.println("Student 初始化");
    }

    @Override
    public String toString() {
        return "Student{" +
                "height=" + height +
                ", name='" + name + '\'' +
                '}';
    }

    public void init() {
        System.out.println("执行init方法");
    }

    public void over() {
        System.out.println("执行over方法");
    }
}
