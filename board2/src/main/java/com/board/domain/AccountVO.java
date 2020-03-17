package com.board.domain;

public class AccountVO extends BoardVO{
	
	private String busiNum;
	private String factory;
	private String tradeBank;
	private String accountNum;
	
	public AccountVO() {}

	public String getBusiNum() {
		return busiNum;
	}

	public void setBusiNum(String busiNum) {
		this.busiNum = busiNum;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getTradeBank() {
		return tradeBank;
	}

	public void setTradeBank(String tradeBank) {
		this.tradeBank = tradeBank;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	@Override
	public String toString() {
		return "AccountVO [busiNum=" + busiNum + ", factory=" + factory + ", tradeBank=" + tradeBank + ", accountNum="
				+ accountNum + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((accountNum == null) ? 0 : accountNum.hashCode());
		result = prime * result + ((busiNum == null) ? 0 : busiNum.hashCode());
		result = prime * result + ((factory == null) ? 0 : factory.hashCode());
		result = prime * result + ((tradeBank == null) ? 0 : tradeBank.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountVO other = (AccountVO) obj;
		if (accountNum == null) {
			if (other.accountNum != null)
				return false;
		} else if (!accountNum.equals(other.accountNum))
			return false;
		if (busiNum == null) {
			if (other.busiNum != null)
				return false;
		} else if (!busiNum.equals(other.busiNum))
			return false;
		if (factory == null) {
			if (other.factory != null)
				return false;
		} else if (!factory.equals(other.factory))
			return false;
		if (tradeBank == null) {
			if (other.tradeBank != null)
				return false;
		} else if (!tradeBank.equals(other.tradeBank))
			return false;
		return true;
	}

	public AccountVO(String busiNum, String factory, String tradeBank, String accountNum) {
		super();
		this.busiNum = busiNum;
		this.factory = factory;
		this.tradeBank = tradeBank;
		this.accountNum = accountNum;
	}

}
