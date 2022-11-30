package com.onlineinteract.bst;

public class Test {

	public static void main(String[] args) {
		Object a = 10;
		Object b = 20.0;
		Object c = " hello";
		Object d = add(0, a, b, c);

		System.out.println(d);
	}

	public static Object add(int pos, Object... objects) {
		
		Object add = add(pos + 1, objects);
		
		Integer returnInteger = new Integer(0);
		if (objects[pos] instanceof Integer)
			return (Integer) objects[pos];

		Double returnDouble = new Double(0.0);
		if (objects[pos] instanceof Double)
			return (Double) objects[pos];

		String returnString = new String();
		if (objects[pos] instanceof String)
			return (String) objects[pos];

		
		
		Object returnResult = returnInteger + returnDouble + returnString;
		
		if (pos < objects.length) {
			
		}

		return returnResult;
	}

//	public static Object add(Object a, Object b) {
//		Integer aa = null;
//		Integer bb = null;
//		if (a instanceof Integer)
//			aa = (Integer) a;
//		if (b instanceof Integer)
//			bb = (Integer) b;
//
//		return aa + bb;
//	}
}
