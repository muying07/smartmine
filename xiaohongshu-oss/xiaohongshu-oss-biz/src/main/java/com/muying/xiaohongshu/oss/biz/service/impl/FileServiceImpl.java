package com.muying.xiaohongshu.oss.biz.service.impl;

import com.muying.framework.common.response.Response;
import com.muying.xiaohongshu.oss.biz.service.FileService;
import com.muying.xiaohongshu.oss.biz.strategy.FileStrategy;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@Slf4j
public class FileServiceImpl implements FileService {

    @Resource
    private FileStrategy fileStrategy;

    private static final String BUCKET_NAME = "xiaohongshu";

    @Override
    public Response<?> uploadFile(MultipartFile file) {
        // 上传文件到
        fileStrategy.uploadFile(file, BUCKET_NAME);

        return Response.success();
    }
}
