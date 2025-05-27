package com.muying.xiaohongshu.user.biz.service;

import com.muying.xiaohongshu.user.biz.model.vo.UpdateUserInfoReqVO;
import com.muying.framework.common.response.Response;
import com.muying.xiaohongshu.user.dto.req.FindUserByPhoneReqDTO;
import com.muying.xiaohongshu.user.dto.req.RegisterUserReqDTO;
import com.muying.xiaohongshu.user.dto.req.UpdateUserPasswordReqDTO;
import com.muying.xiaohongshu.user.dto.resp.FindUserByPhoneRspDTO;

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
    /**
     * 用户注册
     *
     * @param registerUserReqDTO
     * @return
     */
    Response<Long> register(RegisterUserReqDTO registerUserReqDTO);
    /**
     * 根据手机号查询用户信息
     *
     * @param findUserByPhoneReqDTO
     * @return
     */
    Response<FindUserByPhoneRspDTO> findByPhone(FindUserByPhoneReqDTO findUserByPhoneReqDTO);

    /**
     * 更新密码
     *
     * @param updateUserPasswordReqDTO
     * @return
     */
    Response<?> updatePassword(UpdateUserPasswordReqDTO updateUserPasswordReqDTO);
}

