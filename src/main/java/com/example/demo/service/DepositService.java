package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Deposit;
import com.example.demo.DepositRepository;
@Service
public class DepositService {
     @Autowired
     DepositRepository depositRepository;
	public void saveDeposit(@Valid Deposit deposit) {
		depositRepository.save(deposit);
		
	}
	public Iterable<Deposit> getDeposit() {
		return depositRepository.findAll();
	}

}
