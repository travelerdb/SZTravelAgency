package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

// 将类作为springboot的应用程序
@SpringBootApplication
public class SpringbootStart {

	public static void main(String[] args) throws Exception {
		System.out.println("项目启动项");
		SpringApplication.run(SpringbootStart.class, args);
	}

	/**
	 *
	 * @Title: serverEndpointExporter
	 * @Description: 检测服务类实现
	 * @return ServerEndpointExporter
	 * @throws
	 */
	@Bean
	public ServerEndpointExporter serverEndpointExporter (){
		return new ServerEndpointExporter();
	}

}
