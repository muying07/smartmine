package com.muying.xiaohongshu.auth.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: 逻辑删除
 **/
@Getter
@AllArgsConstructor
public enum DeletedEnum {

    YES(true),
    NO(false);

    private final Boolean value;
}
