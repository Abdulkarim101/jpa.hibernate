package com.main;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jpa.hibernate.doctor.repository.PatientRepository;
import com.jpa.hibernate.patient.entity.PatientEntity;


public class PatientMain {
	

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("jpa-doctor.xml");

		PatientRepository pr = (PatientRepository) ac.getBean("patientRepository");
		Calendar myCal = Calendar.getInstance();
		myCal.set(Calendar.YEAR, 1977);
		myCal.set(Calendar.MONTH, 06);
		myCal.set(Calendar.DAY_OF_MONTH, 03);
		Date theDate = myCal.getTime();
		

		
		PatientEntity pe = new PatientEntity();
		pe.setName("Pablo");
		pe.setEmail("pablo@hotmail.com");
		pe.setDob(theDate);
		pe.setPhone("505432455");
		pe.setLastFourSsn("6654");
		
		pr.save(pe);
		
		

	}

}
