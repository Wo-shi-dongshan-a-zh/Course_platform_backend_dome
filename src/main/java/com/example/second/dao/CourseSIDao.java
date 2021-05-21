package com.example.second.dao;

import com.example.second.entity.Book;
import com.example.second.entity.CourseSI;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "CourseSIDao")
public interface CourseSIDao {
        List<CourseSI> findAllCourseSIs();
        String findCourseSIByName(String name);
        int addCourseSI(CourseSI coursesi);
        int deleteCourseSIById(long uid);
        int updateCourseSI(CourseSI coursesi);
}
