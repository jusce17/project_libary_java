/**
 * 
 */
package com.java.book;

/**
 * @author eden_juscelino
 *
 */



public class BookRecord {
	
	private String bookTitle, bookType;
	private int bookCode;

	/**
	 * 
	 */
	public BookRecord(int bookCode, String bookTitle, String bookType) {
		
		this.bookCode = bookCode;
		this.bookTitle = bookTitle;
		this.bookType = bookType;
	}
	
	public int getBookCode(){
		return bookCode;
	}
	public String getBookCodeString(){ return Integer.toString(bookCode); }
	
	public String getBookTitle(){ return bookTitle; }
	
	public String getBookType(){ return bookType; }
	
	
	

}
