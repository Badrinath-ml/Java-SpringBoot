package jar.controller;

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

@PostMapping()
Map<Object, Object> stPost(@RequestBody Map<Object, Object> body) {
    Map<Object, Object> res = new HashMap<>();
    res.put("msg", "Hello World");
    res.put("status", 200);
    res.put("body", body);
    return res;
    }
}