package com.example.second.controller;


import com.example.second.entity.Teacher;
import com.example.second.service.MenuService;
import com.example.second.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
@CrossOrigin(allowCredentials = "true")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    MenuService menuService;

    /**
     * 查询所有学生
     */
    @GetMapping("/findAllTeachers")
    public List<Teacher> findAllTeachers() {
        return this.teacherService.findAllTeachers();
    }

    /**
     * 增加学生
     */
    @PostMapping("/addTeacher")
    public void addTeacher(@RequestBody Teacher teacher){
        this.teacherService.addTeacher(teacher);
    }
//    @PostMapping("/addTeacher")
//    public boolean addTeacher(@RequestBody Teacher teacher) {
//        if(teacher.getAge()<20||teacher.getAge()>100){
//            return false;
//        }else if(teacher.getSex().equals("男")&&teacher.getSex().equals("女")){
//            return false;
//        }else if(teacher.getMarried().equals("已婚")&&teacher.getMarried().equals("未婚")){
//            return false;
//        }else if(teacher.getHeight()<100||teacher.getHeight()>250){
//            return false;
//        }else if (teacher.getParty_member().equals("是")&&teacher.getParty_member().equals("否")){
//            return false;
//        }else if (teacher.getWeight()<40||teacher.getWeight()>150){
//            return false;
//        }else {
//            this.teacherService.addTeacher(teacher);
//            return true;
//        }
//    }

    /**
     * 根据学生id删除学生
     */
    @PostMapping("/deleteTeacher")
    public void deleteTeacherById(@RequestParam Long uid) {
        this.teacherService.deleteTeacherById(uid);
    }

    /**
     * 编辑学生
     */
    @PostMapping("/updateTeacher")
    public void updateTeacher(@RequestBody Teacher teacher){
        this.teacherService.updateTeacher(teacher);
    }
//    @PostMapping("/updateTeacher")
//    public boolean updateTeacher(@RequestBody Teacher teacher) {
//        if(teacher.getAge()<20||teacher.getAge()>100){
//            return false;
//        }else if(!teacher.getSex().equals("男")&&!teacher.getSex().equals("女")){
//            return false;
//        }else if(!teacher.getMarried().equals("已婚")&&!teacher.getMarried().equals("未婚")){
//            return false;
//        }else if(teacher.getHeight()<100||teacher.getHeight()>250){
//            return false;
//        }else if (!teacher.getParty_member().equals("是")&&!teacher.getParty_member().equals("否")){
//            return false;
//        }else if (teacher.getWeight()<40||teacher.getWeight()>150){
//            return false;
//        }else {
//            this.teacherService.updateTeacher(teacher);
//            return true;
//        }
//    }

    /**
     * 根据学生姓名查找学生
     */
    @GetMapping("/findTeacherByName")
    public List<Teacher> findTeacherByName(@RequestParam String name) {
        return this.teacherService.findTeacherByName(name);
    }

    /**
     * 批量删除学生
     */
    @PostMapping("/deleteTeachersByIds")
    public Integer deleteTeachersByIds(Integer[] ids) {
        return this.teacherService.deleteTeachersByIds(ids);
    }
}
