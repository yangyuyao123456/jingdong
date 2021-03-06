package com.yyy.student.service;

import com.github.pagehelper.PageInfo;
import com.yyy.student.controller.DTO.*;

import java.util.List;

/**
 * @description:  班级管理接口
 * @author: yuyao.yang
 * @create: 2020/6/11 23:58
 **/

public interface ClassService {

    /**
     * @Author: yuyao.yang
     * @Description: 查询所有班级列表
     * @Date: 0:34 2020/6/12
     * @Param:
     * @return:  List<ClassResponse>
     **/
    List<ClassResponse> selectAll();

    /**
     * @Author: yuyao.yang
     * @Description:  根据班级编号查询班级
     * @Date: 5:42 2020/6/12
     * @Param: [classId]
     * @return: com.yyy.student.controller.DTO.ClassResponse
     **/
    ClassResponse selectByClassId(Integer classId);

    /**
     * @Author: yuyao.yang
     * @Description:  编辑班级信息
     * @Date: 1:41 2020/6/12
     * @Param: [classRequest]
     * @return: java.lang.Integer
     **/
    Integer editClass(ClassRequest classRequest);

    /**
     * @Author: yuyao.yang
     * @Description: 新增班级信息
     * @Date: 0:10 2020/6/12
     * @Param: [classRequest]
     * @return: java.lang.Integer
     **/
    Integer addClass(ClassRequest classRequest);

    /**
     * @Author: yuyao.yang
     * @Description: 根据班级编号删除班级
     * @Date: 5:44 2020/6/12
     * @Param: [classId]
     * @return: java.lang.Integer
     **/
    Integer deleteClass(Integer classId);
}
