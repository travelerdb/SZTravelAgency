package com.utils;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class Photo {
	public String upload(MultipartFile[] photos,HttpServletRequest request) throws IOException{
		String photoName="";
		for(MultipartFile p : photos){
			//获取图片的原名
			String originalFilename = p.getOriginalFilename();
			// 判断是否有文件
			if(null!=originalFilename){
				// 1.保存路径
				//String realPath = request.getServletContext().getRealPath("/img");
				String realPath = this.getClass().getClassLoader().getResource("img").toString();
				realPath=realPath.substring(6);
				// 2.重命名
				String newFileName=UUID.randomUUID()+""+originalFilename.substring(originalFilename.indexOf("."));
				String savePath=realPath+"/"+newFileName;
				// 3.另存为
				p.transferTo(new File(savePath));
				
				photoName+=newFileName+";";
			}
		}
		photoName=photoName.substring(0, photoName.length()-1);
		return photoName;
	}
}
