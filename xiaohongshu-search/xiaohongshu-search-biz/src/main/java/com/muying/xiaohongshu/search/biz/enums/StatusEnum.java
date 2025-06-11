package com.muying.xiaohongshu.search.biz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


/**
 * @description: 用户状态
 **/
@Getter
@AllArgsConstructor
public enum StatusEnum {

    ENABLE(0), // 已启用
    DISABLED(1), // 禁用
    ;

    private final Integer code;

}