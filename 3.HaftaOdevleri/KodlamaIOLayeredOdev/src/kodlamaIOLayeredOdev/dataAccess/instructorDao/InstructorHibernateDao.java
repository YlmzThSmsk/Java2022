package kodlamaIOLayeredOdev.dataAccess.instructorDao;

import kodlamaIOLayeredOdev.entities.Instructor;

public class InstructorHibernateDao implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile eklendi");
	}

}
