package com.test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by vishalkulkarni on 3/21/17.
 */
@Controller
public class AddController {

    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response)
    {
        int f1 = Integer.parseInt(request.getParameter("f1"));
        int f2 = Integer.parseInt(request.getParameter("f2"));
        int result = f1+f2;
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index.jsp");
        mv.addObject("result",result);
        return mv;
    }
}
