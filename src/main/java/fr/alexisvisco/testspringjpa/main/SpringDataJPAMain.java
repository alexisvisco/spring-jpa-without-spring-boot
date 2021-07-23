package fr.alexisvisco.testspringjpa.main;

import fr.alexisvisco.testspringjpa.model.Product;
import fr.alexisvisco.testspringjpa.service.ProductService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Simple tester for Spring-Data-JPA.
 **/
public class SpringDataJPAMain {
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(4.6f, 7.7f);
//        System.out.println(rectangle);

        //Create Spring application context
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring.xml");

        //Get service from context.
        ProductService productService = ctx.getBean(ProductService.class);


        //Add some items
        productService.add(new Product(1, "Television"));
        productService.add(new Product(2, "Phone"));
        productService.addAll(Arrays.asList(
                new Product(3, "Peach"),
                new Product(4, "Strawberry"),
                new Product(5, "Melone"),
                new Product(6, "Onion")
        ));


        //Test entity listing
        System.out.println("findAll=" + productService.findAll());

        //Test specified find methods
        System.out.println("findByName is 'Peach': " + productService.findByNameIs("Peach"));
        System.out.println("findByNameContainingIgnoreCase 'on': " + productService.findByNameContainingIgnoreCase("on"));

        ctx.close();
    }
}