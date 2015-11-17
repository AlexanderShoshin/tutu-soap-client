package shoshin.alex.tutusoap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TerminalController {
    @RequestMapping(value = "/terminal")
    public String getAdminPage(Model model) {
        return "terminal";
    }
}