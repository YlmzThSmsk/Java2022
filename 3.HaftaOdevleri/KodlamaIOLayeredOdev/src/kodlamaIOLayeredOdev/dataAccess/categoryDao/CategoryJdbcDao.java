package kodlamaIOLayeredOdev.dataAccess.categoryDao;

import kodlamaIOLayeredOdev.entities.Category;

public class CategoryJdbcDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile eklendi");
		
	}

}
