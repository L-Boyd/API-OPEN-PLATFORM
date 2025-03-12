package com.lbytech.apibackend.utils;

import com.lbytech.apibackend.model.common.BaseResponse;

/**
 * 返回工具类
 *
 * @author lby
 */
public class ResultUtils {

    /**
     * 成功
     *
     * @param data
     * @return
     * @param <T>
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

}
