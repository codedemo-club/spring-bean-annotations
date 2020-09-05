package club.codedemo.springbeanannotations;

import club.codedemo.StudentService;
import club.codedemo.TeacherService;
import club.codedemo.springbeanannotations.controller.StudentController;
import club.codedemo.springbeanannotations.model.Student;
import club.codedemo.springbeanannotations.repository.StudentRepository;
import club.codedemo.springbeanannotations.service.CourseService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;

@SpringBootTest
class SpringBeanAnnotationsApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	void contextLoads() {
	}

	@Test
	void basePackages() {
		Assertions.assertNotNull(applicationContext.getBean(StudentService.class));
	}

	@Test
	void basePackageClasses() {
		Assertions.assertNotNull(applicationContext.getBean(TeacherService.class));
	}

	@Test
	void component() {
		Assertions.assertNotNull(applicationContext.getBean(Student.class));
	}

	@Test
	void repository() {
		Assertions.assertNotNull(applicationContext.getBean(StudentRepository.class));
	}

	@Test
	void service() {
		Assertions.assertNotNull(applicationContext.getBean(CourseService.class));
	}

	@Test
	void controller() {
		Assertions.assertNotNull(applicationContext.getBean(StudentController.class));
	}

	@Test
	void configuration() {
		Assertions.assertNotNull(applicationContext.getBean(PersistenceExceptionTranslationPostProcessor.class));
	}
}
