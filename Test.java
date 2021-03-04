package org.jgs2010;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	SuperMaket superMaket = new SuperMaket();
	Member member = new Member();
	ArrayList<Member> list = new ArrayList<Member>();
	/*
	 * list = superMaket.openAccount(); System.out.println(list.get(0))
	 */;

		System.out.println("请选择您需要的服务：1 .开卡；2.修改密码; 3.消费；4.积分兑换；5.查询积分；6.退出");
	 Scanner scanner = new Scanner(System.in);
	 int choose = scanner.nextInt();
	 while (true) {
		 //开卡
		while(choose==1) {
			superMaket.openAccount(list);
			System.out.println("请选择您需要的服务：1 .开卡；2.修改密码; 3.消费；4.积分兑换；5.查询积分；6.退出");
			choose = scanner.nextInt();
			break;
		}
		//修改密码
		while (choose==2) {
			superMaket.changePassword(list);
			System.out.println("请选择您需要的服务：1 .开卡；2.修改密码; 3.消费；4.积分兑换；5.查询积分；6.退出");
			choose = scanner.nextInt();
			break;
		}
		
		//消费
		while (choose==3) {
			superMaket.spend(list);
			
			System.out.println("请选择您需要的服务：1 .开卡；2.修改密码; 3.消费；4.积分兑换；5.查询积分；6.退出");
			choose = scanner.nextInt();
			break;
		}
		
		//积分兑换
		while (choose==4) {
			superMaket.scroeExchange(list);
			
			System.out.println("请选择您需要的服务：1 .开卡；2.修改密码; 3.消费；4.积分兑换；5.查询积分；6.退出");
			choose = scanner.nextInt();
			break;
		}
		
		
		//查询积分
		while (choose==5) {
			superMaket.checkScore(list);
			System.out.println("请选择您需要的服务：1 .开卡；2.修改密码; 3.消费；4.积分兑换；5.查询积分；6.退出");
			choose = scanner.nextInt();
			break;
		}
		
		//退出
		if (choose==6) {
			break;
		}
	}
}
}
