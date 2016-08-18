package com.wcy123.sb.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangchunye on 8/18/16.
 */
@RestController
final public class HelloWorld {
    @RequestMapping("/")
    String HelloWorld() {
        return "Hello World\nreload\n";
    }
}
