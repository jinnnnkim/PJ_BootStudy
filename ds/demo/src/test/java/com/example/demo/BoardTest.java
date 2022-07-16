package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Board;
import com.example.demo.entity.BoardRepository;

//스프링 부트 테스트 어노테이
@SpringBootTest
public class BoardTest {

	//스프링 컨테이너에 등록된 BoardRepository 객체를 주
	@Autowired
	BoardRepository boardRepo;
	
	@Test
	void save() {
		Board params = Board.builder()
				.title("1번 게시글")
				.content("1번 게시글 내용")
				.writer("테스트다")
				.hits(0)
				.deleteYn('N')
				.build();
		// 빌더 패턴으로 생성된 객체를 저
		boardRepo.save(params);
	}
	//source tree test
	@Test
	void find() {
		Long id = 1L;
		
		Optional<Board> result = boardRepo.findById(id);
	}
	
	@Test
	void delete() {
		Long id = 1L;
		Optional<Board> result = boardRepo.findById(id);
		boardRepo.delete(result.get());
	}
}
