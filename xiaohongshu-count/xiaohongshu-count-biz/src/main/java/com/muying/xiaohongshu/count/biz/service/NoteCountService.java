package com.muying.xiaohongshu.count.biz.service;



import com.muying.framework.common.response.Response;
import com.muying.xiaohongshu.count.dto.FindNoteCountsByIdRspDTO;
import com.muying.xiaohongshu.count.dto.FindNoteCountsByIdsReqDTO;

import java.util.List;

/**
 * @author: 犬小哈
 * @date: 2024/4/7 15:41
 * @version: v1.0.0
 * @description: 笔记计数业务
 **/
public interface NoteCountService {

    /**
     * 批量查询笔记计数
     * @param findNoteCountsByIdsReqDTO
     * @return
     */
    Response<List<FindNoteCountsByIdRspDTO>> findNotesCountData(FindNoteCountsByIdsReqDTO findNoteCountsByIdsReqDTO);
}
