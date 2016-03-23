package vn.com.taotv.core.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vn.com.taotv.core.dm.service.test.TestService;

/**
 * Created by TaoTran on 3/23/2016.
 */
@Controller
@RequestMapping({"/", "/home"})
public class HomeController {

    @Autowired
    private TestService testService;

    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        testService.test();
        return "index";
    }
}
