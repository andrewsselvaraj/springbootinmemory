package com.efreelearn.repository;
import org.springframework.data.repository.CrudRepository;

import com.efreelearn.model.Student;
public interface StudentRepository extends CrudRepository<Student, Integer>
{
}
