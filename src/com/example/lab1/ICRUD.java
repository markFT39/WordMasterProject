package com.example.lab1;

public interface ICRUD {
	public Object add();
	public int updateItem(Object obj);
	public int deleteItem(Object obj);
	public void selectOne(int id);
}
