package com.onlineinteract.general;

public class ComparableExample implements Comparable<ComparableExample> {

	private int value = 0;

	public ComparableExample(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public int compareTo(ComparableExample o) {

		if (getValue() > o.getValue())
			return 1;

		if (getValue() < o.getValue())
			return -1;

		return 0;
	}

	public static void main(String[] args) {
		ComparableExample ce = new ComparableExample(2);
		System.out.println("Comparing current object of 2 against 4 or 2.compareTo(4) yields: "
				+ ce.compareTo(new ComparableExample(4)));

	}

}
