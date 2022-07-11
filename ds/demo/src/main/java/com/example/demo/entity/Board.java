package com.example.demo.entity;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//해당 클래스에 포함된 멤버 변수의 모든 getter 메소드 생성해주는 롬복의 기
@Getter

//해당 클래스의 기본 생성자를 생성해주는 어노테이션
//access 속성을 이용해서 동일한 패키지 내의 클래스에서 객체 생
@NoArgsConstructor(access = AccessLevel.PROTECTED)

//해당 클래스가 테이블과 매핑되는 JPA 엔티티 클래스
//기본적으로 클래스명(CamelCase)을 테이블명(Snake Case)으로 매핑 
@Entity
public class Board {
	
	//id는해당 멤버가 엔티티의 PK를 의미
	//보통 mysql db는 pk를 bigint타입으로 엔티티에서는 long타입으로 선언
	//generatedValue pk 생성 전략 설정 어노테이션
	//mysql은 자동증가 (auto_increament)를 지원하는 DB이며 pk자동ㅈ으가를 지원하는 DB는 해당 어노테이션을 선언
	//oracle과 같이 시퀀스를 이용하는 DB는 generation.Type.SEQUENCE를 이
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    
    private String content;
    
    private String writer;
    
    private int hits;
    
    private char deleteYn;
    
    private LocalDateTime createDate = LocalDateTime.now();
    
    private LocalDateTime modifieDate;
    
    //롬복에서 제공해주는 빌더 기능 생성자 대신 이용하는 패턴
    @Builder
    public Board(String title, String content, String writer, int hits, char deleteYn) {
    	this.title = title;
    	this.content = content;
    	this.writer = writer;
    	this.hits = hits;
    	this.deleteYn = deleteYn;
    }
}