package com.muying.smartmine.comment.biz.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NoteCountDO {
    private Long id;

    private Long noteId;

    private Long likeTotal;

    private Long collectTotal;

    private Long commentTotal;
}
