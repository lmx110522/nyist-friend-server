package com.nyist.dto;

import java.util.Collection;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 返回结果
 *
 * @author limaozhan
 * @date 2020-03-10 09:54
 */
@Data
@AllArgsConstructor
public class ResultDto<T> {

  private int code;

  private String msg;

  private Integer size;

  private T obj;

  public ResultDto() {
  }

  public ResultDto(int code, String msg, T obj) {
    this.code = code;
    this.msg = msg;
    this.obj = obj;
    if (obj != null) {
      if (obj instanceof Collection) {
        this.size = ((Collection) obj).size();
      }
    }
  }
}
