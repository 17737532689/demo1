package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.charset.Charset;

@ControllerAdvice
public class uploadException {
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public void maxException(MaxUploadSizeExceededException e, HttpServletResponse
                              resq){

        resq.setContentType("text/html; Charset=utf-8");

      }
}
