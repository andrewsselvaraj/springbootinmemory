package com.efreelearn.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

@GetMapping("/")
private String test() 
{
return "testSuccess";
}

@RequestMapping("/t")
private String test1() 
{
return "testSuccess1";
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
//@PostMapping("/student", consumes = MediaType.APPLICATION_JSON_VALUE)
@RequestMapping(method = RequestMethod.POST, value = "/student1", consumes = MediaType.ALL_VALUE)
private int saveStudent1(@RequestBody Student student) 
{
studentService.saveOrUpdate(student);
return student.getId();
}


@PostMapping("/loginrequestbody")
private Student loginRequestBody(@RequestBody Student student) 
{
	
	if(student.getName().equalsIgnoreCase("andrews") || student.getName().equalsIgnoreCase("danny") || student.getName().equalsIgnoreCase("rajesh"))
	{
		student.setName("validuser");
		return student;
	}
	else
	{
		student.setName("invaliduser");
		return student;
	}
		
}
@GetMapping("/loginpathvariable/{username}/{password}")
private Student loginPathVariable(@PathVariable("username") String username,@PathVariable("password") String password) 
{
	Student student = new Student();
	if(username.equalsIgnoreCase("andrews") || username.equalsIgnoreCase("danny") ||username.equalsIgnoreCase("rajesh"))
	{
		student.setName("validuser");
		return student;
	}
	else 
	{
		student.setName("invaliduser");
		return student;
	}
}
}
