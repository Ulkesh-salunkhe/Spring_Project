package com.csi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class InvalidEmailAddress extends  Exception{

    public InvalidEmailAddress(String msg){

        super(msg);
    }
}
