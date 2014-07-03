package bloglog;

public class Member {
	
	int member_id = 0;
	int account_number = 0;
	String first_name = "NULL";
	String last_name = "NULL";
	String password = "NULL";
	
	
	
	// TOSTRING
	// ========================================================================================= //
	
	public String toString()
	{
		return member_id +" | " + account_number + " | " + first_name + " | " + last_name + " | " + password;
	}
	
	// END OF TOSTRING
	// ========================================================================================= //
	
	
	// CONSTRUCTORS
	// ========================================================================================= //
	
	// CREATE A NULL MEMBER
	Member() 
	{
	}
	
	// CREATE A FULL MEMBER
	Member(int member_id, int account_number, String first_name, String last_name, String password) 
	{
		this.member_id = member_id;
		this.account_number = account_number;
		this.first_name = first_name;
		this.last_name = last_name;
		this.password = password;
	}
	
	// CREATE A MEMBER WITHOUT A SET MEMBER_ID
	Member(int account_number, String first_name, String last_name, String password) 
	{
		this.member_id = 0;
		this.account_number = account_number;
		this.first_name = first_name;
		this.last_name = last_name;
		this.password = password;
	}
	
	// END OF CONSTRUCTORS
	// ================================================================================================= //
	
	
	// GETTERS & SETTERS
	// ================================================================================================= //
	
	/**
	 * @return the member_id
	 */
	protected int getMember_id() {
		return member_id;
	}

	/**
	 * @param member_id the member_id to set
	 */
	protected void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	/**
	 * @return the account_number
	 */
	protected int getAccount_number() {
		return account_number;
	}

	/**
	 * @param account_number the account_number to set
	 */
	protected void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	/**
	 * @return the first_name
	 */
	protected String getFirst_name() {
		return first_name;
	}

	/**
	 * @param first_name the first_name to set
	 */
	protected void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	/**
	 * @return the last_name
	 */
	protected String getLast_name() {
		return last_name;
	}

	/**
	 * @param last_name the last_name to set
	 */
	protected void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	/**
	 * @return the password
	 */
	protected String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	protected void setPassword(String password) {
		this.password = password;
	}
	
	// END OF GETTERS & SETTERS
	// ================================================================================ //
	
}
