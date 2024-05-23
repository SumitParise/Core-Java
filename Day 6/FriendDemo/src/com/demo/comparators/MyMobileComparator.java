package com.demo.comparators;

import java.util.Comparator;

import com.demo.beans.Friend;

public class MyMobileComparator implements Comparator<Friend>{

	@Override
	public int compare(Friend o1, Friend o2) {
		System.out.println("in compare function using mobile"+o1.getMobile()+"---->"+o2.getMobile());
		return o1.getMobile().compareTo(o2.getMobile());
	}

}
