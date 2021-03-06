package com.yyy.student.controller.DTO;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:  学生列表请求对象
 * @author: yuyao.yang
 * @create: 2020/6/12 1:18
 **/
@Data
public class StudentListRequest implements Serializable {
    /**
     * 页码
     */
    private Integer pageNo;
    /**
     * 页数
     */
    private Integer pageSize;
    /**
     * 学生编号
     */
    private String studentNo;

    /**
     * 班级编号
     */
    private String classNo;

    /**
     * 性别
     */
    private Integer sex;

}
