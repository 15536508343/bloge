package com.example.demo.model;

public class User {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column admin.admin_name
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	private String adminName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column admin.headline
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	private String headline;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column admin.slogan
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	private String slogan;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column admin.admin_name
	 * @return  the value of admin.admin_name
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	public String getAdminName() {
		return adminName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column admin.admin_name
	 * @param adminName  the value for admin.admin_name
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	public void setAdminName(String adminName) {
		this.adminName = adminName == null ? null : adminName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column admin.headline
	 * @return  the value of admin.headline
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	public String getHeadline() {
		return headline;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column admin.headline
	 * @param headline  the value for admin.headline
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	public void setHeadline(String headline) {
		this.headline = headline == null ? null : headline.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column admin.slogan
	 * @return  the value of admin.slogan
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	public String getSlogan() {
		return slogan;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column admin.slogan
	 * @param slogan  the value for admin.slogan
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	public void setSlogan(String slogan) {
		this.slogan = slogan == null ? null : slogan.trim();
	}
}