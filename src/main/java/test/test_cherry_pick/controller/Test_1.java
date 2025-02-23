package test.test_cherry_pick.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test_01")
public class Test_1 {

    @GetMapping("/test_01")
    public String Hello() {
        return "Hello Test_01";
    }

    @GetMapping("/test_02")
    public String Hello_02() {
        return "Hello Test_02";
    }

}
