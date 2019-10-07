package frank.in.ecomdashboard.controller;

import frank.in.ecomdashboard.service.impl.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeLeafController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/")
    public String getDashDetail(Model model){
        return "/index";
    }


}
