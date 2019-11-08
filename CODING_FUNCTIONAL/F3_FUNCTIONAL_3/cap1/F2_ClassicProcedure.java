package cap1;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class F2_ClassicProcedure {

	public static void getTotalDiscount(List<BigDecimal>prices) {
		boolean found = false;
		BigDecimal totalOfDiscountedPrices=new BigDecimal(60);
		for(BigDecimal price:prices) {
			if(price.compareTo(BigDecimal.valueOf(20))>0) {
				totalOfDiscountedPrices = totalOfDiscountedPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
			}
		}
		System.out.println("Total of discounted prices: "+ totalOfDiscountedPrices);
	}
	
	
	public static void main(String[] args) {
		List<BigDecimal> prices = Arrays.asList(new BigDecimal("10"), 
											new BigDecimal("30"), 
											new BigDecimal("17"),
											new BigDecimal("20"), 
											new BigDecimal("15"), 
											new BigDecimal("18"),
											new BigDecimal("45"), 
											new BigDecimal("12"));
	getTotalDiscount(prices);

	}

}
