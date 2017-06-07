/**
 * 
 */
package com.java.book;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author eden_juscelino
 *
 */
public class Book {

	private ArrayList<BookRecord> bookRecord;
	private static Scanner in = new Scanner(System.in);
	private File file;
	
	private Scanner inF = null;
	
	
	public void load(){
		bookRecord = new ArrayList<BookRecord>();
		 
		 file = new File("books.txt");
	        
	        try {
	            inF = new Scanner(file);   
	            
	            
	            while(inF.hasNext()) {
	            	
	                String bookTitle = inF.next();
	                String bookType = inF.next();
	                int bookCode = inF.nextInt();
	                
	                bookRecord.add( new BookRecord(bookCode,bookTitle, bookType)); 
	               
	                
	                          
	               
	            }
	        } catch (FileNotFoundException ex) {
	        	System.out.println(ex);
	            System.out.println("File not found!");
	        } finally {
	            inF.close();
	        }
	}
	


	/**
	 * 
	 */
	
	
	
	public Book() { /*
		 bookRecord = new ArrayList<BookRecord>();
		 
		 file = new File("books.txt");
	        
	        try {
	            inF = new Scanner(file);            
	            while(inF.hasNext()) {
	            	
	                String bookTitle = in.next();
	                String bookType = in.next();
	                int bookCode = in.nextInt();
	                
	                bookRecord.add( new BookRecord(bookCode,bookTitle, bookType)); 
	                
	                          
	               
	            }
	        } catch (FileNotFoundException ex) {
	        	System.out.println(ex);
	            System.out.println("File not found!");
	        } finally {
	            inF.close();
	        }
	        
	        */
	}
	
	
	
	
	
	public int getcode( int i ){
		
		
		
		return bookRecord.get(i).getBookCode();
	}
	
	public String getBookName(int i){
		
		return bookRecord.get(i).getBookTitle();
	}
	
	public String getBookType(int i){
		return bookRecord.get(i).getBookType();
	}
	
	
	public int getSize(){
		return bookRecord.size();
	}
	
	

}
