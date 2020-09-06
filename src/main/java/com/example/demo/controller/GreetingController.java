package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.DTO.BlogsDTO;
import com.example.demo.mapper.BlogsMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.Blogs;
import com.example.demo.model.BlogsExample;
import com.example.demo.model.UserExample;

@Controller
public class GreetingController {
 
	UserMapper userMaper;
	
	@Autowired
	BlogsMapper blogsMapper;
	
	 @RequestMapping("/home")
		public String home(Model model) {
			System.out.println("进入home");
			//获取文章信息
			
			List<Blogs> blogsList = blogsMapper.selectByExampleWithBLOBs(new BlogsExample());
			List<BlogsDTO> blogsDto = new ArrayList<BlogsDTO>();
		for (Blogs blogs : blogsList) {
			BlogsDTO bl = new BlogsDTO();
			bl.setHeadline(blogs.getHeadline());
			bl.setId(blogs.getId());
			bl.setIntroduce(blogs.getIntroduce());
			bl.setIntroduce(blogs.getIntroduce());
			bl.setTime(blogs.getTime());
			if(	blogs.getIntroduce().length()>20) {
				blogs.setIntroduce(blogs.getIntroduce().substring(0, 20));
			}
			String maintext = blogs.getMaintext();
			Pattern pattern = Pattern.compile("http://blogsimags.oss-cn-beijing.aliyuncs.com/[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]");
			Matcher matcher = pattern.matcher(maintext);
			    if (matcher.find()){
			        System.out.println(matcher.group());
			        bl.setImgUrl(matcher.group());			    
			        }else {
			        	bl.setImgUrl(null);
			    }
			    blogsDto.add(bl) ;
		}
			model.addAttribute("blogsList", blogsDto);
			return "home";
		}
	 @RequestMapping("/markdown")
		public String markdown() {
			System.out.println("进入markdown");
			return "markdown";
		}
	
	 @RequestMapping("/markdown1")
	 @ResponseBody
		public String markdown1() {
			System.out.println("进入home");
			return "markdown1";
		}
	 @RequestMapping("/detail")
		public String home2() {
			System.out.println("进入home");
			return "detail";
		}
	 @RequestMapping("/question/{id}")
		public String test1(@PathVariable(name = "id")String id, Model model) {
		
			 if("id".equals(id)) {
				 model.addAttribute("section", "question");
				 model.addAttribute("sectionName", "问题1");
			 }
		
			return "profile";
		}

/**
 *  * 1 博文
	 * 2 学习笔记
	 * 3 日迹
	 * 4 问题分析
 * @param model
 * @return
 */
	 @RequestMapping("/home/{typeid}")
		public String home1(Model model,@PathVariable(name = "typeid")Integer typeid) {
			System.out.println("进入home");
			List<Blogs> blogsList  = null;
			if(typeid==0) {
				blogsList = blogsMapper.selectByExampleWithBLOBs(new BlogsExample());
			}else {
				//获取文章信息
				BlogsExample blogsExample = new BlogsExample();
				blogsExample.createCriteria().andTypeEqualTo(typeid);
				blogsList= blogsMapper.selectByExampleWithBLOBs(blogsExample);
			}
			
			List<BlogsDTO> blogsDto = new ArrayList<BlogsDTO>();
		for (Blogs blogs : blogsList) {
			BlogsDTO bl = new BlogsDTO();
			bl.setHeadline(blogs.getHeadline());
			bl.setId(blogs.getId());
			bl.setIntroduce(blogs.getIntroduce());
			bl.setIntroduce(blogs.getIntroduce());
			bl.setTime(blogs.getTime());
			if(	blogs.getIntroduce().length()>20) {
				blogs.setIntroduce(blogs.getIntroduce().substring(0, 20));
			}
			String maintext = blogs.getMaintext();
			Pattern pattern = Pattern.compile("http://blogsimags.oss-cn-beijing.aliyuncs.com/[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]");
			Matcher matcher = pattern.matcher(maintext);
			    if (matcher.find()){
			        System.out.println(matcher.group());
			        bl.setImgUrl(matcher.group());			    
			        }else {
			        	bl.setImgUrl(null);
			    }
			    blogsDto.add(bl) ;
		}
			model.addAttribute("blogsList", blogsDto);
			return "home";
		}
}
