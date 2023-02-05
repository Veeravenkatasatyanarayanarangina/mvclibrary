package com.library.beans;

public class Book {
	private int bkid;
	private String book_name;
	private float book_price;
	private String book_auther;
	private String publisher;
	private String year;
	public int getBkid() {
		return bkid;
	}
	public void setBkid(int bkid) {
		this.bkid = bkid;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public float getBook_price() {
		return book_price;
	}
	public void setBook_price(float book_price) {
		this.book_price = book_price;
	}
	public String getBook_auther() {
		return book_auther;
	}
	public void setBook_auther(String book_auther) {
		this.book_auther = book_auther;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Book(int bkid, String book_name, float book_price, String book_auther, String publisher, String year) {
		super();
		this.bkid = bkid;
		this.book_name = book_name;
		this.book_price = book_price;
		this.book_auther = book_auther;
		this.publisher = publisher;
		this.year = year;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
