package com.usermanage.UserManage.properties;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@ConfigurationProperties("app")
@Configuration
public class AppConfig {
	
	private Map<String, String> messages = new HashMap<>();

	public Map<String, String> getMessages() {
		return messages;
	}

	public void setMessages(Map<String, String> messages) {
		this.messages = messages;
	}

	public AppConfig(Map<String, String> messages) {
		super();
		this.messages = messages;
	}
	
	
 
}
