package test.test_cherry_pick.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test_03")
public class Test_03 {

    @GetMapping("/test_04")
    public String test_04() {
        return "Test_04";
    }

    @GetMapping("/test_05")
    public String test_05() {
        return "Test_05";
    }

}
