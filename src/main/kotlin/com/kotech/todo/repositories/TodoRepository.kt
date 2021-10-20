package com.kotech.todo.repositories;

import com.kotech.todo.entities.Todo
import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository : JpaRepository<Todo, Long> {
}
