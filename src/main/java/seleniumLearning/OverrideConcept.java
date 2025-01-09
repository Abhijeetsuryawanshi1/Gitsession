package seleniumLearning;

import org.openqa.selenium.WebElement;

public class OverrideConcept extends Object{
	
	@Override
	public String toString() {
		
		return "Vijay";
		
	}

	public static void main(String[] args) {
		
		OverrideConcept oj = new OverrideConcept();
		Object ob = new OverrideConcept();
		//ob.to
		//System.out.println(oj.toString());

	}

}
