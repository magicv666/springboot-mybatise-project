package com.happyrabbit.sbone.entity;

public class User {

    /**
     * 客户数据库id
     */
    private Integer uId;

    /**
     * 客户姓名
     */
    private String uName;

    /**
     * 客户密码
     */
    private String uPassword;

    /**
     * 客户电话
     */
    private String uPhone;


    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }
}
