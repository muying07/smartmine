package com.muying.smartmine.distributed.id.generator.biz.core;


import com.muying.smartmine.distributed.id.generator.biz.core.common.Result;

public interface IDGen {
    Result get(String key);
    boolean init();
}
