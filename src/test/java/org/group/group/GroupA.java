package org.group.group;

import org.testng.annotations.Test;

public class GroupA {
	@Test(groups="smoke")
	private void test1() {
       System.out.println("Test1");
	}
	@Test(groups="smoke")
	private void test2() {
System.out.println("test2");
	}
	@Test(groups="sanity")
	private void test3() {
System.out.println("Test3");
	}
	@Test(groups="smoke")
	private void test4() {
       System.out.println("Test4");
	}
	@Test(groups="smoke")
	private void test6() {
System.out.println("test6");
	}
	@Test(groups="sanity")
	private void test7() {
System.out.println("Test7");
	}
	@Test(groups="smoke")
	private void test8() {
       System.out.println("Test8");
	}
	@Test(groups="smoke")
	private void test9() {
System.out.println("test9");
	}
	@Test(groups="regression")
	private void test10() {
System.out.println("Test10");
	}
	@Test(groups="regression")
	private void test11() {
       System.out.println("Test11");
	}
	@Test(groups="smoke")
	private void test12() {
System.out.println("test12");
	}
	@Test(groups="sanity")
	private void test13() {
System.out.println("Test13");
	}

}
