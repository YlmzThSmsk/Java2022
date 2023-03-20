package kodlamaIOLayeredOdev.dataAccess.instructorDao;

import kodlamaIOLayeredOdev.entities.Instructor;

public class InstructorJdbcDao implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile eklendi");
	}

}
