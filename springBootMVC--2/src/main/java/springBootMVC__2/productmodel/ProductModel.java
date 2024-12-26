package springBootMVC__2.productmodel;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Getter
public class ProductModel {
	
	private String name;
	private String brand;
	private String madeIn;
	private double price;
	private int Quantity;
	private double discountRate;
	private double taxRate;
	private double stockValue;
}
