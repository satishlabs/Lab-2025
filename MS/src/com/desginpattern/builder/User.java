package com.desginpattern.builder;

public class User {
	//Required parameters
	private String name;
	private int age;
	
	//Optional parameters
	private String email;
	private String address;
	
	public User(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.email = builder.email;
		this.address = builder.address;
	}
	
	//Static Builder class
	public static class Builder{
		private String name;
		private int age;
		private String email;
		private String address;
		
		public Builder(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public Builder email(String email) {
			this.email = email;
			return this;
		}
		
		public Builder address(String address) {
			this.address = address;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", email=" + email + ", address=" + address + "]";
	}
	
	
}
