package com.vr.services;

import java.util.List;

import org.hibernate.ResourceClosedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vr.models.Todo;
import com.vr.repositories.TodoRepository;

@Service
public class TodoJpaService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo getTodoById(Integer id) {
        return todoRepository.findById(id).orElseThrow(()->new ResourceClosedException("Todo class id value is not found:"+id));
    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo updateTodoStatus(Integer id, String status) {
        Todo todo = getTodoById(id);
        todo.setStatus(status);
        return todoRepository.save(todo);
    }

    public void deleteTodo(Integer id) {
        Todo todo = getTodoById(id);
        todoRepository.delete(todo);
    }
}