package linad.FraimworkJavaSem4.repository;

import linad.FraimworkJavaSem4.model.Product;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Getter
public class ProductRepository {
    List<Product> products = new ArrayList<>();
    public void addProduct(Product product){
        products.add(product);
    }
}
