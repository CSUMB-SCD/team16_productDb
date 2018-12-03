package edu.csumb.cst438.productdb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import edu.csumb.cst438.productdb.entities.Product;

public interface ProductRepository extends MongoRepository<Product, String>{
    @Query (value = "{'id':'?0'}")
    Product findId(String id);

    @Query (value = "{'name':?0}")   
    Product findName(String name);

    @Query (value = "{'payment':?0}")   
    Product findPrice(double payment);
 
}