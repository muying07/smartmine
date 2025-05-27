package com.muying.xiaohongshu.note.biz.service;

import com.muying.framework.common.response.Response;
import com.muying.xiaohongshu.note.biz.model.vo.FindNoteDetailReqVO;
import com.muying.xiaohongshu.note.biz.model.vo.FindNoteDetailRspVO;
import com.muying.xiaohongshu.note.biz.model.vo.PublishNoteReqVO;
import com.muying.xiaohongshu.note.biz.model.vo.UpdateNoteReqVO;

/**
 * @description: 笔记业务
 **/
public interface NoteService {

    /**
     * 笔记发布
     * @param publishNoteReqVO
     * @return
     */
    Response<?> publishNote(PublishNoteReqVO publishNoteReqVO);

    /**
     * 笔记详情
     * @param findNoteDetailReqVO
     * @return
     */
    Response<FindNoteDetailRspVO> findNoteDetail(FindNoteDetailReqVO findNoteDetailReqVO);

    /**
     * 笔记更新
     * @param updateNoteReqVO
     * @return
     */
    Response<?> updateNote(UpdateNoteReqVO updateNoteReqVO);

}