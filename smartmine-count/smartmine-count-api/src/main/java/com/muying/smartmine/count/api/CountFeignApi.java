package com.muying.smartmine.count.api;


import com.muying.framework.common.response.Response;
import com.muying.smartmine.count.constant.ApiConstants;
import com.muying.smartmine.count.dto.FindNoteCountsByIdRspDTO;
import com.muying.smartmine.count.dto.FindNoteCountsByIdsReqDTO;
import com.muying.smartmine.count.dto.FindUserCountsByIdReqDTO;
import com.muying.smartmine.count.dto.FindUserCountsByIdRspDTO;
import com.muying.smartmine.count.fallback.CountFeignApiFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @description: 计数服务 Feign 接口
 **/
@FeignClient(name = ApiConstants.SERVICE_NAME, fallback = CountFeignApiFallback.class)
public interface CountFeignApi {

    String PREFIX = "/count";

    /**
     * 查询用户计数
     *
     * @param findUserCountsByIdReqDTO
     * @return
     */
    @PostMapping(value = PREFIX + "/user/data")
    Response<FindUserCountsByIdRspDTO> findUserCount(@RequestBody FindUserCountsByIdReqDTO findUserCountsByIdReqDTO);

    /**
     * 批量查询笔记计数
     *
     * @param findNoteCountsByIdsReqDTO
     * @return
     */
    @PostMapping(value = PREFIX + "/notes/data")
    Response<List<FindNoteCountsByIdRspDTO>> findNotesCount(@RequestBody FindNoteCountsByIdsReqDTO findNoteCountsByIdsReqDTO);
}
