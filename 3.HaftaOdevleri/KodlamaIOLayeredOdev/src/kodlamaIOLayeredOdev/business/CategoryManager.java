package kodlamaIOLayeredOdev.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIOLayeredOdev.core.logging.ILogger;
import kodlamaIOLayeredOdev.dataAccess.categoryDao.ICategoryDao;
import kodlamaIOLayeredOdev.entities.Category;

public class CategoryManager {
	private ICategoryDao categoryDao;
	private ILogger[] loggers;
	private List<Category> categories = new ArrayList<>();
	
	public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers,List<Category> categories ) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
		
	}
	
	public void add(Category category) throws Exception {
		
		for (Category categorySame : categories) {
			if(categorySame.getCategoryName().equals(category.getCategoryName()) ) {
				throw new Exception ("Kategori ismi aynı olamaz");
			}
		}
		
		categoryDao.add(category);
		for (ILogger logger : loggers) {
			logger.log(category.getCategoryName());
		}
		categories.add(category);
	}
	
}
