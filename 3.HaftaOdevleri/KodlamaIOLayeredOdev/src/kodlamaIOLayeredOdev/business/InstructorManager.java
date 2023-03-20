package kodlamaIOLayeredOdev.business;

import kodlamaIOLayeredOdev.core.logging.ILogger;
import kodlamaIOLayeredOdev.dataAccess.instructorDao.IInstructorDao;
import kodlamaIOLayeredOdev.entities.Instructor;

public class InstructorManager {
	private IInstructorDao instructorDao;
	private ILogger[] loggers;
	
	public InstructorManager(IInstructorDao instructorDao, ILogger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (ILogger logger : loggers) {
			logger.log(instructor.getName()+ " " + instructor.getLastName());
		}
	}
}
