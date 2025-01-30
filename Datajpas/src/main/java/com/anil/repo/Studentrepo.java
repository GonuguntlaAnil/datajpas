package com.anil.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anil.entity.Student;

public interface Studentrepo extends JpaRepository<Student, Integer>{
	@Query("from Student")
	public List<Student>getcourses();
}
