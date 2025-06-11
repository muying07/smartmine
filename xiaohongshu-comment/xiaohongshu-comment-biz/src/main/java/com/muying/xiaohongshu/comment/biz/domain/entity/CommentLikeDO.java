package com.muying.xiaohongshu.comment.biz.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentLikeDO {
    private Long id;

    private Long userId;

    private Long commentId;

    private LocalDateTime createTime;
}
