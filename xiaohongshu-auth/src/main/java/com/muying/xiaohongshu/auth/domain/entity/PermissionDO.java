package com.muying.xiaohongshu.auth.domain.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PermissionDO {

    private Long id;

    private Long parentId;

    private String name;

    private Byte type;

    private String menuUrl;

    private String menuIcon;

    private Integer sort;

    private String permissionKey;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private Boolean isDeleted;
}