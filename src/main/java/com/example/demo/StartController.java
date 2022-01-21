package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Start;
import com.example.demo.service.IStartService;

@RestController
public class StartController {
	        @Autowired
			IStartService startService;
			@GetMapping("/start")
			String getStart() {
			    System.out.println("testing");
			    return "testing";
			 }
	      
			@PostMapping("/start") // create
			void createStart (@RequestBody Start start) {
				System.out.println(start.getCustomername());
				System.out.println(start.getGender());
				System.out.println(start.getDob());
				System.out.println(start.getAddress());
				System.out.println(start.getCity());
				System.out.println(start.getState());
				System.out.println(start.getPin());
				System.out.println(start.getTelephone());
				System.out.println(start.getFax());
				System.out.println(start.getEmail());
			startService.saveStart(start);
			}
			
		
		
		
	

}
