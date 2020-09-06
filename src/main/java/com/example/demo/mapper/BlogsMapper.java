package com.example.demo.mapper;

import com.example.demo.model.Blogs;
import com.example.demo.model.BlogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blogs
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	long countByExample(BlogsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blogs
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	int deleteByExample(BlogsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blogs
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blogs
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	int insert(Blogs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blogs
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	int insertSelective(Blogs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blogs
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	List<Blogs> selectByExampleWithBLOBs(BlogsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blogs
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	List<Blogs> selectByExample(BlogsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blogs
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	Blogs selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blogs
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	int updateByExampleSelective(@Param("record") Blogs record, @Param("example") BlogsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blogs
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	int updateByExampleWithBLOBs(@Param("record") Blogs record, @Param("example") BlogsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blogs
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	int updateByExample(@Param("record") Blogs record, @Param("example") BlogsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blogs
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	int updateByPrimaryKeySelective(Blogs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blogs
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	int updateByPrimaryKeyWithBLOBs(Blogs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blogs
	 * @mbg.generated  Thu Jun 25 12:23:51 CST 2020
	 */
	int updateByPrimaryKey(Blogs record);
}