package Fishing;

import java.util.Scanner;

public class gameroll {
	Scanner sc = new Scanner(System.in);
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
				menu menu=new menu();
				fishes fishes=new fishes();
		 	System.out.println("물고기를 잡았습니다!");
		 	
		 	if(menu.select==1) {
		 		fishes.sea();
		 	}else if(menu.select==2) {
		 		fishes.fresh2();
		 	}
		 	sea1();
		 
			}
}
