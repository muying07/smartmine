package com.muying.xiaohongshu.kv.api;

import com.muying.framework.common.response.Response;
import com.muying.xiaohongshu.kv.constant.ApiConstants;
import com.muying.xiaohongshu.kv.dto.req.AddNoteContentReqDTO;
import com.muying.xiaohongshu.kv.dto.req.DeleteNoteContentReqDTO;
import com.muying.xiaohongshu.kv.dto.req.FindNoteContentReqDTO;
import com.muying.xiaohongshu.kv.dto.resp.FindNoteContentRspDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @description: K-V 键值存储 Feign 接口
 **/
@FeignClient(name = ApiConstants.SERVICE_NAME)
public interface KeyValueFeignApi {

    String PREFIX = "/kv";

    @PostMapping(value = PREFIX + "/note/content/add")
    Response<?> addNoteContent(@RequestBody AddNoteContentReqDTO addNoteContentReqDTO);

    @PostMapping(value = PREFIX + "/note/content/find")
    Response<FindNoteContentRspDTO> findNoteContent(@RequestBody FindNoteContentReqDTO findNoteContentReqDTO);

    @PostMapping(value = PREFIX + "/note/content/delete")
    Response<?> deleteNoteContent(@RequestBody DeleteNoteContentReqDTO deleteNoteContentReqDTO);
}
