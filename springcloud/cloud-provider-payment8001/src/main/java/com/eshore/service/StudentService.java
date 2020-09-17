package com.eshore.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.eshore.enties.Student;
import org.springframework.stereotype.Service;

/**
 * @author Wen Hao
 * @Date 2020/9/11 15:29
 */
@Service
public interface StudentService extends IService<Student> {
//    /**
//     * 获取全部的学生的信息
//     * @return
//     */
//    List<Student> findAll();

    /**
     * 根据id来查询信息
     * @param id
     * @return
     */
    Student getStudentById(Integer id);

    /**
     * 插入学生的信息
     * @param student
     * @return
     */
    Integer insertStudent(Student student);
}
