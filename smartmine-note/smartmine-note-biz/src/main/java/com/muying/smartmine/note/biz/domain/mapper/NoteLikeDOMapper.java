package com.muying.smartmine.note.biz.domain.mapper;

import com.muying.smartmine.note.biz.domain.entity.NoteLikeDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NoteLikeDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NoteLikeDO record);

    int insertSelective(NoteLikeDO record);

    NoteLikeDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NoteLikeDO record);

    int updateByPrimaryKey(NoteLikeDO record);

    int selectCountByUserIdAndNoteId(@Param("userId") Long userId, @Param("noteId") Long noteId);

    List<NoteLikeDO> selectByUserId(@Param("userId") Long userId);

    int selectNoteIsLiked(@Param("userId") Long userId, @Param("noteId") Long noteId);

    List<NoteLikeDO> selectLikedByUserIdAndLimit(@Param("userId") Long userId, @Param("limit")  int limit);
    /**
     * 新增笔记点赞记录，若已存在，则更新笔记点赞记录
     * @param noteLikeDO
     * @return
     */
    int insertOrUpdate(NoteLikeDO noteLikeDO);

    /**
     * 取消点赞
     * @param noteLikeDO
     * @return
     */
    int update2UnlikeByUserIdAndNoteId(NoteLikeDO noteLikeDO);

    /**
     * 批量插入或更新
     * @param noteLikeDOS
     * @return
     */
    int batchInsertOrUpdate(@Param("noteLikeDOS") List<NoteLikeDO> noteLikeDOS);

    /**
     * 查询用户，对于一批量笔记的已点赞记录
     * @param userId
     * @param noteIds
     * @return
     */
    List<NoteLikeDO> selectByUserIdAndNoteIds(@Param("userId") Long userId,
                                              @Param("noteIds") List<Long> noteIds);
}