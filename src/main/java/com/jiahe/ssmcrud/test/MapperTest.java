package com.jiahe.ssmcrud.test;

import com.jiahe.ssmcrud.Bean.Student;
import com.jiahe.ssmcrud.Bean.StudentExample;
import com.jiahe.ssmcrud.Dao.DepartmentMapper;
import com.jiahe.ssmcrud.Dao.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {

    @Autowired
    DepartmentMapper departmentMapper;


    @Autowired
    StudentMapper studentMapper;

    @Test
    public void test() {

        System.out.println(departmentMapper);
        //studentMapper.insertSelective(new Student(null, "妒火火", "M", "yangyang@163.com", 1));


    }
}
