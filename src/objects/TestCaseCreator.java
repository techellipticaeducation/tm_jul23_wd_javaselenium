package objects;

import java.util.ArrayList;
import java.util.List;

public class TestCaseCreator {
	public static void main(String[] args) {
		TestCase tc1 = new TestCase();
		tc1.testCaseId = 1;
		tc1.testcaseName = "testcase1 for login";
		tc1.testcaseDesc = "this case is for login purpose";

		TestStep s1 = new TestStep();
		s1.teststepNumber=1;
		s1.stepdesc = "user login";
		s1.stepExpected = "should lgin";
		
		TestStep s2 = new TestStep();
		s2.teststepNumber=2;
		s2.stepdesc = "second desc";
		s2.stepExpected = "second expected";
		
		List<TestStep> stepList = new ArrayList<TestStep>();
		stepList.add(s1);//0
		stepList.add(s2);//1
		
		tc1.teststeps = stepList;
		
		
		
		System.out.println(tc1.testcaseName);
		System.out.println(tc1.teststeps.get(0).stepdesc);

	}
}
