package jar;
import org.springframework.web.bind.annotation.GetMapping;
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
    
    
    
    
}
