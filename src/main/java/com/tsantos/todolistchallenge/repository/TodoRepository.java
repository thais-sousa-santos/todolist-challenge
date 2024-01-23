package com.tsantos.todolistchallenge.repository;

import com.tsantos.todolistchallenge.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
