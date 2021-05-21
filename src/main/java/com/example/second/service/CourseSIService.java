package com.example.second.service;

import com.example.second.entity.Book;
import com.example.second.entity.CourseSI;

import java.util.List;


public interface CourseSIService {

    List<CourseSI> findAllCourseSIs();

    public String findCourseSIByName(String name);

    public void addCourseSI(CourseSI book);

    public void deleteCourseSIById(Long uid);

    public void updateCourseSI(CourseSI book);
}
