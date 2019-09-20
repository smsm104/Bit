package com.bittago.repository.vo;

public class Reservation {

	private int rsvNo;
	private int schN0;
	private int userNo;
	private int nonuserNo;
	private int adultsCnt;
	private int kidsCnt;
	private int payment;
	
	public int getRsvNo() {
		return rsvNo;
	}
	public void setRsvNo(int rsvNo) {
		this.rsvNo = rsvNo;
	}
	public int getSchN0() {
		return schN0;
	}
	public void setSchN0(int schN0) {
		this.schN0 = schN0;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public int getNonuserNo() {
		return nonuserNo;
	}
	public void setNonuserNo(int nonuserNo) {
		this.nonuserNo = nonuserNo;
	}
	public int getAdultsCnt() {
		return adultsCnt;
	}
	public void setAdultsCnt(int adultsCnt) {
		this.adultsCnt = adultsCnt;
	}
	public int getKidsCnt() {
		return kidsCnt;
	}
	public void setKidsCnt(int kidsCnt) {
		this.kidsCnt = kidsCnt;
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	
}
