package kodlamaIOLayeredOdev;

import java.util.ArrayList;
import java.util.List;

import kodlamaIOLayeredOdev.business.CategoryManager;
import kodlamaIOLayeredOdev.business.CourseManager;
import kodlamaIOLayeredOdev.business.InstructorManager;
import kodlamaIOLayeredOdev.core.logging.DatabaseLogger;
import kodlamaIOLayeredOdev.core.logging.FileLogger;
import kodlamaIOLayeredOdev.core.logging.ILogger;
import kodlamaIOLayeredOdev.core.logging.MailLogger;
import kodlamaIOLayeredOdev.dataAccess.categoryDao.CategoryJdbcDao;
import kodlamaIOLayeredOdev.dataAccess.courseDao.CourseJdbcDao;
import kodlamaIOLayeredOdev.dataAccess.instructorDao.InstructorHibernateDao;
import kodlamaIOLayeredOdev.entities.Category;
import kodlamaIOLayeredOdev.entities.Course;
import kodlamaIOLayeredOdev.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		System.out.println("--------------------------------------------------------------------------------------");

		ILogger[] loggers = { new DatabaseLogger() };

		Course course2 = new Course("java kursu 1", 1000);
		Course course3 = new Course("C++ kursu 1", 1500);
		Course course4 = new Course("TEST",10);

		List<Course> courses = new ArrayList<>();

		CourseManager courseManager = new CourseManager(new CourseJdbcDao(), loggers,courses);
		courseManager.add(course2);
		courseManager.add(course3);
		courseManager.add(course4);

		System.out.println("--------------------------------------------------------------------------------------");

		Instructor instructor1 = new Instructor("Ahmet", "Kizil");
		Instructor instructor2 = new Instructor("Mehmet", "Kara");

		InstructorManager instructorManager = new InstructorManager(new InstructorHibernateDao(), loggers);
		instructorManager.add(instructor1);
		instructorManager.add(instructor2);

		System.out.println("--------------------------------------------------------------------------------------");

		Category category1 = new Category("java kurs 2022");
		Category category2 = new Category("C++ kurs 2022");
		Category category3 = new Category("TEST");

		List<Category> categories = new ArrayList<>();

		CategoryManager categoryManager = new CategoryManager(new CategoryJdbcDao(), loggers, categories);
		categoryManager.add(category1);
		categoryManager.add(category2);
		categoryManager.add(category3);

		System.out.println("--------------------------------------------------------------------------------------");

	}
}
