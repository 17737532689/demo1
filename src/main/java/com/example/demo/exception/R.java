package com.example.demo.exception;

import com.sun.org.apache.bcel.internal.classfile.Code;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import lombok.Data;

@Data
public class R extends Exception {

 private  int code;
 private   String message;

 public R(){}

 public R(String message){
     this.message=message;
 }

    public static R ok(){

        R r =new R();
        r.setCode(200);
        r.setMessage("ok");
        return r;
    }

    public static R error(String message){
        R r =new R();
        r.setCode(500);
        r.setMessage(message);
        return r;
    }



}
