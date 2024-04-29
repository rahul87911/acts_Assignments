package pen_project;


public class Validation {

	public static PenAccount validateAll(String brand,String color, String inkcolor, String materialType, int availStock, 
			 double price, double discount,int quant) throws ErrorMain{
		
		Material material = validateMaterial( materialType);
		
		return new PenAccount(brand,color,inkcolor,material,availStock,price,discount,quant); 
	}
	
	public static Material validateMaterial(String materialType) throws ErrorMain {
		return Material.valueOf(materialType.toUpperCase());
	
	}
}
