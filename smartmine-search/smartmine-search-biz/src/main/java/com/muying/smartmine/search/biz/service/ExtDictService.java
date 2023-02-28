package com.muying.smartmine.search.biz.service;

import org.springframework.http.ResponseEntity;

/**
 * @description: 拓展词典
 **/
public interface ExtDictService {

    /**
     * 获取热更新词典
     * @return
     */
    ResponseEntity<String> getHotUpdateExtDict();
}
