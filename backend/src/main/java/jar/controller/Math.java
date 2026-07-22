package jar.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class Math {
    @GetMapping("/math")
    Map<Object, Object> m1(@RequestParam int n){
        Map<Object, Object> res= new HashMap<>();
        res.put("msg","welcome to math api ");
        Math obj=new Math();
        res.put("Sequence: "+n,obj.fib(n));
        return res;
    }

   ArrayList<Integer> fib(int n){
        ArrayList<Integer> list=new ArrayList<>();
        int a=0,b=1;
        list.add(a);
        list.add(b);
        for(int i=2;i<=n;i++){
            int c=a+b;
            list.add(c);
            a=b;
            b=c;
        }
        return list;
    }
}
