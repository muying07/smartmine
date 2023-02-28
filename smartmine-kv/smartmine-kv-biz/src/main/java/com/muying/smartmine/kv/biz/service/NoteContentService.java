package com.muying.smartmine.kv.biz.service;

import com.muying.framework.common.response.Response;
import com.muying.smartmine.kv.dto.req.AddNoteContentReqDTO;
import com.muying.smartmine.kv.dto.req.DeleteNoteContentReqDTO;
import com.muying.smartmine.kv.dto.req.FindNoteContentReqDTO;
import com.muying.smartmine.kv.dto.resp.FindNoteContentRspDTO;

/**
 * @description: 笔记内容存储业务
 **/
public interface NoteContentService {

    /**
     * 添加笔记内容
     *
     * @param addNoteContentReqDTO
     * @return
     */
    Response<?> addNoteContent(AddNoteContentReqDTO addNoteContentReqDTO);

    /**
     * 查询笔记内容
     *
     * @param findNoteContentReqDTO
     * @return
     */
    Response<FindNoteContentRspDTO> findNoteContent(FindNoteContentReqDTO findNoteContentReqDTO);

    /**
     * 删除笔记内容
     *
     * @param deleteNoteContentReqDTO
     * @return
     */
    Response<?> deleteNoteContent(DeleteNoteContentReqDTO deleteNoteContentReqDTO);
}
