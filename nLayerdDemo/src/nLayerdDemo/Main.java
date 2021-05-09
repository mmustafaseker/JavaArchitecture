package nLayerdDemo;

import nLayerdDemo.business.abstracts.ProductService;
import nLayerdDemo.business.concretes.ProductManager;
import nLayerdDemo.core.JLoggerManagerAdapter;
import nLayerdDemo.dataAccess.concretes.AbsProductDao;
import nLayerdDemo.entities.concretes.Product;
import nLayerdDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
		
		//ToDo: Spring IoC ile çözülecek
		ProductService productService= new ProductManager(new AbsProductDao(), new JLoggerManagerAdapter());
		Product product = new Product(1,2,"Elma",12,50); 
		productService.add(product);
	}

}
