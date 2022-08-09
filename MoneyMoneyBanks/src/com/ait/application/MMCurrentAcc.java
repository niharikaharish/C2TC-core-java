package com.ait.application;

import com.ait.framework.CurrentAcc;

public abstract class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}
	public void withdraw(float accBal)
	{
		System.out.println("DEAR CURRENT ACCOUNT USER YOUR WITHDRAWAL AMOUNT IS:"+accBal);
	}
	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + "]";
	}
	}
