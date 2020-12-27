package com.github.sebyplays.jwebservice;

import com.github.sebyplays.jwebservice.api.JWebService;
import com.sun.javaws.security.JavaWebStartSecurity;

public class WebServ {

    public static JWebService jWebService = new JWebService(20998);

    public static void main(String[] args) throws CloneNotSupportedException {
        jWebService.start();
    }

}
