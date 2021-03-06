package com.maxcar.base.service;

import java.io.Serializable;


/**
 * 业务逻辑层，通用接口
 *
 * @auther 罗顺锋
 * @create 2018/8/13
 */
public interface BaseService<T,ID extends Serializable> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T
     * 通用根据主键删除数据
     * @mbggenerated
     */
    int deleteByPrimaryKey(ID id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T
     *通用插入数据
     * @mbggenerated
     */
    int insert(T record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T
     *通用有选择性插入部分数据
     * @mbggenerated
     */
    int insertSelective(T record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T
     *通用根据主键查询数据
     * @mbggenerated
     */
    T selectByPrimaryKey(ID id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T
     *通用有选择性更新对象，注意必须有主键id
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(T record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T
     *通用更新对象，注意必须有主键id
     * @mbggenerated
     */
    int updateByPrimaryKey(T record);
}
