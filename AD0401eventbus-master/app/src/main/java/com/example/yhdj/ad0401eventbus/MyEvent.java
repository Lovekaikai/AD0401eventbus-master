package com.example.yhdj.ad0401eventbus;


public class MyEvent {
    private String message;
    public MyEvent(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
