package com.muying.smartmine.user.relation.biz.domain.entity;

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
public class FollowingDO {
    private Long id;

    private Long userId;

    private Long followingUserId;

    private LocalDateTime createTime;

}