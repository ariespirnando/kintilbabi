package com.example.crud.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.demo.model.MateriModel;
import com.example.crud.demo.model.MateriModelRequest;
import com.example.crud.demo.repository.MateriRepository;

@Service
public class MateriService {
	@Autowired
	MateriRepository mtr;
	
	public List<?> listMateriService(){
		List<MateriModel> lmm = (List<MateriModel>) mtr.listMateriRepository();
		if(lmm.isEmpty()) {
			return null;
		}else {
			return lmm;
		}
	}
	
	public void addMateryService(MateriModelRequest mr) {
		mtr.addMateryRepository(mr);
	}
	
}
