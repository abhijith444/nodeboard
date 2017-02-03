package com.abhijith.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Node;

@RestController
public class TestController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/test")
	String test(){
		return "Hello World from SpBoot!!!!";
	}
	
	@RequestMapping("/test2")
	Node obj_test(){
		System.out.println("Testing sysout");
		logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
		return new Node(1L,"node1.cluster.com");
	}
}
