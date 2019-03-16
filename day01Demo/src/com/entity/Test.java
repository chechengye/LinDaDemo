package com.entity;

/**
 * 需求+1：创建一个包含主函数的测试类，
 * 创建一个员工对象，通过 setter 方法
 * 添加属性数据，添加
 * 部门编号时，使用常量
 * 在 com 下，创建包含主函数的测试类 test
 *
 */

public class Test {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("ZS");
        e.setDepartmentNo(Constants.MARKET);
        e.setNumber(1001);
        e.setService(false);

        Department d = new Department();
        d.setName("市场部");
        d.setAmount(11);
        e.setDepartment(d);
        e.printInfo();
    }
}
