package com.example.entity;

/**
 * 需求+1
 * 在com.example.entity下，创建学生实体类，包含学号，姓名，成绩，班级编号；
 * 创建4个参数的构造函数用于初始化。
 * 允许使用快捷键alt+insert，生成getter/setter方法，以及构造函数
 */
public class Student {

    private int number;//学号
    private String name;//姓名
    private int results;//成绩
    private int classNo;//班级编号

    public Student(int number , String name , int results , int classNo){
        this.number = number;
        this.name = name;
        this.results = results;
        this.classNo = classNo;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public void printInfo(){
        System.out.println("姓名: " + this.name + ",学号: "
                + this.number + ",成绩: " + this.results + ",班级编号: "
                + this.classNo);
    }
}
