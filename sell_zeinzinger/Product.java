public class Product{
	private String name;
	private double price;
	
	public Product(){
		name = "Coca Cola";
		price = 2;
		
	}
	
	public void setProduct(String product){
		name = product;
	}
	
	public String getProduct(){
		return name;
	}
}