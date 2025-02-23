package test.test_cherry_pick.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test_03")
public class Test_04 {

    @GetMapping("/test_04")
    public String test_06() {
        return "Test_06";
    }

    @GetMapping("/test_05")
    public String test_07() {
        return "Test_07";
    }

}
