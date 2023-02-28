package com.muying.smartmine.note.biz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: 笔记收藏、取消收藏 Type
 **/
@Getter
@AllArgsConstructor
public enum CollectUnCollectNoteTypeEnum {
    // 收藏
    COLLECT(1),
    // 取消收藏
    UN_COLLECT(0),
    ;

    private final Integer code;

}
