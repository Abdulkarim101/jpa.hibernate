package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jpa.hibernate.doctor.DoctorEntity;
import com.jpa.hibernate.doctor.repository.DoctorRepository;

public class DoctorMain {

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("jpa-doctor.xml");

		DoctorRepository dr = (DoctorRepository) apc.getBean("doctorRepository");

		DoctorEntity de = new DoctorEntity();
		de.setName("Omar");
		de.setSpeciality("Software Engineer");
		de.setDepartment("IT");
		de.setPhone("505556678");

		dr.save(de);

	}

}
