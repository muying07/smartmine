package com.muying.smartmine.kv.biz.domain.repository;

import com.muying.smartmine.kv.biz.domain.entity.CommentContentDO;
import com.muying.smartmine.kv.biz.domain.entity.CommentContentPrimaryKey;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;
import java.util.UUID;
/**
 * @description: TODO
 **/
public interface CommentContentRepository extends CassandraRepository<CommentContentDO, CommentContentPrimaryKey> {

    /**
     * 批量查询评论内容
     * @param noteId
     * @param yearMonths
     * @param contentIds
     * @return
     */
    List<CommentContentDO> findByPrimaryKeyNoteIdAndPrimaryKeyYearMonthInAndPrimaryKeyContentIdIn(
            Long noteId, List<String> yearMonths, List<UUID> contentIds
    );

    /**
     * 删除评论正文
     * @param noteId
     * @param yearMonth
     * @param contentId
     */
    void deleteByPrimaryKeyNoteIdAndPrimaryKeyYearMonthAndPrimaryKeyContentId(Long noteId, String yearMonth, UUID contentId);
}
