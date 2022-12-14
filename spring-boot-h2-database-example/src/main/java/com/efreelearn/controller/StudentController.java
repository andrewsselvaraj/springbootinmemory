package com.efreelearn.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.efreelearn.model.Student;
import com.efreelearn.service.StudentService;
//creating RestController
@RestController
public class StudentController 
{
//autowired the StudentService class
@Autowired
StudentService studentService;
//creating a get mapping that retrieves all the students detail from the database 
@GetMapping("/student")
private List<Student> getAllStudent() 
{
return studentService.getAllStudent();
}

@GetMapping("/saveAllStudent")
private List<Student> saveAllStudent() 
{
return studentService.saveAllStudent();
}

@GetMapping("/orderbyage")
private List<Student> orderByAge() 
{
return studentService.saveAllStudent();
}
@GetMapping("/findbyname/{namep}")
private List<Student> findByName(@PathVariable("namep") String name) 
{
return studentService.findByName(name);
}
@GetMapping("/findbynameandage/{namep}/{age}")
private List<Student> findByName(@PathVariable("namep") String name,@PathVariable("age") int age) 
{
return studentService.findByNameaAndAge(name,age);
}
//creating a get mapping that retrieves the detail of a specific student
@GetMapping("/student/{id}")
private Student getStudent(@PathVariable("id") int id) 
{
return studentService.getStudentById(id);
}
//creating a delete mapping that deletes a specific student
@DeleteMapping("/student/{id}")
private void deleteStudent(@PathVariable("id") int id) 
{
studentService.delete(id);
}
//creating post mapping that post the student detail in the database
@PostMapping("/student")
private int saveStudent(@RequestBody Student student) 
{
studentService.saveOrUpdate(student);
return student.getId();
}
}
