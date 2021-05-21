package com.example.second.controller;


import com.example.second.entity.Book;
import com.example.second.entity.CourseSI;
import com.example.second.service.CourseSIService;
import com.example.second.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CourseSI")
@CrossOrigin(allowCredentials = "true")
public class CourseSIController {

    @Autowired
    private CourseSIService coursesiService;

    @Autowired
    MenuService menuService;


    /**
     * 查询所有数据
     */
    @GetMapping("/findAllCourseSIs")
    public List<CourseSI> findAllCourseSIs() {
        return this.coursesiService.findAllCourseSIs();
    }


    /**
     * 查询所有数据
     */
    @GetMapping("/findCourseSIByName")
    public String findAllCourseSIByName(@RequestParam String name) {
        return this.coursesiService.findCourseSIByName(name);
    }

    /**
     * 增加数据
     */
    @PostMapping("/addCourseSI")
    public void addCourseSI(@RequestBody CourseSI coursesi){
        this.coursesiService.addCourseSI(coursesi);
    }

    /**
     * 根据数据id删除数据
     */
    @PostMapping("/deleteCourseSI")
    public void deleteCourseSIById(@RequestParam Long uid) {
        this.coursesiService.deleteCourseSIById(uid);
    }

    /**
     * 编辑数据
     */
    @PostMapping("/updateCourseSI")

    public void updateCourseSI(@RequestBody CourseSI coursesi){
        this.coursesiService.updateCourseSI(coursesi);
    }
}
