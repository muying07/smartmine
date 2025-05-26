package com.muying.xiaohongshu.user.biz.service;

import com.muying.xiaohongshu.user.biz.model.vo.UpdateUserInfoReqVO;
import com.muying.framework.common.response.Response;
/**
 * @description: 用户业务
 **/
public interface UserService {

    /**
     * 更新用户信息
     *
     * @param updateUserInfoReqVO
     * @return
     */
    Response<?> updateUserInfo(UpdateUserInfoReqVO updateUserInfoReqVO);
}

