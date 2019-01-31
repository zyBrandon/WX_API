package com.zy.api.controller;

import com.zy.api.mapper.CollectMapper;
import com.zy.api.model.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RequestMapping("collect/")
@RestController
public class CollectController {

    @Autowired
    private CollectMapper collectMapper;

    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/inputUser",method = RequestMethod.GET)
    public String inputUser(@RequestParam String nickname,@RequestParam String city,@RequestParam int gender,@RequestParam String country,
                            @RequestParam String user_language,@RequestParam String province){
        int i = collectMapper.selectUser(nickname,city);
        if (i == 1){
            return "success";
        } else {
            int j = collectMapper.inputUser(nickname,city,gender,country,user_language,province);
            return "success";
        }
    }

    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/inputMovie",method = RequestMethod.GET)
    public String inputMovie(@RequestParam String nickname,@RequestParam String city,@RequestParam String movie_name,@RequestParam String time){
        int i  =collectMapper.selectMovie(nickname,city,movie_name);
        if (i == 1){
            return "success";
        } else {
            int j = collectMapper.inputMovie(nickname,city,movie_name,time);
            return  "success";
        }
    }

    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/selectMovies",method = RequestMethod.GET)
    public List<Collection> selectMovies(@RequestParam String nickname,@RequestParam String city){
        System.out.println(nickname + city);
        List<Collection> collections = collectMapper.selectMovies(nickname,city);
        return collections;
    }

    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "test";
    }
}
