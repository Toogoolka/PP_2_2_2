package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String showListOfRange(@RequestParam(value = "count", required = false) Long count, Model model) {
        if (count == null) {
            model.addAttribute("carsOfRange", carService.showAll());
        } else {
            model.addAttribute("carsOfRange", carService.getListOfRange(count));
        }
        return "cars/cars";
    }

    @GetMapping("/{id}")
    public String showCar(@PathVariable("id") Long id, Model model) {
        model.addAttribute("car", carService.show(id));
        return "cars/show";
    }
}