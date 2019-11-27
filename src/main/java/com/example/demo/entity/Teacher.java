package com.example.demo.entity;

/**
 * @param
 * @author yangchaojie
 * @return
 */
public class Teacher {

    private String Tno;

    private  String Tname;

    private String Type;

    private  String Tpassword;

    public String getTno() {
        return Tno;
    }

    public void setTno(String tno) {
        Tno = tno;
    }

    public String getTname() {
        return Tname;
    }

    public void setTname(String tname) {
        Tname = tname;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getTpassword() {
        return Tpassword;
    }

    public void setTpassword(String tpassword) {
        Tpassword = tpassword;
    }
}
