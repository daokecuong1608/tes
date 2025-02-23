package test.test_cherry_pick.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test_02")
public class Test_02 {

    @GetMapping("/test_03")
    public String test_02() {
        return "Test_02";
    }

    @GetMapping("/test_03")
    public String test_03() {
        return "Test_03";
    }

}
