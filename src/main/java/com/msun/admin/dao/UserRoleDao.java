package com.msun.admin.dao;

import com.msun.admin.entity.po.UserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import org.apache.ibatis.annotations.Select;

/**
 * 
 * 
 * @author ChenDingheng
 * @email m13411907763@163.com
 * @date 2021-08-23 14:36:31
 */
@Mapper
public interface UserRoleDao extends BaseMapper<UserRole> {
    @Select("select * from user_role where is_deleted = 0")
    List<UserRole> getAll();
}
