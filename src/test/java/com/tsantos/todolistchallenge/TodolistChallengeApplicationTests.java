package com.tsantos.todolistchallenge;

import com.tsantos.todolistchallenge.entity.Todo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TodolistChallengeApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	@DisplayName("Should create a todo with success")
	void testCreateTodoSuccess() {
		var todo = new Todo("Estudar BackEnd",
				"Ver vídeo sobre pattern X",
				false,
				1
		);

		webTestClient
				.post()
				.uri("/todos")
				.bodyValue(todo)
				.exchange()
				.expectStatus().isOk()
				.expectBody()
				.jsonPath("$").isArray()
				.jsonPath("$.length()").isEqualTo(1)
				.jsonPath("$[0].nome").isEqualTo(todo.getNome())
				.jsonPath("$[0].descricao").isEqualTo(todo.getDescricao())
				.jsonPath("$[0].realizado").isEqualTo(todo.isRealizado())
				.jsonPath("$[0].prioridade").isEqualTo(todo.getPrioridade());

	}

	@Test
	@DisplayName("Failed to create a todo")
	void testCreateTodoFailure() {
		webTestClient
				.post()
				.uri("/todos")
				.bodyValue(
						new Todo("",
								"",
								false,
								0)
				)
				.exchange()
				.expectStatus().isBadRequest();
	}

}
