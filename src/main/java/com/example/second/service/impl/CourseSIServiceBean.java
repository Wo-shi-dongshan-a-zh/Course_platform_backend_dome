package com.example.second.service.impl;

import com.example.second.dao.CourseSIDao;
import com.example.second.entity.CourseSI;
import com.example.second.service.CourseSIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class CourseSIServiceBean implements CourseSIService {

    @Qualifier("CourseSIDao")
    @Autowired
    private CourseSIDao coursesiDao;

    @Override
    public List<CourseSI> findAllCourseSIs() {
        return this.coursesiDao.findAllCourseSIs();
    }

    public String findCourseSIByName(String name) {
        return this.coursesiDao.findCourseSIByName(name);
    }


    @Transactional
    public void addCourseSI(CourseSI coursesi) {
        this.coursesiDao.addCourseSI(coursesi);
    }

    public void deleteCourseSIById(Long uid) {
        this.coursesiDao.deleteCourseSIById(uid);
    }

    public void updateCourseSI(CourseSI coursesi) {
        this.coursesiDao.updateCourseSI(coursesi);
    }

}
