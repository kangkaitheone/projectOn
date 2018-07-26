package com.lanou.Controller;





@Controller
public class UserController {
    @Autowired
    private UserService userService ;
    @RequestMapping(value="/findAll")
    public String findAll(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users",users);

        return "userlist" ;

    }
}