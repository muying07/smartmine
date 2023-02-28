package com.muying.smartmine.kv.biz.service;

import com.muying.smartmine.kv.dto.req.BatchAddCommentContentReqDTO;
import com.muying.smartmine.kv.dto.req.BatchFindCommentContentReqDTO;
import com.muying.framework.common.response.Response;
import com.muying.smartmine.kv.dto.req.DeleteCommentContentReqDTO;

/**
 * @description: 评论内容存储业务
 **/
public interface CommentContentService {


    /**
     * 批量添加评论内容
     * @param batchAddCommentContentReqDTO
     * @return
     */
    Response<?> batchAddCommentContent(BatchAddCommentContentReqDTO batchAddCommentContentReqDTO);

    /**
     * 批量查询评论内容
     * @param batchFindCommentContentReqDTO
     * @return
     */
    Response<?> batchFindCommentContent(BatchFindCommentContentReqDTO batchFindCommentContentReqDTO);

    /**
     * 删除评论内容
     * @param deleteCommentContentReqDTO
     * @return
     */
    Response<?> deleteCommentContent(DeleteCommentContentReqDTO deleteCommentContentReqDTO);
}
