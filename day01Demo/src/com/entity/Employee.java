package com.entity;

/**
 * 需求 0：设计一个企业员工类(在com.entity包 Employee类)，
 * 包含: 姓名，员工号(企业员工号为数字),
 * 当前是否在职(只有在职与不在职2种可能,默认为在职)；
 * 用户所属部门编号(企业的部门编号固定，市场部门为 1，
 * 售后为2)；为每个属性添加单行注释。
 * 尝试手动编写属性的 getter/setter
 *
 * 需求+1：为员工类添加性别属性，基于枚举类型实现；
 * 性别只有 2 个固定选项，因 此使用枚 举，性别 仅用户类使用，
 * 因此定义在内部，
 * 将性别 定 义 为用户的属性， 并提供 getter/setter
 *
 * 需求+1：
 * 创建Department对象，封装属性测试由于用户对象需要部门属性，
 * 因此需先创建部门对象，再 将部
 * 门对象封装到用户对象的属性中。
 * 理解任意类型都可作为类的成员变量，封装测试代码。
 *
 */
public class Employee {
    private String name;//姓名
    private int number;//员工号
    private boolean isService = true;//是否在职
    private int departmentNo;//部门编号

    private Sex sex;//性别

    private Department department;//部门对象



    public enum Sex{
        MALE , FEMALE
    }

    public void setName(String name){//setter
        this.name = name;
    }

    public String getName(){//getter
        return this.name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isService() {
        return isService;
    }

    public void setService(boolean service) {
        isService = service;
    }

    public int getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(int departmentNo) {
        this.departmentNo = departmentNo;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void printInfo(){
        System.out.println("姓名:" + this.name
                + ",编号:" + this.number
                + "，在职状态:"
                + (this.isService ? "在职" : "离职")
                + ",部门名称：" + this.department.getName()
                + ",部门数量:" + this.department.getAmount());//输出语句
    }
}
