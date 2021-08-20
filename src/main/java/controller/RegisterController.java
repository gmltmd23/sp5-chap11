package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RegisterController {

    @RequestMapping("/register/step1")
    public String handleStep1() {
        return "register/step1";
    }

    /*
    @PostMapping("/register/step2")
    public String handleStep2(HttpServletRequest request) {
        String agreeParam = request.getParameter("agree");
        if (agreeParam == null || !agreeParam.equals("true")) {
            return "register/step1";
        }
        return "register/step2";
    }
    */

    @PostMapping("/register/step2")
    public String handleStep2(@RequestParam(value = "agree", defaultValue = "false") Boolean agreeVal) {
        if (!agreeVal)
            return "register/step1";
        return "register/step2";
    }
    // 위에 통째로 주석쳐져있는 HttpServletRequest를 이용한 코드로 해도되고 이것처럼 @RequestParam을 이용해도된다.

    @GetMapping("/register/step2")
    public String handleStep2Get() {
        return "redirect:/register/step1";
    }

}
