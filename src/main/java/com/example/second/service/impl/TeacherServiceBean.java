package com.example.second.service.impl;

import com.example.second.dao.TeacherDao;
import com.example.second.entity.Teacher;
import com.example.second.exception.ValidateException;
import com.example.second.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
//@Transactional(rollbackFor = Exception.class)
public class TeacherServiceBean implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    public List<Teacher> findAllTeachers() {
        return this.teacherDao.findAllTeachers();
    }


    @Transactional
    public void addTeacher(Teacher teacher) {
        if(errors(teacher).size()>0){//errors是一个函数，返回值为错误信息List
            throw new ValidateException("-1",errors(teacher).toString());
        }else {
            this.teacherDao.addTeacher(teacher);
        }
//        this.teacherCopyDao.addTeacher(teacher);
        Integer count = this.teacherDao.getCountTeachers();
        //没有加@Transactional注解，万一出现错误，新增人数会成功，但是学生表的总人数没有改变，出现了数据的不一致。
        //int x = 5 / 0
    }

    public void deleteTeacherById(Long uid) {
        this.teacherDao.deleteTeacherById(uid);
        Integer count = this.teacherDao.getCountTeachers();
    }
    public List<String> errors(Teacher teacher){
        List<String> errors = new ArrayList<>();
        if(teacher.getUid()==null||teacher.getUid()>1000||teacher.getUid()<1){
            errors.add("ID输入错误");
        }
        if(teacher.getName()==null||teacher.getName().equals("")||teacher.getName().length()<2){
            errors.add("名字输入有误");
        }
        if(teacher.getHeight()==null||teacher.getHeight()<100||teacher.getHeight()>250){
            errors.add("身高错误");
        }
        if(teacher.getWeight()==null||teacher.getWeight()<40||teacher.getWeight()>150){
            errors.add("体重错误");
        }
        if(teacher.getAge()==null||teacher.getAge()<20||teacher.getAge()>80){
            errors.add("年龄错误");
        }
        if(teacher.getMarried()==null||(!teacher.getMarried().equals("已婚")&& !teacher.getMarried().equals("未婚"))){
            errors.add("婚姻情况错误");
        }
        if(teacher.getPhone().matches("^(13[0-9]|14[5|7]|15[0|1|2|3|4|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$")){
            errors.add("电话号码错误");
        }
        return errors;
    }
    public void updateTeacher(Teacher teacher) {
        if (errors(teacher).size()>0){
            throw new ValidateException("-1",errors(teacher).toString());
        }else {
            this.teacherDao.updateTeacher(teacher);
        }
    }

    public List<Teacher> findTeacherByName(String name) {
        return this.teacherDao.findTeacherByName(name);
    }

    public Integer deleteTeachersByIds(Integer[] ids) {
        return this.teacherDao.deleteTeachersByIds(ids);
    }

}
