package com.muying.xiaohongshu.comment.biz.service;

import com.muying.framework.common.response.PageResponse;
import com.muying.framework.common.response.Response;
import com.muying.xiaohongshu.comment.biz.model.vo.FindCommentItemRspVO;
import com.muying.xiaohongshu.comment.biz.model.vo.FindCommentPageListReqVO;
import com.muying.xiaohongshu.comment.biz.model.vo.PublishCommentReqVO;

/**
 * @description: 评论业务
 **/
public interface CommentService {

    /**
     * 发布评论
     * @param publishCommentReqVO
     * @return
     */
    Response<?> publishComment(PublishCommentReqVO publishCommentReqVO);

    /**
     * 评论列表分页查询
     * @param findCommentPageListReqVO
     * @return
     */
    PageResponse<FindCommentItemRspVO> findCommentPageList(FindCommentPageListReqVO findCommentPageListReqVO);
}