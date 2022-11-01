package com.efreelearn.service;
import java.util.ArrayList;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efreelearn.model.Student;
import com.efreelearn.repository.StudentRepository;
//defining the business logic
@Service
public class StudentService 
{
@Autowired
StudentRepository studentRepository;
//getting all student records
public List<Student> getAllStudent() 
{
List<Student> students = new ArrayList<Student>();
studentRepository.findAll().forEach(student -> students.add(student));
return students;
}
public List<Student> saveAllStudent() 
{
List<Student> students = new ArrayList<Student>();
Student s = new Student();
s.setId(987654321);
s.setAge(100);
s.setEmail("andrew_insi@yahoo.com");
s.setName("name");
students.add(s);

Student s1 = new Student();
s1.setId(987654321);
s1.setAge(100);
s1.setEmail("hey@yahoo.com");
s1.setName("name2");
students.add(s1);
studentRepository.saveAll(students);


Student s2 = new Student();
s2.setId(1212121);
s2.setAge(121);
s2.setEmail("asd@yahoo.com");
s2.setName("name222");
students.add(s1);
studentRepository.saveAll(students);

return students;
}
//getting a specific record
public Student getStudentById(int id) 
{
return studentRepository.findById(id).get();
}
//getting a specific record
public  List<Student>  findByName(String name) 
{
return studentRepository.findByName(name);
}
public void saveOrUpdate(Student student) 
{
studentRepository.save(student);
}
//deleting a specific record
public void delete(int id) 
{
studentRepository.deleteById(id);
}
}