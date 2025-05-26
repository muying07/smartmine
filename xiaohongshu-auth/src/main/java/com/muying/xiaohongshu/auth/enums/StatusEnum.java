package com.muying.xiaohongshu.auth.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: 状态
 **/
@Getter
@AllArgsConstructor
public enum StatusEnum {
    // 启用
    ENABLE(0),
    // 禁用
    DISABLED(1);

    private final Integer value;
}
