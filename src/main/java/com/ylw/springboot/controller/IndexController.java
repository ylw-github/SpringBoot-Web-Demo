package com.ylw.springboot.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Map<String, Object> result) {
        result.put("name", "Dumas");
        result.put("sex", "male");
        List<String> listResult = new ArrayList<String>();
        listResult.add("Jim");
        listResult.add("David");
        listResult.add("Hary");
        result.put("userlist", listResult);
        return "index";
    }

    @RequestMapping("/indexJsp")
    public String indexJsp() {
        return "index1";
    }

    @RequestMapping("/testException")
    public String testException() {
        throw new RuntimeException("模拟运行时异常!");
    }
}
