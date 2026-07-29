package jar.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class St {
    @GetMapping("/")
     Map<Object, Object> st() {
        Map<Object, Object> res = new HashMap<>();
        res.put("msg", "Hello World");
        res.put("status", 200);
        return res;
    }
    // @Autowired
    // StudentRepo db;
@PostMapping()
Map<Object, Object> stPost(@RequestBody Map<Object, Object> body) {
    Map<Object, Object> res = new HashMap<>();
    res.put("msg", "Hello World");
    res.put("status", 200);
    res.put("body", body);
    return res;
    }
}