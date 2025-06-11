package com.muying.xiaohongshu.search.biz.service;

import com.muying.framework.common.response.PageResponse;
import com.muying.framework.common.response.Response;
import com.muying.xiaohongshu.search.biz.model.vo.SearchNoteReqVO;
import com.muying.xiaohongshu.search.biz.model.vo.SearchNoteRspVO;
import com.muying.xiaohongshu.search.dto.RebuildNoteDocumentReqDTO;

/**
 * @description: 笔记搜索业务
 **/
public interface NoteService {

    /**
     * 搜索笔记
     * @param searchNoteReqVO
     * @return
     */
    PageResponse<SearchNoteRspVO> searchNote(SearchNoteReqVO searchNoteReqVO);
    /**
     * 重建笔记文档
     * @param rebuildNoteDocumentReqDTO
     * @return
     */
    Response<Long> rebuildDocument(RebuildNoteDocumentReqDTO rebuildNoteDocumentReqDTO);
}
