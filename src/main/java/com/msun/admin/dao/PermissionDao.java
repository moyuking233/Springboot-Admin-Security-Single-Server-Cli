package com.msun.admin.dao;

import com.msun.admin.entity.dto.PermissionDto;
import com.msun.admin.entity.po.Permission;
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
public interface PermissionDao extends BaseMapper<Permission> {
    @Select("select * from permission where is_deleted = 0")
    List<Permission> getAll();

    List<PermissionDto> getAllPermissionsWithRoles();
}
