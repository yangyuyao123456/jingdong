package com.yyy.student.controller.DTO;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @description:  学生列表返回对象
 * @author: yuyao.yang
 * @create: 2020/6/12 1:18
 **/
@Data
public class StudentListResponse implements Serializable {

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

    /**
     * 学生状态
     */
    private Integer studentStatus;

}
