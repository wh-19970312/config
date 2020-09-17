package com.eshore.controller;

import com.eshore.enties.Student;
import com.eshore.json.Result;
import com.eshore.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Wen Hao
 * @Date 2020/9/11 16:00
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService service;
    @GetMapping("/getAll")
    public Result getStudent(){
        List<Student> list = service.list();
        return Result.ok().data("record",list);
    }
    @GetMapping("/getById/{id}")
    public Result getStudentById(@PathVariable Integer id){
        Student student = service.getById(id);
        return Result.ok().data("student",student);
    }
    @PostMapping("/insert")
    public Result insertStudent(Student student){
        boolean save = service.save(student);
        return Result.ok();
    }
}
