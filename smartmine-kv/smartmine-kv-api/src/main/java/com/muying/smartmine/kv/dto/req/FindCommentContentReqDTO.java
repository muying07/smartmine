package com.muying.smartmine.kv.dto.req;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 评论内容
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindCommentContentReqDTO {

    @NotBlank(message = "发布年月不能为空")
    private String yearMonth;

    @NotBlank(message = "评论正文 ID 不能为空")
    private String contentId;

}
