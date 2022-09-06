package com.ckk.web;

import com.ckk.api.HelloWorldService;

public class HelloController {

    public static void main(String[] args) {

        HelloWorldService service = new HelloWorldService();

        service.hi("Hello");
    }
}
