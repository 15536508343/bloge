package com.example.demo.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.ObjectMetadata;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.PutObjectResult;
import com.example.demo.DTO.FileDTO;
import com.example.demo.mapper.BlogsMapper;
import com.example.demo.model.Blogs;

@Controller
public class BlogsController {
	
	@Autowired
	BlogsMapper blogsMapper;
	
	@RequestMapping("/saveMarkdown")
	public String saveMarkdown(@RequestParam("headline") String headline,@RequestParam("introduce")String introduce,
			@RequestParam("maintext")String maintext){
		Blogs blogs = new Blogs();
		blogs.setHeadline(headline);
		blogs.setIntroduce(introduce);
		blogs.setMaintext(maintext);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String format = sdf.format(new Date());
		blogs.setTime(format);
		blogsMapper.insert(blogs);
		return "redirect:/home";
	}
	@RequestMapping("/pasge/{id}")
	public String getMarkdown(@PathVariable(name = "id")Integer id, RedirectAttributes attr){
		System.out.println(id);
		Blogs blogs = blogsMapper.selectByPrimaryKey(id);
		attr.addFlashAttribute("blogs", blogs);
		System.out.println(blogs.getHeadline());
		return "redirect:/detail";
	}
	
	
	@RequestMapping("/uploadimage")
	@ResponseBody
	public FileDTO uploadimage( @RequestParam(value = "editormd-image-file", required = false) MultipartFile file) throws IOException {
		String fileName = file.getName();
		String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
        String newFileName = new Date().getTime() + "." + suffix;
		String endpoint = "http://oss-cn-beijing.aliyuncs.com";
		// 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
		String accessKeyId = "LTAI4Fc4aCcdtua4GcFHvcex";
		String accessKeySecret = "HmcA83ISWSGRPTKlRjEtQ1JTO9Emn5";

		// 创建OSSClient实例。
		OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);


		
		// <yourObjectName>表示上传文件到OSS时需要指定包含文件后缀在内的完整路径，例如abc/efg/123.jpg。
		PutObjectRequest putObjectRequest = new PutObjectRequest("blogsimags", newFileName,file.getInputStream());

		// 如果需要上传时设置存储类型与访问权限，请参考以下示例代码。
		// metadata.setHeader(OSSHeaders.OSS_STORAGE_CLASS, StorageClass.Standard.toString());
		// metadata.setObjectAcl(CannedAccessControlList.Private);
		// putObjectRequest.setMetadata(metadata);

		// 上传字符串。
		ossClient.putObject(putObjectRequest);
		
		URL generatePresignedUrl = ossClient.generatePresignedUrl("blogsimags", newFileName, new Date(1616276329000l));
		System.out.println(generatePresignedUrl.toString());
		
		FileDTO fileDTO = new FileDTO();
		fileDTO.setSuccess(1);
		fileDTO.setUrl(generatePresignedUrl.toString());
		// 关闭OSSClient。
		ossClient.shutdown();                   
		return fileDTO;
	}
}
