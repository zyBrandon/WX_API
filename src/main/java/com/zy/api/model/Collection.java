package com.zy.api.model;

import java.util.List;

public class Collection {
    private String nickname;
    private String city;
    private String movie_name;

    public Collection(){

    }

    public Collection(String nickname,String city,String movie_name){
        this.nickname = nickname;
        this.city = city;
        this.movie_name = movie_name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCity() {
        return city;
    }

    public String getMovie_name() {
        return movie_name;
    }


}
