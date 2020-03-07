package com.stack.tdd;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
	
	private LinkedList<String> list;
	
	@Before
	public void setUp() {
		list = new LinkedList<>();
	}
	@Test
//	public void testingInitialListIsEmpty() {
	public void testingSize_initialList() {
		LinkedList list = new LinkedList();
		Assert.assertEquals(0, list.size());
	}
	
	@Test
	public void testSize_oneElement_sizeIsOne() {
		list.add("a");
		Assert.assertEquals(1,list.size());
	}

}
