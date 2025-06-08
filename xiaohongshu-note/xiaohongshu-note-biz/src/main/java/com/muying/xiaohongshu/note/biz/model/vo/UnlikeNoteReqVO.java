package com.muying.xiaohongshu.note.biz.model.vo;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 取消点赞笔记
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UnlikeNoteReqVO {

    @NotNull(message = "笔记 ID 不能为空")
    private Long id;

}
