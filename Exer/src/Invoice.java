// invoice for an item

public class Invoice 
{
	private String number;
	private String description;
	private int quantity;
	private  double price;
	
	public Invoice(String no,String desc,int quan,double item){
		number = no;
		description = desc;
		quantity = quan;
		price = item;
		
	}
	public void setno(String no){
		number= no;
	}public String getno(){return number;}
	
	
	public void setdesc(String desc){
		description = desc;
		}public String getdesc(){return description;}
	
	
	public void setquan(int quan){
		quantity = quan;
	}public int getquan(){return quantity;}
	
	
	public void setitem(double item){
		price = item;
	}public double getitem(){return price;}
	
	
	public double amount(){
		double calc;
		calc = quantity * price;
		return calc;}

}
