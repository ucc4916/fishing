package Fishing;



	import java.util.*;
	public class shop {
		Scanner sc = new Scanner(System.in);
		int input; // 처음 입력 변수
		int input2; //구입용 입력 변수
		public static int food; // 먹이
		static int money=500000; //수중에 가지고 있는돈 초기값 50000
		public static int foodnum;
		public static String myrodName;
		static int l=0;
		
		login log =new login();
		
		int o=log.k;
		public void enterShop() {//상점초기메뉴
		
			
			do {
			System.out.println("1.먹이 구입"+"  "+"2.낚시대 구입"+"  "+"3.판매"+"  "+"4.상점 나가기");
			System.out.print(">>");
			input = sc.nextInt();
			if(input==1) {
				System.out.println("먹이는 개당 1000원 입니다.");
				System.out.println("현재 보유 자산은: "+money+"입니다.");
				System.out.println("구매할 갯수를 입력해 주세요.");
				System.out.print(">>");
				food = sc.nextInt();
				if(0>(money-(food*1000))) {
				System.out.println("보유 자산이 부족합니다.");
				System.out.println();} 
				else {
					
					System.out.println(food+"개 구입 성공!");
					money = money -(food*1000);
					foodnum+=food;
					System.out.println("현재 보유 Money는 "+money+"원 입니다.");
					System.out.println();
				}}
			if(input==2) {
				
				System.out.println("1번: Normal 낚싯대 : 39000원");
				System.out.println("2번: Rare 낚싯대 : 45000원");
				System.out.println("3번: Unique 낚싯대 : 49000원");
				System.out.println("4번 : 상위 메뉴로");
				System.out.print("번호를 입력해주세요 : ");
				input2 = sc.nextInt();
				if(input2==1) {
					if(money<39000) {
						System.out.println("money가 부족합니다.");
						System.out.println("현재 보유 Money는 "+money+"원 입니다.");
						System.out.println();
					}
					else {
					System.out.println("Normal 낚싯대를 구입하셨습니다.");
					fishingrod rod1 = new fishingrod();
					
					myrodName = rod1.Normal;
					money -= 39000;
					System.out.println("현재 보유 Money는 "+money+"원 입니다.");
					System.out.println();
					}
				}
				else if(input2==2) {
					if(money<45000) {
						System.out.println("money가 부족합니다.");
					}
					else {
					System.out.println("Rare 낚싯대를 구입하셨습니다.");
					System.out.println("현재 보유 Money는 "+money+"원 입니다.");
					System.out.println();
					fishingrod rod2 = new fishingrod();
					
					myrodName = rod2.Rare;
					money -= 45000;	
					System.out.println();
					}
					
				}
				else if(input2==3) {
					if(money<49000) {
						System.out.println("money가 부족합니다.");
						System.out.println();
					}else {
						money -= 49000;
					System.out.println("Unique 낚싯대를 구입하셨습니다.");
					System.out.println("현재 보유 Money는 "+money+"원 입니다.");
					System.out.println();
					fishingrod rod3 = new fishingrod();
					
					myrodName = rod3.Unique;
					
					System.out.println();
					}
					
				}
				else if(input2==4) {
					enterShop();
				}
				else {
					System.out.println("잘못된키입니다.");
				}
				
				}
			
			if(input==3) {
				System.out.println();
				System.out.println("1.물고기판매  2.낚싯대 판매  3.상위메뉴로");
				System.out.print(">>");
				
				input2 = sc.nextInt();
				if(input2==1) {
					fishes fishes=new fishes();
					//내 수족관에 있는 물고기 정보를 가져온다.
					System.out.println(log.necname+"님이 보유한 물고기");
					while(l<fishes.num) {
					System.out.println("물고기 길이: "+fishes.fishcasew[l].fishnum+"cm |물고기 종류: "+fishes.fishcasew[l].fishname+" |물고기 시세: "+fishes.fishcasew[l].fishprice+"원");
					l++;
					}//물고기들의 이름과 가격정보를 보여준다 , 모두 판매로 안하면 엄청 복잡해짐
					System.out.println("모두 판매하시겠습니까? Yes:1번");
					System.out.println("상위 메뉴 Go:2번");
					System.out.print(">>");
					input2 = sc.nextInt();
					if(input2==1) {
						// 물고기 금액에 맞는 돈을 money에 +해서 대입한다.
						System.out.println("잡은 물고기들이"+fishes.price+"원에 판매되었습니다.");
						// money + 시키기
						money+=	fishes.price;
						System.out.println("현재 보유 Money는 "+money+"원 입니다.");
						System.out.println();
					}
					if(input2==2) {
						continue;
					}}
					if(input2==2) {
						System.out.println();
						System.out.println("낚싯대 판매 가격은 모두 20000원 입니다");
						System.out.println("현재 보유한 낚싯대는 "+myrodName+" 입니다.");
						System.out.println("판매 하시겠습니까? Yes:1 No:2");
						System.out.print(">>");
						input2 = sc.nextInt();
						if(input2==1) {
							System.out.println("판매되었습니다.");
						
							myrodName=null;
							money += 20000;
							System.out.println("현재 보유 Money는 "+money+"원 입니다.");
							System.out.println();
						}
					}
			}

}
while(input!=4);
			shoplist fishshop2=new shoplist(log.necname, money, myrodName, food);
			
			System.out.println(fishshop2.necname+"님의 장비");
		System.out.println("돈: "+fishshop2.money+"낚시대: "+fishshop2.myrodName+"미끼 수: "+foodnum);
			log.gamem();
			
			
		}
		
	
	}



