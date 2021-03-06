package com.yyy.student.controller.DTO;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:  学生信息操作请求对象
 * @author: yuyao.yang
 * @create: 2020/6/12 1:18
 **/
@Data
public class StudentRequest implements Serializable {
    /**
     * 学生编号
     */
    private String studentNo;

    /**
     * 班级编号
     */
    private String classNo;

    /**
     * 年级编号
     */
    private String gradeNo;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private Integer sex;
}
