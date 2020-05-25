package com.yedam.practice.board;

import java.util.ArrayList;
import java.util.List;

public class BoardArray implements Board {

	static List<String> title = new ArrayList<String>();
	static List<String> contents = new ArrayList<String>();
	static List<String> user = new ArrayList<String>();
	@Override
	public String getTitle(int num) {
		return title.get(num);
		
	}
	@Override
	public void setTitle(String title) {
		this.title.add(title);
		
	}
	public void setTitle(String title, int num) {
		this.title.add(num, title);
	}
	public void delTitle(int num) {
		this.title.remove(num);
	}

	@Override
	public String getContent(int num) {
		return contents.get(num);
	
	}

	@Override
	public void setContent(String contents) {
		this.contents.add(contents);		
	}
	public void setContent(String contents, int num) {
		this.contents.add(num, contents);
	}
	public void delContent(int num) {
		this.contents.remove(num);
	}

	@Override
	public String getUser(int num) {
		return user.get(num);
		
	}

	@Override
	public void setUser(String user) {
		this.user.add(user);
		
	}
	public void setUser(String user, int num) {
		this.user.add(num, user);
	}
	public void delUser(int num) {
		this.user.remove(num);
	}

}
