package com.muying.xiaohongshu.user.relation.biz.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FansDO {
    private Long id;

    private Long userId;

    private Long fansUserId;

    private LocalDateTime createTime;

}