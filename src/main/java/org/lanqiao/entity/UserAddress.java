package org.lanqiao.entity;

public class UserAddress {
    private Integer useraddressId;

    private String useraddressName;

    private String userName;

    private Integer userPhone;

    private Integer userId;

    public Integer getUseraddressId() {
        return useraddressId;
    }

    public void setUseraddressId(Integer useraddressId) {
        this.useraddressId = useraddressId;
    }

    public String getUseraddressName() {
        return useraddressName;
    }

    public void setUseraddressName(String useraddressName) {
        this.useraddressName = useraddressName == null ? null : useraddressName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Integer userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}