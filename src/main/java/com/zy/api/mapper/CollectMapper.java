package com.zy.api.mapper;

import com.zy.api.model.Collection;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;


@Mapper
public interface CollectMapper {

    @Select("select count(*) from user_tbl where nickname=#{nickname} and city=#{city}")
    int selectUser(@Param("nickname") String nickname,@Param("city") String city);

    @Insert("insert into user_tbl values(#{nickname},#{city},#{gender},#{country},#{user_language},#{province})")
    int inputUser(@Param("nickname") String nickname,@Param("city") String city,@Param("gender") int gender,
                  @Param("country") String country,@Param("user_language") String user_language,@Param("province") String province);

    @Select("select count(*) from collection_tbl where nickname=#{nickname} and city=#{city} and movie_name=#{movie_name}")
    int selectMovie(@Param("nickname") String nickname,@Param("city") String city,@Param("movie_name") String movie_name);

    @Insert("insert into collection_tbl values(#{nickname},#{city},#{movie_name},#{time})")
    int inputMovie(@Param("nickname") String nickname,@Param("city") String city,@Param("movie_name") String movie_name,@Param("time") String time);

    @Select("select * from collection_tbl where nickname=#{nickname} and city=#{city}")
    List<Collection> selectMovies(@Param("nickname") String nickname,@Param("city") String city);
}
