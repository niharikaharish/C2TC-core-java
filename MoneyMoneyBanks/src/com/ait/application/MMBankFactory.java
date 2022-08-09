package com.ait.application;
import com.ait.framework.BankFactory;
import com.ait.framework.CurrentAcc;
import com.ait.framework.SavingAcc;
public abstract class MMBankFactory implements BankFactory{
	private static final Object SavingAcc = null;
	@Override
	public Object getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) {
		SavingAcc savingAcc=new MMSavingAcc(AccNo, accNm, accBal, isSalaried);
	return SavingAcc;
	}
	@Override
	public Object getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
		CurrentAcc currentAcc=new MMCurrentAcc(AccNo, accNm, accBal, creditLimit);
	Object CurrentAcc;
	return CurrentAcc;
	}
}