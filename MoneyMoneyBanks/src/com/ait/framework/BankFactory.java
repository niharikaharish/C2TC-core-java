package com.ait.framework;
public interface BankFactory {
	public Object getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried);
	public Object getNewCurrentAcc(int AccNo, String accNm, float accBal,float creditLimit);
}
