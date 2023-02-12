package mk.ukim.finki.fashionstore.bootstrap;

import lombok.Getter;
import mk.ukim.finki.fashionstore.model.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class DataHolder {
    public static List<Category> categories = new ArrayList<>();
    public static List<User> users = new ArrayList<>();
    public static List<Manufacturer> manufacturers = new ArrayList<>();
    public static List<Product> products = new ArrayList<>();
    public static List<ShoppingCart> shoppingCarts = new ArrayList<>();


//    @PostConstruct
//    public void init(){

//        this.categories.add(new Category("Software","Software categories"));
//        this.categories.add(new Category("Books","Books categories"));
//
//        users.add(new User("kostadin.mishev","km","Kostadin","Mishev"));
//        users.add(new User("riste.stojanov","rs","Riste","Stojanov"));
//
//        Manufacturer manufacturer = new Manufacturer("Nike","Yo Yo");
//        manufacturers.add(manufacturer);
//
//        Category category = new Category("Sport","Sport category");
//        categories.add(category);
//        products.add(new Product("Ball 1",285.8,7,category,manufacturer));
//        products.add(new Product("Ball 2",285.8,7,category,manufacturer));
//        products.add(new Product("Ball 3",285.8,7,category,manufacturer));
//    }
}
