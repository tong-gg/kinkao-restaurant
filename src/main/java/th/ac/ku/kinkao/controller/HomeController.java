package th.ac.ku.kinkao.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
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
    public String getHomePage(Model model,
                              @AuthenticationPrincipal OAuth2User principle) {
        // key greeting from home HTML template
        model.addAttribute("greeting", "Sawaddee!");
        if (principle != null) {
            model.addAttribute("user", principle.getAttribute("name"));
        } else {
            model.addAttribute("user", "Guest");
        }
        return "home"; // means home.html
    }
}
