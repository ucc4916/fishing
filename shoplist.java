package Fishing;

public class shoplist {
	int food;//미끼수
	String myrodName;//낚시대 종류
		int money;//보유금액
		String necname;
		public shoplist(String necname,	int money,String myrodName,int food) {
			this.necname=necname;
			this.money=money;
		this.myrodName=myrodName;
		this.food=food;
		}
}
