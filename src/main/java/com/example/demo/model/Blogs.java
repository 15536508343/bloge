package com.example.demo.model;

public class Blogs {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column blogs.Id
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column blogs.headline
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	private String headline;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column blogs.introduce
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	private String introduce;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column blogs.time
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	private String time;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column blogs.type
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 * 1 博文
	 * 2 学习笔记
	 * 3 日迹
	 * 4 问题分析
	 */
	private Integer type;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column blogs.maintext
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	private String maintext;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column blogs.Id
	 * @return  the value of blogs.Id
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column blogs.Id
	 * @param id  the value for blogs.Id
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column blogs.headline
	 * @return  the value of blogs.headline
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	public String getHeadline() {
		return headline;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column blogs.headline
	 * @param headline  the value for blogs.headline
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	public void setHeadline(String headline) {
		this.headline = headline == null ? null : headline.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column blogs.introduce
	 * @return  the value of blogs.introduce
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	public String getIntroduce() {
		return introduce;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column blogs.introduce
	 * @param introduce  the value for blogs.introduce
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	public void setIntroduce(String introduce) {
		this.introduce = introduce == null ? null : introduce.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column blogs.time
	 * @return  the value of blogs.time
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	public String getTime() {
		return time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column blogs.time
	 * @param time  the value for blogs.time
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	public void setTime(String time) {
		this.time = time == null ? null : time.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column blogs.type
	 * @return  the value of blogs.type
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column blogs.type
	 * @param type  the value for blogs.type
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column blogs.maintext
	 * @return  the value of blogs.maintext
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	public String getMaintext() {
		return maintext;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column blogs.maintext
	 * @param maintext  the value for blogs.maintext
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	public void setMaintext(String maintext) {
		this.maintext = maintext == null ? null : maintext.trim();
	}

  
    
	
}