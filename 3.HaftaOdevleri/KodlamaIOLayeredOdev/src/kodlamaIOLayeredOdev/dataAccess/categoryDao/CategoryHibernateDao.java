package kodlamaIOLayeredOdev.dataAccess.categoryDao;

import kodlamaIOLayeredOdev.entities.Category;

public class CategoryHibernateDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile eklendi");
	}

}
