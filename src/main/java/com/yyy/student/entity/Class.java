package com.yyy.student.entity;

import lombok.Data;

/**
 * @Author: yuyao.yang
 * @Description:  班级类
 * @Date: 0:02 2020/6/12
 **/
@Data
public class Class {
    /**
     * 班级主键
     */
    private Integer classId;

    /**
     * 班级编号
     */
    private String classNo;
}