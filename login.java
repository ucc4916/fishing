package Fishing;

import java.util.*;

public class login{
	
static String necname;

String name;
String password;
String logID;
String logPassword;
int k;
int i;
int a;

Scanner sc=new Scanner(System.in);


static logon lo[]=new logon[10];





void newID() {//회원가입

	System.out.println("       회원가입");
	System.out.println("=====================");
	System.out.println("사용할 ID를 입력해주세요. ");
	System.out.print(">>");
	String logID=sc.next();
	System.out.println("사용할 Password를 입력해주세요. ");
	System.out.print(">>");
	String logPassword=sc.next();
	System.out.println("사용할 닉네임을 입력해주세요 ");
	System.out.print(">>");
	String necname=sc.next();
	System.out.println("계정이 생성되었습니다.");
	logon loge=new logon(logID,logPassword,necname);
	
	lo[i]=loge;

	i++;
	main();
	
	
}
int m=0;

void logi() {//로그인
	a=0;

	System.out.println("        로그인");
	System.out.println("=====================");
	System.out.println("ID를 입력해주세요 ");
	System.out.print(">>");
	name=sc.next();
	System.out.println("PASSWORD를 입력해주세요 ");
	System.out.print(">>");
	password=sc.next();
	
	if(i==0) {
		System.out.println("회원이 아닙니다.");
		System.out.println();
		main();
	}
	
	
	while(a<i) {	
	k=a;
	if(name.equals(lo[a].logID)&& password.equals(lo[a].logPassword)) {
	System.out.println(lo[a].necname+"님이 로그인되었습니다.");	
	m=4;
	gamem();
	}
	a++;
	}
	
	while(m==0) {	
	
	System.out.println("회원이 아닙니다.");
	System.out.println("메인화면으로 돌아갑니다.");
	main();
	System.out.println();
		
	}
	}
	
	
	

void main() {//메인메뉴
	System.out.println("      Fishing");
	System.out.println("=====================");
	System.out.println("    메뉴를 선택해 주세요.");
	System.out.println("1.로그인                 2.회원가입");
	System.out.print(">>");
	menu menu=new menu();
	menu.num=sc.nextInt();
	if(menu.num==1) {
		logi();
	}else if(menu.num==2) {
		newID();
	
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
		fishes gm=new fishes();
		menu menu=new menu();
		System.out.println("게임을 시작합니다.");
		menu.stageselect();
	}else if(num2==2) {
		System.out.println("상점으로 이동합니다.");
	necname=lo[a].necname;
	System.out.println();
	System.out.println(necname+"님이 상점에 들어왔습니다.");
	
		shop shop=new shop();
		shop.enterShop();
	}else if(num2==4) {
		
		System.out.println(necname+"님이 "+shop.money+"원을 가지고 낚시터를 떠났습니다.");
		
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
















