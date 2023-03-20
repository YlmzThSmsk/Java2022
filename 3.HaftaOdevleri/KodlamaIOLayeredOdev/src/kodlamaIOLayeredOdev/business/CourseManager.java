package kodlamaIOLayeredOdev.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIOLayeredOdev.core.logging.ILogger;
import kodlamaIOLayeredOdev.dataAccess.courseDao.ICourseDao;
import kodlamaIOLayeredOdev.entities.Course;

public class CourseManager {
	private ICourseDao courseDao;
	private ILogger[] loggers;
	private List<Course> courses = new ArrayList<>();

	public CourseManager(ICourseDao courseDao, ILogger[] loggers,List<Course>Courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;

	}

	public void add(Course course) throws Exception {
		if (course.getPrice() <= 0) {
			throw new Exception("Kurs fiyatı 0 dan küçük olamaz");
		}
		
		for (Course courseSame : courses) {
			if(course.getCourseName().equals(courseSame.getCourseName())) {
				throw new Exception("Kurs ismi aynı olamaz");
			}
		}

		courseDao.add(course);

		for (ILogger logger : loggers) {
			logger.log(course.getCourseName());
		}
		
		courses.add(course);

	}

}
