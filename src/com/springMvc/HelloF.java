package com.springMvc;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


public class HelloF {

    private String Hf;

    public String getHf() {
        return Hf;
    }

    public void setHf(String hf) {
        Hf = hf;
    }
}
