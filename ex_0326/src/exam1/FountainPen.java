package exam1;

public class FountainPen extends Pen{

	private int amount; 
	private String color;
	
	public int getAmount(){
		return amount;
	}
	
	
	public void setAmount(int amount){
		this.amount = amount;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public void refill(int n){
		setAmount(n);
	}
	
	
	
	
	
	
	
	
	
	
	
}
