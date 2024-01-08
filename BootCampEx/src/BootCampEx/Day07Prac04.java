package BootCampEx;

import java.util.*;

interface IStack<T> {
	T pop();
	boolean push(T ob);
}
class MyStack<T> implements IStack<T> {
	Vector<T> v = new Vector<T>();
	
	public T pop() {
		if(v.isEmpty()) return null;
		return v.remove(v.size()-1);
	}
	
	public boolean push(T ob) {
		return v.add(ob);
	}
}
public class Day07Prac04 {

	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for (int i=0;i<10;i++)stack.push(i);
		while(true) {
			Integer n = stack.pop();
			if(n == null) break;
			System.out.print(n+" ");
		}
	}

}
