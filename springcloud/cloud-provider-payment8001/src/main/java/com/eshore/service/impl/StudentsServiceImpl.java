package com.eshore.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eshore.enties.Student;
import com.eshore.mapper.StudentMapper;
import com.eshore.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * 学生类的实现类
 * @author Wen Hao
 * @Date 2020/9/11 15:36
 */
@Service
public class StudentsServiceImpl extends ServiceImpl<StudentMapper,Student> implements StudentService {
//    @Override
//    public List<Student> findAll() {
//        baseMapper.list()
//        return null;
//    }

    @Override
    public Student getStudentById(Integer id) {
        Student student = baseMapper.selectById(id);
        return student;
    }

    @Override
    public Integer insertStudent(Student student) {
        int insert = baseMapper.insert(student);
        return insert;
    }
}
