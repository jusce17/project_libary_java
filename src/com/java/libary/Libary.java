package com.java.libary;

import java.util.ArrayList;

import com.java.book.Book;
import com.java.book.BookRecord;
import java.awt.*;
import javax.swing.*;

public class Libary {
	
	
	public static Book book = new Book();
	private static ArrayList<BookRecord> horrorBooks, actionBooks, funnyBooks;
	
	private JFrame mainFrame;
	private JPanel panel;
	private JButton button1;
	private JLabel label;

	public Libary() {
		// TODO Auto-generated constructor stub
		
		//Book book = new Book();
		
		gui();
		
	}
	
	public void gui(){
		mainFrame =  new JFrame("Libary");
		mainFrame.setVisible(true);
		mainFrame.setSize(800, 400);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.blue);
		
		
		button1 = new JButton("test");
		
		label = new JLabel("a test label");
		
		
		panel.add(button1); panel.add(label);
		mainFrame.add(panel);
	}

	public static void main(String[] args) {
		new Libary();
		// TODO Auto-generated method stub
		horrorBooks  = new ArrayList<BookRecord>();
		actionBooks  = new ArrayList<BookRecord>();
		funnyBooks   = new ArrayList<BookRecord>();
		
	
		book.load();
		
		
		for (int i=0; i< book.getSize(); i++){
			
			if(book.getBookType(i).equals("Horror")){
				horrorBooks.add(new BookRecord(book.getcode(i) , book.getBookName(i ) , book.getBookType(i) ));
				
			}else if(book.getBookType(i).equals("Action")){
				actionBooks.add(new BookRecord(book.getcode(i) , book.getBookName(i ) , book.getBookType(i) ));
			} else if(book.getBookType(i).equals("Funny")){
				
				funnyBooks.add(new BookRecord(book.getcode(i) , book.getBookName(i ) , book.getBookType(i) ));
			}
				
			
				
			
			}
		
		

	}

}
