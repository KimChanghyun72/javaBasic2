package com.yedam.exceptions;

public class WrongPasswordException extends Exception{
	public WrongPasswordException() {
		//System.out.println("패스워드가 존재하지 않습니다.");
	}
	public WrongPasswordException(String password) {
		super("패스워드가 존재하지 않습니다.");
		//System.out.println("패스워드가 존재하지 않습니다.");
	}
}
