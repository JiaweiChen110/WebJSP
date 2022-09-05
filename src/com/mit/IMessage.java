package com.mit;

public class IMessage {
	public String key;
	public String message;
	
	public IMessage() {
		
	}
	public IMessage(String k, String m) {
		key = k;
		message = m;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
