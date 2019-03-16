package com.entity;

/**
 * 需求+1：
 * 设计企业部门类，包括部门名称，
 * 部门编号（由于是固定的依然可以使用常量），
 * 部门员工总 数
 * （为获取员工总数 的方法添加文档注释。）
 * 在 com.entity 下，创建Department类。
 */
public class Department {
    private String name;//部门名称
    private int departmenNo;//部门编号
    private int amount;//部门员工总数

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmenNo() {
        return departmenNo;
    }

    public void setDepartmenNo(int departmenNo) {
        this.departmenNo = departmenNo;
    }

    /**
     * 获取员工总数
     * @return 员工数量
     */
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
