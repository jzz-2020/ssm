package com.zking.mapper;

import com.zking.model.SsmUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public interface SsmUserMapper {


    /**
     * 根据id删除
     * @param userId
     * @return
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * 注册
     * @param ssmUser
     * @return
     */
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


    /**
     * 用户登录
     * @param userId
     * @return
     */
    SsmUser findUser(Integer userId);


}