package Fishing;

import java.util.Scanner;

public class menu {
	login log=new login();
	static int num;
	static int select;
Scanner sc=new Scanner(System.in);
	public void stageselect() { //게임 지역 선택
		
		shop sh=new shop();
				System.out.println("=================스테이지 선택 =========");
		    	System.out.println("|1. 바다  |2. 민물   |3. 수조보기|4. 이전메뉴");
		    	System.out.println("===================================");
		    	select = sc.nextInt();
		    	if(select == 1 || select == 2) {
		    		gameroll gameroll=new gameroll();
		    		gameroll.sea1();
			        }
		    	else if(select == 3) {
		    		fishes fishes=new fishes();
		    		fishes.fishroom();
		    	}
		    	else if (select==4) {
		    		log.gamem();
		    	}
		    	else {
		    		System.out.println("잘못된키입니다.");
		    		stageselect();
		    	}
		}
		public void main() {//메인메뉴
			System.out.println("      Fishing");
			System.out.println("=====================");
			System.out.println("    메뉴를 선택해 주세요.");
			System.out.println("1.로그인                 2.회원가입");
			System.out.print(">>");
			num=sc.nextInt();
			if(num==1) {
				log.logi();
			}else if(num==2) {
				log.newID();
			
			}else {
				System.out.println("잘못된 키입니다.");
				System.out.println();
			main();
			}}

		public void gamem() {//게임 시작메뉴


			System.out.println("      FishingGame");
			System.out.println("=========================");
			System.out.println("1.게임시작 2.상점 3.수조관 4.종료");
			System.out.print(">>");
			
			int num2=sc.nextInt();
			if(num2==1) {
				
				System.out.println("게임을 시작합니다.");
				stageselect();
			}else if(num2==2) {
				System.out.println("상점으로 이동합니다.");
			log.necname=log.lo[log.k].necname;
			System.out.println(log.necname+"님이 상점에 들어왔습니다.");
			
				shop shop=new shop();
				shop.enterShop();
			}else if(num2==4) {
				
				System.out.println(log.necname+"님이 "+shop.money+"원을 가지고 낚시터를 떠났습니다.");
			sc.close();
			}else if(num2==3) {
				fishes gm=new fishes();
				gm.fishroom();
			}
			
			
			else {
				System.out.println("잘못된 키입니다.");
				gamem();
			}
			
			
			}
		
			
			
		}


	
