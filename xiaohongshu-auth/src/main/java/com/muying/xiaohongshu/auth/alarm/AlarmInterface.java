package com.muying.xiaohongshu.auth.alarm;

public interface AlarmInterface {
    /**
     * 发送告警信息
     *
     * @param message
     * @return
     */
    boolean send(String message);
}
