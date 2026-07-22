package jar.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Main {
    @GetMapping("/math")
    Map<Object, Object> m1(){
        res.put("msg","welcome to math api ")

    }
}
