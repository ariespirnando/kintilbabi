package com.example.crud.demo.controller;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.demo.model.MateriModelRequest;
import com.example.crud.demo.model.ResponsModel;
import com.example.crud.demo.service.MateriService;

@RestController
public class MateriController {
	@Autowired
	MateriService ms; 
	@PostMapping("/listMateri")
	public ResponsModel listmateri() {
		ResponsModel rm = new ResponsModel();
		if(ms.listMateriService()==null) {
			rm.setErrorCode("0000001");
			rm.setData("No Data");
		}else {
			rm.setErrorCode("0000000");
			rm.setData(ms.listMateriService());
		}
		return rm;
	}
	
	@PostMapping("/addMateri")
	public ResponsModel addMateri(@RequestBody MateriModelRequest mr ) {
		ms.addMateryService(mr);
		ResponsModel rm = new ResponsModel(); 		
		rm.setErrorCode("0000000");
		rm.setData("Success");
		return rm;
	}
	
}
