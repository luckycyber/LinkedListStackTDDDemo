package com.stack.tdd;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
	
	@Test
//	public void testingInitialListIsEmpty() {
	public void testingSize_initialList() {
		LinkedList list = new LinkedList();
		Assert.assertEquals(0, list.size());
	}

}
