package com.niit.petstorebackend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.CartDAOImpl;
import com.niit.DAO.CategoryDAOImpl;
import com.niit.DAO.OrderDAOImpl;
import com.niit.DAO.ProductDAOImpl;
import com.niit.DAO.RoleDAOImpl;
import com.niit.DAO.ShippingAddressDAOImpl;
import com.niit.DAO.SupplierDAOImpl;
import com.niit.DAO.UserDAOImpl;
import com.niit.config.dbconfig;
import com.niit.model.Cart;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.ShippingAddress;
import com.niit.model.Supplier;
import com.niit.model.User;
import com.niit.service.CartService;
import com.niit.service.CartServiceImpl;
import com.niit.service.CategoryService;
import com.niit.service.CategoryServiceImpl;
import com.niit.service.OrderServiceImpl;
import com.niit.service.ProductService;
import com.niit.service.ProductServiceImpl;
import com.niit.service.RoleServiceImpl;
import com.niit.service.ShippingAddressService;
import com.niit.service.ShippingAddressServiceImpl;
import com.niit.service.SupplierService;
import com.niit.service.SupplierServiceImpl;
import com.niit.service.UserService;
import com.niit.service.UserServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new AnnotationConfigApplicationContext(dbconfig.class,CategoryDAOImpl.class,CategoryServiceImpl.class,CartDAOImpl.class,CartServiceImpl.class,ProductDAOImpl.class,ProductServiceImpl.class
        		,UserDAOImpl.class,UserServiceImpl.class,SupplierDAOImpl.class,SupplierServiceImpl.class,ShippingAddressDAOImpl.class,ShippingAddressServiceImpl.class,RoleDAOImpl.class,RoleServiceImpl.class,OrderDAOImpl.class,OrderServiceImpl.class);
        CategoryService categoryService=(CategoryService) context.getBean("categoryServiceImpl");
        Category category=new Category();
        category.setCategoryName("cat");
        category.setDescription("desc");
        categoryService.saveCategory(category);
        System.out.println("Category inserted");
 
        
        CartService cartService=(CartService) context.getBean("cartServiceImpl");
        Cart cart=new Cart();
        cart.setProductName("food");
        cart.setQuantity(1);
        cart.setPrice(12345);
        cartService.saveCart(cart);
        System.out.println("Done");
        
        ProductService productService=(ProductService)context.getBean("productServiceImpl");
        Product product=new Product();
        product.setProductName("food");
        product.setProductDescription("Yummy");
        product.setStock(5);
        product.setPrice(500);
        productService.saveProduct(product);
        System.out.println("Product Finished");
    
        UserService userService=(UserService)context.getBean("userServiceImpl");
        User user=new User();
        user.setUserName("Uthraa");
        user.setEmail("uthraam@gmail.com");
        user.setContact("1234");
        user.setAddress("hhdshb");
        user.setZipcode(123);
        userService.saveUser(user);
        System.out.println("User Finished");
        
        
        SupplierService supplierService=(SupplierService)context.getBean("supplierServiceImpl");
        Supplier supplier=new Supplier();
        supplier.setSupplierName("supps");
        supplier.setSupplierContact(1234);
        supplierService.saveSupplier(supplier);
        System.out.println("Supplier Done");
        
        ShippingAddressService shippingAddressService=(ShippingAddressService)context.getBean("shippingAddressServiceImpl");
        ShippingAddress shippingAddress=new ShippingAddress();
        shippingAddress.setUserName("haha");
        shippingAddress.setShippingAddress("oooooo");
        shippingAddress.setZipcode(143);
        shippingAddressService.saveShippingAddress(shippingAddress);
        System.out.println("shippingAddress Done");
        
        
        
        
        
    }
    
}
