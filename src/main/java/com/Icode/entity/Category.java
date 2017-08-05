package com.Icode.entity;

/**
 * Created by Icode on 2017/7/29.
 * descript:消费类别
 */
public class Category extends Entity {
    private String ID;
    private String gategoryName;
    private String userID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getGategoryName() {
        return gategoryName;
    }

    public void setGategoryName(String gategoryName) {
        this.gategoryName = gategoryName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getTableName() {
        return "Category";
    }

    public String getPrimaryKey() {
        return "ID";
    }
}
