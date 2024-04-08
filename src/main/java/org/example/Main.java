package org.example;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController //Stereotype annotation - this class is a web controller (used for incoming web requests). sends result to caller
@EnableAutoConfiguration //Guesses how to configure spring based on jar dependencies - assumes web application
public class Main {

    @RequestMapping("/") //Routing information - any http request with / will go to the home method
    String home(){
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        //delegates to SpringApplication class which bootstraps application > starts Spring > starts Tomcat web server
        //Main.class is the primary spring component
        //args is passed for command-line arguments
       SpringApplication.run(Main.class,args);
    }
}