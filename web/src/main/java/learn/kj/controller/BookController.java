package learn.kj.controller;

import learn.kj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        System.out.println(1);
        ModelAndView mva = new ModelAndView("success");
        mva.addObject("list",bookService.findAll());
        return mva;
    }
}
