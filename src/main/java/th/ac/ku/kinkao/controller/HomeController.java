package th.ac.ku.kinkao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// ของเก่าใช้ REST Controller สำหรับ API
// Thymeleaf ใช้ Controller
@Controller
public class HomeController {

    // ทุก Request เข้ามาที่นี่
    @RequestMapping("/")
    // คืนค่าเป็น String เสมอ เพราะจะคืนค่าเป็น HTML templates
    public String getHomePage(Model model) {
        // key greeting from home HTML template
        model.addAttribute("greeting", "Sawaddee!");
        return "home"; // means home.html
    }
}
