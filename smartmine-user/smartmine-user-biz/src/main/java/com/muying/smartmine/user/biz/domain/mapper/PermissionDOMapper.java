package com.muying.smartmine.user.biz.domain.mapper;



import com.muying.smartmine.user.biz.domain.entity.PermissionDO;

import java.util.List;

public interface PermissionDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PermissionDO record);

    int insertSelective(PermissionDO record);

    PermissionDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PermissionDO record);

    int updateByPrimaryKey(PermissionDO record);

    /**
     * 查询 APP 端所有被启用的权限
     *
     * @return
     */
    List<PermissionDO> selectAppEnabledList();
}