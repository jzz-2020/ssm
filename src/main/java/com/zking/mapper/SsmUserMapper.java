package com.zking.mapper;

import com.zking.model.SsmUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SsmUserMapper {


    /**
     * 根据id删除
     * @param userId
     * @return
     */
    int deleteByPrimaryKey(Integer userId);

    int insert(SsmUser ssmUser);

    int insertSelective(SsmUser record);


    /**
     *根据id查询单个
     * @param userId
     * @return
     */
    SsmUser selectByPrimaryKey(@Param("userId") Integer userId);

    int updateByPrimaryKeySelective(SsmUser record);

    /**
     * 查询全部
     * @return
     */
    List<SsmUser> selectSsmUserAll();

}