package com.zuul.gateway.example.zuuldemo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class ZuuldemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuuldemoApplication.class, args);
	}
	
	
	@RequestMapping(value = "/echoStudentName/{name}")
    public String echoStudentName(@PathVariable(name = "name") String name)
    {
        return "hello  <strong style=\"color: red;\">" + name + " </strong> Responsed on : " + new Date();
    }
 
    @RequestMapping(value = "/getStudentDetails/{name}")
    public Student getStudentDetails(@PathVariable(name = "name") String name)
    {
        return new Student(name, "Pune", "MCA");
    }
    
    @RequestMapping(value = "/addStudent" , method=RequestMethod.POST)
    public Student addStudentDetails(@RequestBody Student student)
    {
    	System.out.println(student.toString());
        return new Student("latha", "Pune", "MCA");
    }
}
