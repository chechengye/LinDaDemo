package com.example.resource;

import com.example.entity.Student;

/**
 * 需求+1
 * 在com.example.resource下，创建DatabaseUtils工具类，
 * 通过静态方法对外提供服务
 * 在类中创建一个私有静态学生数组变量，通过一个
 * 私有静态方法初始化数组，再创建一个公共静态方
 * 法，外界通过该方法获取封装的学生数组对象。
 */
public class DatabaseUtils {
    private static Student[] students = initStudents();

    private static Student[] initStudents(){
        Student s1 = new Student(1001 , "ZS" , 66 , 1);
        Student s2 = new Student(1002 , "LS" , 33 , 2);
        Student s3 = new Student(1003 , "WR" , 77 , 1);
        Student s4 = new Student(1004, "MZ" , 45 , 2);
        Student[] students = {s1 , s2 , s3, s4};
        return students;
    }

    public static Student[] getStudents() {
        return students;
    }
}
