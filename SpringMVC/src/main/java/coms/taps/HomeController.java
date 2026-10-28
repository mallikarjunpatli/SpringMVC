
package coms.taps;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    public HomeController() {
        System.out.println("HomeController created");
    }

    @RequestMapping("/")
    public String getFirstPage() {
        return "First";
    }

    @RequestMapping("/second")
    public String getSecondPage(
            @RequestParam("name") String name,
            Model model) {

        model.addAttribute("MyName", name);
        return "Second";
    
    }
}
