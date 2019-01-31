package com.zy.api.model;

public class User {
    private String nickname;
    private  String city;
    private int gender;
    private String country;
    private String language;
    private String province;

    public User(){

    }

    public User(String nickname,String city,int gender,String country,String language,String province){
        this.city = city;
        this.nickname = nickname;
        this.gender = gender;
        this.country = country;
        this.language = language;
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public int getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public String getLanguage() {
        return language;
    }

    public String getProvince() {
        return province;
    }

    public String getNickname() {
        return nickname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
