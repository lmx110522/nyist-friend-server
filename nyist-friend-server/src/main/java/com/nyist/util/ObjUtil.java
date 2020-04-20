package com.nyist.util;

/**
 * @author limaozhan
 * @date 2020-02-11 14:52
 */
public class ObjUtil {

  /**
   * 使用此方法代替用"+"号拼接的方法 提高性能
   *
   * @param urls
   * @return
   */
  public static String linkObj(Object... urls) {
    StringBuffer buffer = new StringBuffer();
    if (urls.length == 0) {
      return "";
    }
    for (Object url : urls) {
      buffer.append(url);
    }
    return buffer.toString();
  }
}
