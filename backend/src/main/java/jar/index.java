package jar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jar.dto.R;




@RestController
public class index {

    
    @GetMapping("/")
    String f(){
        return "Welcome to spring boot";
    }

    @GetMapping("/api")
    R f1(){
        return new R();
    }

    @PostMapping("/api/sum/{n}")
    R f1(@PathVariable int n) {
        int total = n * (n + 1) / 2;
        return new R(n, total);
    }
    
    
    
    
    
}
