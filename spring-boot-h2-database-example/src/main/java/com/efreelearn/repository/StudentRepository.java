package com.efreelearn.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.efreelearn.model.Student;
public interface StudentRepository extends CrudRepository<Student, Integer>
{

	public List<Student> findByName(String name);
	public List<Student> findByNameOrderByAge(String name);
}
