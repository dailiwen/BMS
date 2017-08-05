package com.Icode.entity;

/**
 * Created by Icode on 2017/7/29.
 * descript:账单
 */
public class BillingRecord extends Entity{
    private String ID;
    private String UserID; // 操作者
    private double amount; // 金额
    private String categoryID; // 消费类别ID
    private String describes; // 描述
    private String remarks; // 备注

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getTableName() {
        return "BillingRecord";
    }

    public String getPrimaryKey() {
        return "ID";
    }
}
