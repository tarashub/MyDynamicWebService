package ua.com.okten.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import ua.com.okten.entity.Product;
import ua.com.okten.entity.User;
import ua.com.okten.service.ProductService;
import ua.com.okten.service.UserService;
import ua.com.okten.validator.UserValidator;

import javax.validation.Valid;

@Controller
public class MainController {

    @Autowired
    private UserService service;

    @Autowired
    private ProductService productService;

    @Autowired
    private UserValidator validator;

    //    @RequestMapping(value = "/",method = RequestMethod.GET)
    @GetMapping("/")
    public String toHome(Model model) {
        model.addAttribute("key", "World");
        model.addAttribute("keyProduct", "Shop");
        return "index";
    }

    @PostMapping("/save")
    public String save(@RequestParam("name") String name, @RequestParam("lastName") String lastNAme) {
        service.save(new User(name, lastNAme));
        return "index";
    }

//    @GetMapping("/")
//    public String toProduct(Model model) {
//        model.addAttribute("keyProduct", "Shop");
//        return "index";
//    }

    @PostMapping("/saveProduct")
    public String save(@RequestParam("productName") String productName) {
        productService.save(new Product(productName));
        return "index";
    }


    @GetMapping("form")
    public String form(Model model) {
        model.addAttribute("eUser", new User());
        return "form";
    }

    @PostMapping("addUser")
    public String add(@ModelAttribute("eUser") @Valid User user, BindingResult result) {

        if (result.hasErrors()) {
            System.out.println("erooooooooooooooooooooooooooors");
            return "form";
        }


        service.save(user);
        return "form";
    }

    @InitBinder
    public void binder(WebDataBinder binder) {
        binder.addValidators(validator);
    }

}
