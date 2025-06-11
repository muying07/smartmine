package com.muying.xiaohongshu.comment.biz.controller;

import com.muying.framework.biz.operationlog.aspect.ApiOperationLog;
import com.muying.framework.common.response.PageResponse;
import com.muying.framework.common.response.Response;
import com.muying.xiaohongshu.comment.biz.model.vo.FindCommentItemRspVO;
import com.muying.xiaohongshu.comment.biz.model.vo.FindCommentPageListReqVO;
import com.muying.xiaohongshu.comment.biz.model.vo.PublishCommentReqVO;
import com.muying.xiaohongshu.comment.biz.service.CommentService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 评论
 **/
@RestController
@RequestMapping("/comment")
@Slf4j
public class CommentController {

    @Resource
    private CommentService commentService;

    @PostMapping("/publish")
    @ApiOperationLog(description = "发布评论")
    public Response<?> publishComment(@Validated @RequestBody PublishCommentReqVO publishCommentReqVO) {
        return commentService.publishComment(publishCommentReqVO);
    }

    @PostMapping("/list")
    @ApiOperationLog(description = "评论分页查询")
    public PageResponse<FindCommentItemRspVO> findCommentPageList(@Validated @RequestBody FindCommentPageListReqVO findCommentPageListReqVO) {
        return commentService.findCommentPageList(findCommentPageListReqVO);
    }

}
