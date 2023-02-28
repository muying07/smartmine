package com.muying.smartmine.search.biz.service;

import com.muying.framework.common.response.PageResponse;
import com.muying.framework.common.response.Response;
import com.muying.smartmine.search.biz.model.vo.SearchUserReqVO;
import com.muying.smartmine.search.biz.model.vo.SearchUserRspVO;
import com.muying.smartmine.search.dto.RebuildUserDocumentReqDTO;

/**
 * @description: 用户搜索业务
 **/
public interface UserService {

    /**
     * 搜索用户
     * @param searchUserReqVO
     * @return
     */
    PageResponse<SearchUserRspVO> searchUser(SearchUserReqVO searchUserReqVO);
    /**
     * 重建用户文档
     * @param rebuildUserDocumentReqDTO
     * @return
     */
    Response<Long> rebuildDocument(RebuildUserDocumentReqDTO rebuildUserDocumentReqDTO);
}

