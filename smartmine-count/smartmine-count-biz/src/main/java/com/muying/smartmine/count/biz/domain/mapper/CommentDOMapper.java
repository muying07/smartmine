package com.muying.smartmine.count.biz.domain.mapper;

import com.muying.smartmine.count.biz.domain.entity.CommentDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommentDO record);

    int insertSelective(CommentDO record);

    CommentDO selectByPrimaryKey(Long id);

    /**
     * 根据评论 ID 批量查询
     * @param commentIds
     * @return
     */
    List<CommentDO> selectByCommentIds(@Param("commentIds") List<Long> commentIds);

    int updateByPrimaryKeySelective(CommentDO record);

    int updateByPrimaryKey(CommentDO record);

    /**
     * 更新一级评论的子评论总数
     * @param parentId
     * @param count
     * @return
     */
    int updateChildCommentTotal(@Param("parentId") Long parentId, @Param("count") int count);

    /**
     * 更新评论点赞数
     * @param count
     * @param commentId
     * @return
     */
    int updateLikeTotalByCommentId(@Param("count") Integer count,
                                   @Param("commentId") Long commentId);
}