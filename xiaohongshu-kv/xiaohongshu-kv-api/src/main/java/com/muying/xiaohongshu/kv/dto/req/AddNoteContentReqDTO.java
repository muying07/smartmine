package com.muying.xiaohongshu.kv.dto.req;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 新增笔记内容
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddNoteContentReqDTO {

    @NotBlank(message = "笔记内容 UUID 不能为空")
    private String uuid;

    @NotBlank(message = "笔记内容不能为空")
    private String content;

}

