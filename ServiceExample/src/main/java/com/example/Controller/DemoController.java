package com.example.Controller;

//Importing required classes
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Annotation
@Controller
//Main class
public class DemoController {

 @RequestMapping("/hello")
 @ResponseBody

 // Method
 public String helloGFG()
 {
     return "Hello ";
 }
}