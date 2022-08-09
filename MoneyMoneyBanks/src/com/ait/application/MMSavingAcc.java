package com.ait.application;
import com.ait.framework.SavingAcc;
public abstract class MMSavingAcc extends SavingAcc{
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);		
	}
	public void withdraw(float accBal)
	{
		System.out.println("DEAR SAVING ACCOUNT USER YOUR WITHDRAWAL AMOUNT IS:"+accBal);
	}
	@Override
	public String toString() {
		return "MMSavingAcc [isSalaried()=" + isSalaried() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + "]";
	}
}