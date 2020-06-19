package com.yedam.practice.board;

public interface Board {
	String getTitle(int num);
	void setTitle(String title);
	
	String getContent(int num);
	void setContent(String contents);
	
	String getUser(int num);
	void setUser(String user);
	
}
