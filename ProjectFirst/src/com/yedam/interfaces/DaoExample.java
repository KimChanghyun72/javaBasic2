package com.yedam.interfaces;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}

interface DataAccessObject {
	void select();
	void insert();
	void update();
	void delete();
}
class MySqlDao implements DataAccessObject {
	String dbType = "Mysql DB";
	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println(dbType+"에서 검색");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println(dbType+"에서 삽입");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(dbType+"에서 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println(dbType+"에서 삭제");
	}
	
}

class OracleDao implements DataAccessObject {
	String dbType = "Oracle DB";
	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println(dbType+"에서 검색");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println(dbType+"에서 삽입");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(dbType+"에서 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println(dbType+"에서 삭제");
	}
	
}

