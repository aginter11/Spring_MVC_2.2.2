package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "locale", required = false) String isLocale, ModelMap model) {

        CarService carService = new CarService();
        model.addAttribute("carsList", carService.getListCars());

        if (isLocale.equals("ru")) {
            model.addAttribute("title", "МАШИНЫ");
        } else  {
            model.addAttribute("title", "CARS");
        }
        return "cars";
    }
}

