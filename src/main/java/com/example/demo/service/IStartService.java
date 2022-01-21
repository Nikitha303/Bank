package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.StartRepository;
import com.example.demo.entity.Start;
@Service
public class IStartService {
	    @Autowired
		StartRepository startRepository;
		public void saveStart(Start start) {
			startRepository.save(start);
		}
}
