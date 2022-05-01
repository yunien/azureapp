package nick.example.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import nick.example.demo.model.Todo;


public interface ITodoService {
	public Todo createTodo(Todo todo);
	public List<Todo> findAll();
	public Todo findTodoById(Long todoId);
	public Todo updateTodo(Long todoId, Todo todo);
	public ResponseEntity<?> deleteTodo(Long todoId);
	public List<Todo> findByTitle(String title);
	public List<Todo> fetchTodos(String title);
}
