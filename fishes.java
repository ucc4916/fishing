package Fishing;

import java.util.Scanner;

public class fishes {
	//바다 물고기
	 String fishname;
	 int fishlength;
	 int fishprice;
	 static fish[] sea=new fish[10];
	 static fish[] fresh2=new fish[10];

	static fishcase[] fishcasew=new fishcase[10];
	static int z=0;
	static int num=0;
	static int price=0;
	fishingrod fishingrod = new fishingrod();

	Scanner sc=new Scanner(System.in);
	
	
 void sea() {//바다물고기 정보
	
	sea[0] = new fish("홍어" , (int)((Math.random()*30)+1) , 5000);
	sea[1] = new fish("아귀" , (int)((Math.random()*30)+1) , 3000);
	sea[2] = new fish("무지개쥐돔",(int)((Math.random()*30)+1) , 8000);
	sea[3] = new fish("황물퉁돔" , (int)((Math.random()*30)+1) , 7000);
	sea[4] = new fish("고래상어" , (int)((Math.random()*30)+1) , 15000);
	sea[5] = new fish("정어리" , (int)((Math.random()*30)+1) , 2000);
	sea[6] = new fish("곰치" , (int)((Math.random()*30)+1) , 1500);
	sea[7] = new fish("넙치" , (int)((Math.random()*30)+1) , 3500);
	sea[8] = new fish("멸치" , (int)((Math.random()*30)+1) , 800);
	sea[9] = new fish("쥐치" , (int)((Math.random()*30)+1) , 1000);
int i=(int)((Math.random()*9));

System.out.println(i+"번 품종"+"."+sea[i].fishlength+"cm "+sea[i].fishname+"가 잡혔습니다.");
		String fishname=sea[i].fishname;
		int fishlength=sea[i].fishlength;
		int fishprice=sea[i].fishprice;
		if(fishlength>=20) {
			fishprice=(int) (fishprice*(1.5));
		}
		 fishcase fishcase=new fishcase(fishname,fishlength,fishprice);
		 fishcasew[z]=fishcase;
		price+=fishprice;
		 z++;
		 num++;
		}
	void fresh2() { //민물 물고기종류
	//민물 
		fresh2[0] = new fish("독중개",(int)((Math.random()*30)+1),8000);
		fresh2[1] = new fish("꺽지",(int)((Math.random()*30)+1),6000);
		fresh2[2] = new fish("다묵장어",(int)((Math.random()*30)+1),9000);
		fresh2[3] = new fish("돌고기",(int)((Math.random()*30)+1),3000);
		fresh2[4] = new fish("모래무지",(int)((Math.random()*30)+1),2000);
		fresh2[5] = new fish("밀어",(int)((Math.random()*30)+1),1000);
		fresh2[6] = new fish("쉬리",(int)((Math.random()*30)+1),8000);	
		fresh2[7] = new fish("쏘가리",(int)((Math.random()*30)+1),11000);	
		fresh2[8] = new fish("은어",(int)((Math.random()*30)+1),10000);	
		fresh2[9] = new fish("금어",(int)((Math.random()*30)+1),20000);	
		int i=(int)((Math.random()*9));

		System.out.println(i+"번 품종"+"."+fresh2[i].fishlength+"cm "+fresh2[i].fishname+"가 잡혔습니다.");
		String fishname=fresh2[i].fishname;
		int fishlength=fresh2[i].fishlength;
		int fishprice=fresh2[i].fishprice;
		if(fishlength>=20) {
			fishprice+=(1.5)*fishprice;
		}
		
		fishcase fishcase=new fishcase(fishname,fishlength,fishprice);
		 fishcasew[z]=fishcase;
			price+=fishprice;
		 z++;
		 num++;
		
}
		
			
void fishroom() {//수조관
			login log=new login();
		int o=0;
			
			System.out.println(      log.necname+"님의 수조관");

				while(o<num) {
					
					System.out.println("물고기 길이: "+fishcasew[o].fishnum+"cm |물고기 종류: "+fishcasew[o].fishname+" |물고기 시세: "+fishcasew[o].fishprice+"원");
				o++;
				}
				
				System.out.println("1.나가기");
			
			int num0=sc.nextInt();
			if(num0==1) {
				log.gamem();
			}
			else {
				System.out.println("잘못된키입니다.");
			}
		
}
 void sea1() {//게임 시작 질문
	shop sh=new shop();
	login log=new login();
	int k = 2;
	int select1;
	int  i = (int)(Math.random()*7)+10;
	String yes;
	System.out.println("낚시찌를 던지시겠습니까?  y/n");
	yes = sc.next();
	if(yes.equals("y")) {
	try {
		if(sh.myrodName.equals(null)) {
			
		}
	
	}catch(NullPointerException e) {
		System.out.println("낚시대가 없습니다. 낚시대를 구매하세요.");
		System.out.println("이전으로 >1");
		select1 = sc.nextInt();
		if(select1 == 1) {
			log.gamem();
	}}
	if(sh.foodnum<1) {
		System.out.println("먹이가 없습니다. 먹이를 구매하세요.");
		System.out.println("이전으로 >1");
		select1 = sc.nextInt();
		if(select1 == 1) {
			log.gamem();
	}
		
	}
		try{	
			System.out.println("낚시찌를 던졌습니다.");
			 --sh.foodnum;
			 System.out.println("남은  먹이의 수:"+sh.foodnum+"개");
			 System.out.print("낚시중");
		        while(k!=i) {
		 		System.out.print(".");
				Thread.sleep(500);
				k++;
				 if(k==i) {
					 System.out.println();
					 sea2(); 
				 }
				
		        }
		                
		}catch(Exception e) {
		        	System.out.println(e.getMessage());
		        }
	}
	else if(yes.equals("n")) {
		menu menu=new menu();
		menu.stageselect();
	}else {
		System.out.println("잘못된 키입니다.");
		sea1();
	}
}
 
 public void sea2() { //게임 룰
	 shop sh=new shop();
		int persent = (int)(Math.random()*8)+1;
		
		try{ 
			System.out.println("물고기가 낚시찌를 물었습니다!");
		    Thread.sleep(2000);
    
     if(sh.myrodName.equals("Normal")) {
	if(persent==1 || persent==5) {
		fishinfo();	
	
     }else {
		System.out.println("물고기가 도망쳤습니다.");
		sea1();
     }}
	if(sh.myrodName.equals("Rare")) {
		
		if(persent==1 || persent==3 || persent == 5 || persent ==7) {
			fishinfo();	
		
	    }else {
		System.out.println("물고기가 도망쳤습니다.");
		sea1();
	}}

	if(sh.myrodName.equals("Unique")) {
		
				fishinfo();
	}
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
		
		
	}

	public void fishinfo() { //게임결말
	  
 	System.out.println("물고기를 잡았습니다!");
 	menu menu=new menu();
 	if(menu.select==1) {
 		sea();
 	}else if(menu.select==2) {
 		fresh2();
 	}
 	sea1();
 
	}
	}







			




