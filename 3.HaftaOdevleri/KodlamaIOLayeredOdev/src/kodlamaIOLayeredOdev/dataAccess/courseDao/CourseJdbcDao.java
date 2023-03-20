package kodlamaIOLayeredOdev.dataAccess.courseDao;

import kodlamaIOLayeredOdev.entities.Course;

public class CourseJdbcDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile eklendi");
	}

}
