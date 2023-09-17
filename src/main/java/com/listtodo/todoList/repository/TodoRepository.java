package com.listtodo.todoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.listtodo.todoList.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
