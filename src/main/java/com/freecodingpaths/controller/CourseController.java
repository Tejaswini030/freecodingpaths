package com.freecodingpaths.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;



import com.freecodingpaths.entity.Courses;
//import com.freecodingpaths.service.CourseService;

import java.util.*;


@Controller
public class CourseController {
    
    @Autowired
    //private CourseService service;
    
    @GetMapping("/")
    public String home() {
        return "home";
    }
    
    @GetMapping("/add_new_course")
    public String addNewCourse() {
        return "add_new_course";
    }
    
    @GetMapping("/courses")
    public String courses() {
        return "courses";
    }
    
    @GetMapping("/learning_paths")
    public String learningPaths() {
        return "learning_paths";
    }
        
    @PostMapping("/save")
    public String addNewCourse(@ModelAttribute Courses c) {
        //service.save(c);
        return "redirect:/courses";
    }

}
