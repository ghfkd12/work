package ex04_interface;

public class Kitchen implements Menu1, Menu2 {
	
	@Override
	public String JJamBBong() {
		// TODO Auto-generated method stub
		return "면+해물+육수";
	}
	
	@Override
	public String jajang() {
		// TODO Auto-generated method stub
		return "면+춘장+완두콩";
	}
}
