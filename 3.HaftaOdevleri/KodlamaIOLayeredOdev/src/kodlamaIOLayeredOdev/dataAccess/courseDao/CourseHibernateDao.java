package kodlamaIOLayeredOdev.dataAccess.courseDao;

import kodlamaIOLayeredOdev.entities.Course;

public class CourseHibernateDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile eklendi");		
	}

}
