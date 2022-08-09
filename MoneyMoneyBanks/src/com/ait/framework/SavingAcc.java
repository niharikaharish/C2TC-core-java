package com.ait.framework;
public abstract class SavingAcc extends BankAcc{
	private boolean isSalaried;
	private static final float MINBAL=100;
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	public boolean isSalaried() {
		return isSalaried;
	}
	public static float getMinbal() {
		return MINBAL;
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", isSalaried()=" + isSalaried() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + "]";
	}
	}
