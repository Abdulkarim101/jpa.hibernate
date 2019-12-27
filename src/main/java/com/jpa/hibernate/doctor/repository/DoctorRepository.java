package com.jpa.hibernate.doctor.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.hibernate.doctor.DoctorEntity;

@Repository
public class DoctorRepository {

	private EntityManager em;

	@Transactional
	public void save(DoctorEntity doctor) {
		em.persist(doctor);
	}

	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}

}
