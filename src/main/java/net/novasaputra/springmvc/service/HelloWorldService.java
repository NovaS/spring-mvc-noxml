package net.novasaputra.springmvc.service;

import org.springframework.stereotype.Service;

/**
 * @author novas
 */
@Service
public class HelloWorldService {
	public String getHelloWorld() {
		return "Hello World!";
	}
}
