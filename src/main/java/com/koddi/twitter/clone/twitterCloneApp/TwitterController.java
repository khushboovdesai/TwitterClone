package com.koddi.twitter.clone.twitterCloneApp;

import model.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by khush on 6/16/2018.
 */

//@Reypositor
@Controller
public class TwitterController {

/*    @Autowired
    UserInfoRepository userInfoRepository;*/

    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String homepage(){
        System.out.println("Home page visited");
        return "pages/home";
    }


    @RequestMapping(value = "/login", method=RequestMethod.GET)
    public String loginpage(){
        System.out.println("Login page visited");
        return "pages/login";
    }


    @RequestMapping(value = "/userProfile", method= RequestMethod.POST)
    public String userLogin (@RequestBody UserInfo user){

        String usrnm = user.getUsername();
        System.out.println("username posted is: "+ usrnm);
        return "pages/userProfile" ;
    }
}
