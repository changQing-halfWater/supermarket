package org.jgs2010;

import java.sql.Date;

public class Member {
	private String name;       //会员姓名
	private Integer cardNum;    //会员卡号
	private Integer passWord;    //会员密码
	private Integer score;       //会员卡积分
	private String days;
	
	public Member() {
	}
	
	public Member(String name, Integer cardNum, Integer passWord, Integer score,String days) {
		this.name = name;
		this.cardNum = cardNum;
		this.passWord = passWord;
		this.score = score;
		this.days = days;
	}

	


	@Override
	public String toString() {
		return "会员信息：" + name + "\t 卡号：" + cardNum +  "\t当前积分：" + score
				+ "\t开卡日期：" + days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public Integer getCardNum() {
		return cardNum;
	}

	public void setCardNum(Integer cardNum) {
		this.cardNum = cardNum;
	}

	public Integer getPassWord() {
		return passWord;
	}

	public void setPassWord(Integer passWord) {
		this.passWord = passWord;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	
	
	

}
