package com.muying.smartmine.auth.controller;

import com.muying.framework.biz.operationlog.aspect.ApiOperationLog;
import com.muying.framework.common.response.Response;
import com.muying.smartmine.auth.model.vo.verificationcode.SendVerificationCodeReqVO;
import com.muying.smartmine.auth.service.VerificationCodeService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/verification")
public class VerificationCodeController {

    @Resource
    private VerificationCodeService verificationCodeService;

    @PostMapping("/code/send")
    @ApiOperationLog(description = "发送短信验证码")
    public Response<?> send(@Validated @RequestBody SendVerificationCodeReqVO sendVerificationCodeReqVO) {
        return verificationCodeService.send(sendVerificationCodeReqVO);
    }

}
