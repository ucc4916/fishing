package Fishing;

public class fish {

	String fishname;
	int fishlength;
	int fishprice; //더블로 선언했기때문에 나중에 int로 캐스팅 해야함.
	
	public fish(String fishname,int fishlength,int fishprice){
		this.fishname = fishname;
		this.fishlength = fishlength;
		this.fishprice = fishprice;

}
}