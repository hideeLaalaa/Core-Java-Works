package objectOriented;

public class ch10 {

	public static void main(String[] args) {

		// EXAMPLE TEST
/*		commissionEmployee com = new commissionEmployee(
				"Sue","Jones","222-22-2222",1000, .06);
		basePlusCommissionEmployee base = new basePlusCommissionEmployee(
				"Dee","Lewis","222-22-3333",5000, .04,300);
		System.out.printf("%s %s:\n\n%s\n\n", 
				"Call CommissionEmployee's toString with superclass reference ",
				"to superclass object",com.toString());
		System.out.printf("%s %s:\n\n%s\n\n", 
				"Call baseCommissionEmployee's toString with subclass reference ",
				"to subclass object",base.toString());
		//invoking subclass obj using superclass var
		commissionEmployee com2 = base;
		
		System.out.printf("%s %s:\n\n%s\n\n", 
				"Call baseCommissionEmployee's toString with superclass reference ",
				"to subclass object",com2.toString());
*/
		
		//PAYROLL TEST
	/*	PayrollSystemTest test = new PayrollSystemTest();
		test.run();
	*/
		
		
		//PAYABLE INTERFACE TEST
	/*	payableInterfaceTest test = new payableInterfaceTest();
		test.run();
	*/
		
		//CARRBON FOOTPRINT TEST
		CarbonFootPrintTest test = new CarbonFootPrintTest();
		test.run();
		
		
	}

}
