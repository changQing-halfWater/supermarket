package org.jgs2010;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class SuperMaket {
	private Member member;

	public SuperMaket() {
	}

	public SuperMaket(Member member) {
		this.member = member;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
	//开卡
	public void openAccount(ArrayList<Member> memberInfo) {
		//ArrayList<Member> memberInfo = new ArrayList<Member>();
		Member member = new Member();
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		Date date = new Date();
		DateFormat dateInstance = DateFormat.getDateInstance();
		member.setDays(dateInstance.format(date));
		
		int cardNum = random.nextInt(1000)+1000;
		System.out.println("请输入姓名：");
		member.setName(scanner.next());
		member.setCardNum(cardNum);
		System.out.println("请设置密码");
		member.setPassWord(scanner.nextInt());
		System.out.println("开卡赠送500积分。");
		member.setScore(500);
		memberInfo.add(member);
		System.out.println(member);
		//return memberInfo;
		
	}
	
	//修改密码
	public void changePassword(ArrayList<Member> list) {
		int mark = -1;
		System.out.println("请输入你的卡号：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)!=null) {
				if (num == list.get(i).getCardNum()) {
					mark = i;
				}
			}
		}
		System.out.println("请输入您的密码");
		int passWord = scanner.nextInt();
		int i =3;
		while (i>0) {
			i--;
			if (passWord == list.get(mark).getPassWord()) {
				System.out.println("密码输入正确，请输入新密码：");
				list.get(mark).setPassWord(scanner.nextInt());
				break;
			}
			else {
				if (i!=0) {
				System.out.println("密码错误,请重新输入,错误三次系统将自动退出,还有"+i+"次机会");
				
					passWord = scanner.nextInt();
				}
				if (i==0) {
					System.out.println("系统退出");
					System.exit(1);
				}
			}	
		}
	}
	
	//消费
	public void spend(ArrayList<Member> list) {
		int mark = -1;
		System.out.println("请输入你的卡号：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)!=null) {
				if (num == list.get(i).getCardNum()) {
					mark = i;
				}
			}
		}
		System.out.println(list.get(mark));
		System.out.println("请输入您的消费金额，每一元累计1积分。");
		int num2 =(int)scanner.nextDouble();
		list.get(mark).setScore(list.get(mark).getScore()+num2);
		System.out.println(list.get(mark));
	}
	//积分兑换
	public void scroeExchange(ArrayList<Member> list) {
		int mark = -1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("每一百积分可兑换1元现金，不足一百积分不予兑换");
		System.out.println("请输入您的卡号：");
		int num = scanner.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)!=null) {
				if (num == list.get(i).getCardNum()) {
					mark = i;
				}
			}
		}
		System.out.println("请输入您的密码：");
		int passWord = scanner.nextInt();
		
		int i =3;
		while (i>0) {
			i--;
			if (passWord == list.get(mark).getPassWord()) {
				System.out.println("密码输入正确，请输入需要兑换的积分：");
				int num1 = scanner.nextInt();
				if (num1>list.get(mark).getScore()) {
					System.out.println("您的积分不足，不予兑换");
					break;
				}
				else {
					System.out.println("您共兑换"+num1+"积分，获得"+num1/100+"元现金");
					list.get(mark).setScore(list.get(mark).getScore()-num1);
					break;
				}
				
			}
			else {
				if (i!=0) {
				System.out.println("密码错误,请重新输入,错误三次系统将自动退出,还有"+i+"次机会");
				
					passWord = scanner.nextInt();
				}
				if (i==0) {
					System.out.println("系统退出");
					System.exit(1);
				}
			}	
		}
		
	}
	
	//积分查询
	public void checkScore(ArrayList<Member> list) {
		int mark = -1;
		System.out.println("请输入你的卡号：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)!=null) {
				if (num == list.get(i).getCardNum()) {
					mark = i;
				}
			}
		}
		System.out.println("请输入您的密码");
		int passWord = scanner.nextInt();
		int i =3;
		while (i>0) {
			i--;
			if (passWord == list.get(mark).getPassWord()) {
				System.out.println("密码输入正确，您当前可用积分为："+list.get(mark).getScore()+"分。");
				break;
			}
			else {
				if (i!=0) {
				System.out.println("密码错误,请重新输入,错误三次系统将自动退出,还有"+i+"次机会");
				
					passWord = scanner.nextInt();
				}
				if (i==0) {
					System.out.println("系统退出");
					System.exit(1);
				}
			}	
		}
		
	}
	
	

}
