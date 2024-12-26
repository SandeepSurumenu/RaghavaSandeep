package springBootMVC__2.productservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVC__2.productentity.ProductEntity;
import springBootMVC__2.productmodel.ProductModel;
import springBootMVC__2.productrepository.ProductRepository;
@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	public void saveProductDetails(ProductModel productModel)
	{
		double StockValue;
		StockValue = productModel.getPrice() * productModel.getQuantity();
		
		double DiscountPrice;
		DiscountPrice = productModel.getPrice() * productModel.getDiscountRate()/100;
		
		double TaxPrice;
		TaxPrice = productModel.getPrice() * productModel.getTaxRate()/100;
		
		double OfferPrice;
		OfferPrice = productModel.getPrice() - DiscountPrice;
		
		double FinalPrice;
		FinalPrice = OfferPrice + TaxPrice;
		
		
		ProductEntity productEntity = new ProductEntity();
		
		productEntity.setName(productModel.getName());
		productEntity.setBrand(productModel.getBrand());
		productEntity.setMadeIn(productModel.getMadeIn());
		productEntity.setPrice(productModel.getPrice());
		productEntity.setQuantity(productModel.getQuantity());
		productEntity.setTaxRate(productModel.getTaxRate());
		productEntity.setDiscountRate(productModel.getDiscountRate());
		productEntity.setStockValue(StockValue);
		productEntity.setDiscountPrice(DiscountPrice);
		productEntity.setTaxRate(productModel.getTaxRate());
		productEntity.setOfferPrice(OfferPrice);
		productEntity.setFinalPrice(FinalPrice);

		productRepository.save(productEntity);
	}
	public List<ProductEntity> getAllProducts() {
		
		List<ProductEntity>products = productRepository.findAll();
		return products;
	}
	
	public ProductEntity searchById(Long id) {
		Optional<ProductEntity> optionalData = productRepository.findById(id);
		if(optionalData.isPresent()) {
			ProductEntity product = optionalData.get();
			return product;
		}
		else {
			return null;
		}
	}
	
	public void deleteProductById(Long id) {
		productRepository.deleteById(id);
	}
	
	public ProductModel editProducts( Long id)
	{
		Optional<ProductEntity> optionalData=productRepository.findById(id);	
		ProductModel productModel = new ProductModel();
		if(optionalData.isPresent())
		{
			ProductEntity productEntity=optionalData.get();
		productModel.setName(productEntity.getName());
		productModel.setBrand(productEntity.getBrand());
		productModel.setMadeIn(productEntity.getMadeIn());
		productModel.setPrice(productEntity.getPrice());
		productModel.setQuantity(productEntity.getQuantity());
		productModel.setDiscountRate(productEntity.getDiscountRate());
		productModel.setTaxRate(productEntity.getTaxRate());
		
		return productModel;
		}
		else
		{
			return null;
		}
		
		
	}
	public void editProducts(long id, ProductModel productModel) {
		// TODO Auto-generated method stub
		Optional<ProductEntity> optional=productRepository.findById(id);
		if(optional.isPresent())
		{
			double discountPrice;
			discountPrice=productModel.getPrice()*productModel.getDiscountRate()/100;
			double offerPrice;
			offerPrice=productModel.getPrice()-discountPrice;
			double stockValue;
			stockValue=productModel.getPrice()*productModel.getQuantity();
			double taxPrice;
			taxPrice=productModel.getPrice()*productModel.getTaxRate()/100;
			double finalPrice;
			finalPrice=offerPrice+taxPrice;
			ProductEntity entity=optional.get();
			entity.setName(productModel.getName());
			entity.setBrand(productModel.getBrand());
			entity.setMadeIn(productModel.getMadeIn());
			entity.setPrice(productModel.getPrice());
			entity.setQuantity(productModel.getQuantity());
			entity.setDiscountRate(productModel.getDiscountRate());
			entity.setTaxRate(productModel.getTaxRate());
			entity.setOfferPrice(offerPrice);
			entity.setDiscountPrice(discountPrice);
			entity.setFinalPrice(finalPrice);
			entity.setTaxPrice(taxPrice);
			entity.setStockValue(stockValue);
			productRepository.save(entity);
		}
		
		}
}


















