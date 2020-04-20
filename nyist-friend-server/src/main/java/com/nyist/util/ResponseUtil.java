package com.nyist.util;


import com.nyist.dto.ResultDto;

/**
 * @author limaozhan
 * @date 2020-01-07 19:57
 */
public class ResponseUtil {

  public static ResultDto makeSuccess(String msg) {
    return new ResultDto(0, msg, null);
  }

  public static ResultDto makeSuccess(String msg, Object object) {
    return new ResultDto(0, msg, object);
  }

  public static ResultDto makeSuccess() {
    return new ResultDto(0, "执行成功", null);
  }

  public static ResultDto makeFail(String msg) {
    return new ResultDto(-1, msg, null);
  }

  public static ResultDto makeFail(String msg, Object object) {
    return new ResultDto(-1, msg, object);
  }

  public static ResultDto makeFail() {
    return new ResultDto(-1, "执行失败", null);
  }

}
