package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.dto.Student;

@Repository
public class StudentDao {

	@Autowired
	private EntityManager em;
	private EntityTransaction et;

	public void saveStudent(Student student) {
		et = em.getTransaction();
		et.begin();
		em.persist(student);
		et.commit();
	}

	public Student getStudentById(int id) {
		return em.find(Student.class, id);
	}

	public void updateStudent(Student student) {
		et = em.getTransaction();
		et.begin();
		em.merge(student);
		et.commit();
	}

	public boolean deleteStudent(int id) {
		Student s = em.find(Student.class, id);
		if (s != null) {
			et = em.getTransaction();
			et.begin();
			em.remove(s);
			et.commit();
			return true;
		} else {
			return false;
		}
	}

	public List<Student> getAllStudent() {
		Query q = em.createQuery("SELECT s FROM Student s");
		return q.getResultList();
	}
}
