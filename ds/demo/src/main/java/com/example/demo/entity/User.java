package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long no;
	
	private String name;
	
	private int age;
	
	
	
	public User() {
    }
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
