package com.example.crud.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.crud.demo.model.MateriModel;
import com.example.crud.demo.model.MateriModelRequest;

@Repository
public class MateriRepository {
	@Autowired
	EntityManager entityManager;
	
	public List<?> listMateriRepository(){
		StoredProcedureQuery que = entityManager.createStoredProcedureQuery("viewmaterysp",MateriModel.class);
		que.execute();
		List<MateriModel> res = que.getResultList();
		return res;
	}
	
	public void addMateryRepository(MateriModelRequest mr) {
		StoredProcedureQuery que = entityManager.createStoredProcedureQuery("addmaterysp");
		que.registerStoredProcedureParameter("kelas", String.class, ParameterMode.IN);
		que.registerStoredProcedureParameter("link", String.class, ParameterMode.IN);
		que.registerStoredProcedureParameter("keterangan", String.class, ParameterMode.IN);
		que.setParameter("kelas", mr.getKelas());
		que.setParameter("link", mr.getLink());
		que.setParameter("keterangan", mr.getKeterangan());
		que.execute();
	}
}
