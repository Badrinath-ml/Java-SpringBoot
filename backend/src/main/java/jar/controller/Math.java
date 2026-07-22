package jar.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class Math {
    @PostMapping("/math/{n}")
    Map<Object, Object> m1(@PathVariable int n){
        Map<Object, Object> res= new HashMap<>();
        res.put("msg","welcome to math api ");
        Math obj=new Math();
        res.put("Sequence: "+n,obj.fib(n));
        return res;
    }
  @GetMapping("api/fact")
   Map<Object, Object> m2(@RequestParam int n) {
        Map<Object,Object> res=new HashMap<>();
        Math ob=new Math();
        res.put("Fact:"+n,ob.fact(n));
        return res;
    }
    
    int fact(int n){
        if(n==0)return 1;
        return n*fact(n-1);
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
