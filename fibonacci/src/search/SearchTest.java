package search;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
//import org.junit.Rule;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInfo;
//import org.junit.rules.TestRule;
//import org.junit.rules.TestWatcher;
//import org.junit.runner.Description;

class SearchTest {
	String description = "|| Meklejam: ";
	String virkne = "|| Virkne: ";
	//String test = "Test-";
	String ss="Test Name == ";

	public void printOut(/* int testID,*/String str, int x, int a[],int aff) {
		//String name = new Object(){}.getClass().getEnclosingMethod().getName();
		description += x;
		virkne +=Arrays.toString(a);
		//test +=testID;
		if(aff != -1) {
			System.out.println(/*test + */ss+str + description + virkne +" --- Atrasts");
		} else if(aff == -1) {
			System.out.println(/*test + */ss+str + description + virkne +" --- Netika atrasts");
		} else {
			System.out.println(/*test + */ss+str + description + virkne +" --- Kluda ieraksta...");
		}
		
	}
	
	//@Rule
	//public TestRule watcher = new TestWatcher() {
	//   protected void starting(Description description) {
	//      System.out.println("Starting test: " + description.getMethodName());
	//   }
	//};
	

	@Test 
	@DisplayName("Test Case 1")
	public void testCase1() {
		int a[] = {1,3,5,8,19};
		int x = 3;
		int index = 1;
	
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		//System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

		assertEquals("Text: ", Search.find(x,a),index);
		printOut(name,x,a,index);
	}
	
	@Test
	@DisplayName("Test Case 2")
	public void testCase2() {
		int a[] = {-3,-1,5,5,8,19};
		int x = 8;
		int index = 4;
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		//System.out.println(name);
		assertEquals("Text: ", Search.find(x,a),index);
		printOut(name,x,a,index);
	}
	
	@Test
	@DisplayName("Test Case 3")
	public void testCase3() {
		int a[] = {-3,-1,5,5,8,19};
		int x = 19;
		int index = 5;
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		assertEquals("Text: ", Search.find(x,a),index);
		printOut(name,x,a,index);
	}
	
	@Test
	@DisplayName("Test Case 4")
	public void testCase4() {
		int a[] = {-3,-1,5,5,8,19};
		int x = -3;
		int index = 0;
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		assertEquals("Text: ", Search.find(x,a),index);
		printOut(name,x,a,index);
	}
	
	@Test
	@DisplayName("Test Case 5")
	public void testCase5() {
		int a[] = {-3,-1,5,5,8,19};
		int x = 5;
		int index = 2;
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		assertEquals("Text: ", Search.find(x,a),index);
		printOut(name,x,a,index);
	}
	
	@Test
	@DisplayName("Test Case 6 ...")
	public void testCase6() {
		int a[] = {-3,-1,5,5,8,19};
		int x = 7;
		int index = -1;
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		assertEquals("Text: ", Search.find(x,a),index);
		printOut(name,x,a,index);
	}
	
	
	
	//@Test
	//@DisplayName("This is my test")
	//void test1(TestInfo testInfo) {
	//    assertEquals("This is my test", testInfo.getDisplayName());
	//}
}
