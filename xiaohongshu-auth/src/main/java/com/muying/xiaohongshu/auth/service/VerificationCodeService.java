package com.muying.xiaohongshu.auth.service;

import com.muying.framework.common.response.Response;
import com.muying.xiaohongshu.auth.model.vo.verificationcode.SendVerificationCodeReqVO;

public interface VerificationCodeService {
    /**
     * 发送短信验证码
     *
     * @param sendVerificationCodeReqVO
     * @return
     */
    Response<?> send(SendVerificationCodeReqVO sendVerificationCodeReqVO);
}
