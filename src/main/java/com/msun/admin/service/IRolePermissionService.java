package com.msun.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msun.admin.common.utils.PageUtils;
import com.msun.admin.entity.po.RolePermission;

import java.util.Map;
import java.util.List;

/**
 * 
 *
 * @author ChenDingheng
 * @email m13411907763@163.com
 * @date 2021-08-23 14:36:31
 */
public interface IRolePermissionService extends IService<RolePermission> {

    PageUtils queryPage(Map<String, Object> params);

    List<RolePermission> getAll();

}

