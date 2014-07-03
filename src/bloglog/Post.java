package bloglog;

import java.util.Date;

public class Post {
	
	int post_id = 0;
	int owning_member_id = 0;   // This will be set to the member_id of the system
	Date date = new Date();
	String subtitle = "NULL";
	String content = "NULL";
	
	Post()
	{
	}
	
	Post(int post_id, int owning_member_id, Date date, String subtitle, String content)
	{
		
		this.post_id = post_id;
		this.owning_member_id = owning_member_id;
		this.date = date;
		this.subtitle = subtitle;
		this.content = content;
		
	}
	
	// TOSTRING
	// =========================================================================== //
	
	public String toString()
	{
		return post_id + " | " + owning_member_id + " | " + date + " | \n" + subtitle + " | \n" + content;
	}
	
	// END OF TOSTRING
	// =========================================================================== //
	
	
	// GETTERS & SETTERS
	// =========================================================================== //
	/**
	 * @return the post_id
	 */
	protected int getPost_id() {
		return post_id;
	}
	/**
	 * @param post_id the post_id to set
	 */
	protected void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	/**
	 * @return the owning_member_id
	 */
	protected int getOwning_member_id() {
		return owning_member_id;
	}
	/**
	 * @param owning_member_id the owning_member_id to set
	 */
	protected void setOwning_member_id(int owning_member_id) {
		this.owning_member_id = owning_member_id;
	}
	/**
	 * @return the date
	 */
	protected Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	protected void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the subtitle
	 */
	protected String getSubtitle() {
		return subtitle;
	}
	/**
	 * @param subtitle the subtitle to set
	 */
	protected void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	/**
	 * @return the content
	 */
	protected String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	protected void setContent(String content) {
		this.content = content;
	}
	
	// END OF GETTERS AND SETTERS
	// ================================================================= //

}
