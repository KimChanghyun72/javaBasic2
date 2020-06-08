package com.yedam.exam;

public class Board {
	private int num=0;
	private String title=null;
	private String contents=null;
	
	Board(int num, String title, String contents){
		this.num = num;
		this.title = title;
		this.contents = contents;
	}
	public int getNum() {
		return num;
	}
	public String getTitle() {
		return title;
	}
	public String getContents() {
		return contents;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	
	
}
