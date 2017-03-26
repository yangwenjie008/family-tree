package com.aaron.domain;

import com.google.common.base.MoreObjects;

/**
 * @author Created by yangwj5 on 2017/3/26 at 15:19.
 */
public class Person {

    private String name;
    private String age;
    private String sex;
    private String address;
    private String telephone;
    private String photo;
    private String brithday;
    private String deadday;


    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("age", age)
                .add("sex", sex)
                .add("address", address)
                .add("telephone", telephone)
                .add("photo", photo)
                .add("brithday", brithday)
                .add("deadday", deadday)
                .toString();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public String getDeadday() {
        return deadday;
    }

    public void setDeadday(String deadday) {
        this.deadday = deadday;
    }
}
