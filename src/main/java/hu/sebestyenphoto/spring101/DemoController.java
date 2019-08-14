package hu.sebestyenphoto.spring101;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
