package springBootMVC__2.productentity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
public class ProductEntity {
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	private String brand;
	private String madeIn;
	private double price;
	private int quantity;
	private double discountRate;
	private double taxRate;
	private double discountPrice;
	private double offerPrice;
	private double finalPrice;
	private double stockValue;
	private double taxPrice;

}