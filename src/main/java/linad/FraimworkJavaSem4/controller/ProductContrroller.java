package linad.FraimworkJavaSem4.controller;


import linad.FraimworkJavaSem4.model.Product;
import linad.FraimworkJavaSem4.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class ProductContrroller {
    private final ProductRepository productRepository;
    @GetMapping("/products")
    public String getProducts(Model model){
        model.addAttribute("products", productRepository.getProducts());
        return "products";
    }
    @PostMapping("/products")
    public String addProduct(Product product, Model model){
        productRepository.addProduct(product);
        model.addAttribute("products", productRepository.getProducts());
        return "products";
    }
}
