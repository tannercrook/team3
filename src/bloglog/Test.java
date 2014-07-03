package bloglog;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Lets make a Member() -- there will only need to be one member on the actual system as it will be
		// downloaded or created and only shows the users information
		
		
		Member testMember = new Member();
		
		
		// Let's test the setters
		testMember.setMember_id(1);
		testMember.setAccount_number(12004);
		testMember.setFirst_name("Bob");
		testMember.setLast_name("Smith");
		testMember.setPassword("billy");
		
		// Let's test the getters
		System.out.println(testMember.getMember_id());
		System.out.println(testMember.getAccount_number());
		System.out.println(testMember.getFirst_name());
		System.out.println(testMember.getLast_name());
		System.out.println(testMember.getPassword());
		
		
		// Let's see if the tostring works
		System.out.println(testMember.toString());
		
		

	}

}
