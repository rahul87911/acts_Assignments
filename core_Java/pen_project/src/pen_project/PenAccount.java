package pen_project;

import java.time.LocalDate;

public class PenAccount {
	private static int staticInt;
	private static LocalDate updateDate;
	
	private int id;
	private String brand;
	private String color;
	private String inkcolor;
	private Material materialType;
	private int availStock;
	private LocalDate ListingDate;
	private double price;
	private double discount;
	private int quantity;
	
	
	static {
		staticInt = 1;
		updateDate = LocalDate.now();
	}


	public PenAccount( String brand, String color, String inkcolor, Material materialType, int availStock,
			 double price, double discount,int quant) {
		super();
		this.id = staticInt;
		this.brand = brand;
		this.color = color;
		this.inkcolor = inkcolor;
		this.materialType = materialType;
		this.availStock = availStock;
		ListingDate = updateDate;
		this.price = price;
		this.discount = discount;
		this.quantity=quant;
		
		staticInt++;
	}





	public int getQuantity() {
		return quantity;
	}





	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}





	public static int getStaticInt() {
		return staticInt;
	}


	public static void setStaticInt(int staticInt) {
		PenAccount.staticInt = staticInt;
	}


	public static LocalDate getUpdateDate() {
		return updateDate;
	}


	public static void setUpdateDate(LocalDate updateDate) {
		PenAccount.updateDate = updateDate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getInkcolor() {
		return inkcolor;
	}


	public void setInkcolor(String inkcolor) {
		this.inkcolor = inkcolor;
	}


	public Material getMaterialType() {
		return materialType;
	}


	public void setMaterialType(Material materialType) {
		this.materialType = materialType;
	}


	public int getAvailStock() {
		return availStock;
	}


	public void setAvailStock(int availStock) {
		this.availStock = availStock;
	}


	public LocalDate getListingDate() {
		return ListingDate;
	}


	public void setListingDate(LocalDate listingDate) {
		ListingDate = listingDate;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	@Override
	public String toString() {
		return "PenAccount [id=" + id + ", brand=" + brand + ", color=" + color + ", inkcolor=" + inkcolor
				+ ", materialType=" + materialType + ", availStock=" + availStock + ", ListingDate=" + ListingDate
				+ ", price=" + price + ", discount=" + discount + "]";
	}


	
	
	
}
