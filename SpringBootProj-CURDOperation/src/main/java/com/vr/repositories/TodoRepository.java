package com.vr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vr.models.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

}
