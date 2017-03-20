package com.netease.fin.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = { "com.netease.fin" })
public class Application {
	
	public static void main(String[] args) {
		//启动应用
		SpringApplication.run(Application.class, args);
	}
}
