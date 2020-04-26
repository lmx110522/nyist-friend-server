package com.nyist.exception.handler;


import com.nyist.dto.ResultDto;
import com.nyist.exception.BusinessException;
import com.nyist.util.ResponseUtil;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author limaozhan
 * @date 2020-01-14 08:39
 * @desc 异常统一处理类
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(value = {Exception.class})
  @ResponseBody
  public ResultDto jsonHandler(HttpServletRequest request, Exception e) throws IOException {
    e.printStackTrace();
    if (e instanceof BusinessException) {
      log.error("请求路径:{}", request.getRequestURI());
      log.error("请求方法:{}", request.getMethod());
      if (request.getMethod().equals(RequestMethod.GET)) {
        log.error("请求参数:{}", request.getQueryString());
      } else if (request.getMethod().equals(RequestMethod.POST)) {
        log.error("请求参数:{}", request.getReader().toString());
      }
      log.error("异常原因:{}", e);
      return ResponseUtil.makeFail(e.getMessage());
    } else if (e instanceof MethodArgumentNotValidException) {
      MethodArgumentNotValidException exception = (MethodArgumentNotValidException) e;
      BindingResult result = exception.getBindingResult();
      StringBuilder errorMsg = new StringBuilder();
      if (result.hasErrors()) {
        List<FieldError> fieldErrors = result.getFieldErrors();
        fieldErrors.forEach(error -> {
          System.out.println("field" + error.getField() + ", msg:" + error.getDefaultMessage());
          errorMsg.append(error.getDefaultMessage()).append("!");
        });
      }
      return ResponseUtil.makeFail(errorMsg.toString());
    }
    return ResponseUtil.makeFail(e.getCause().getMessage());
  }
}   