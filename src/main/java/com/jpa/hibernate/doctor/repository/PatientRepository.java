package com.jpa.hibernate.doctor.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.hibernate.patient.entity.PatientEntity;

@Repository
public class PatientRepository {
	
	private EntityManager em;
	
	@Transactional
	public void save (PatientEntity patient) {
	
	em.persist(patient);
	}

	public EntityManager getEm() {
		return em;
	}
	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	
}