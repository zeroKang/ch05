package org.zerock.ch05.controller;

        import lombok.extern.log4j.Log4j2;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample/*")
@Log4j2
public class SampleController {

    @RequestMapping("/ex1")
    public void ex1(){
        log.info("ex1.............");
    }

}
