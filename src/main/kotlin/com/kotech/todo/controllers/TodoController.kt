package com.kotech.todo.controllers

import com.kotech.todo.entities.Todo
import com.kotech.todo.repositories.TodoRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/todos")
class TodoController(val todoRepository: TodoRepository) {

    @GetMapping
    @CrossOrigin(origins = [])
    fun getTodos(): MutableList<Todo> = todoRepository.findAll()

    @GetMapping("/{todoId}")
    @CrossOrigin(origins = [])
    fun getTodo(@PathVariable("todoId") todoId:Long):Optional<Todo>{
        return todoRepository.findById(todoId)
    }

    @PostMapping
    @CrossOrigin(origins = [])
    fun newTodo(@RequestBody todo:Todo):Todo{
        return todoRepository.save(todo)
    }

    @PutMapping("/{todoId}")
    @CrossOrigin(origins = [])
    fun updateTodo(@PathVariable("todoId") todoId:Long, @RequestBody updateTodo: Todo): Todo? {
        val todo= todoRepository.findByIdOrNull(todoId)
        if(todo==null){
            return todo
        }
        return  todoRepository.save(updateTodo)
    }

    @DeleteMapping("/{todoId}")
    @CrossOrigin(origins = [])
    fun deleteTodo(@PathVariable("todoId") todoId:Long){
        todoRepository.deleteById(todoId)
    }
}
