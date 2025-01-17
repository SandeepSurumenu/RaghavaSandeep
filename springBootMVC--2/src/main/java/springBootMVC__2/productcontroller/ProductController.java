package springBootMVC__2.productcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import springBootMVC__2.productentity.ProductEntity;
import springBootMVC__2.productmodel.ProductModel;
import springBootMVC__2.productservice.ProductService;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ProductController {
	@Autowired
	ProductService productService;

	@GetMapping("/productform")
	public String getProductForm() {
		return "add-product";
	}
	



@PostMapping("/saveproduct")
public String saveProduct(ProductModel productModel) {
	productService.saveProductDetails(productModel);
	return "Success";
}

@GetMapping("/getallproducts")
public String getAllProducts(Model model)
{
	List<ProductEntity> productEntity = productService.getAllProducts();
	
	model.addAttribute("products", productEntity);
	return "Product-List";
}

@GetMapping("/getsearchform")
public String searchById() {
    return "Search-Product";
}

@PostMapping("/searchbyid")
public String SearchById(@RequestParam Long id, Model model) {
	ProductEntity products = productService.searchById(id);
	model.addAttribute("products", products);
	return "Search-Product";
}

@GetMapping("/delete/{id}")
public String deleteProductById(@PathVariable("id") Long id) {
	productService.deleteProductById(id);
    return "redirect:/getallproducts";
}

@GetMapping("/edit/{id}")
public String editProductById(@PathVariable ("id") Long id,org.springframework.ui.Model model)
{
	ProductModel product=productService.editProducts(id);
	model.addAttribute("product",product);
	model.addAttribute("id", id);
	return "Edit-Product";
}
@PostMapping("/editproduct/{id}")
public String editproduct(@PathVariable("id") Long id,ProductModel  productModel ) {
	productService.editProducts(id,productModel);
	return "redirect:/getallproducts";
}
}

















