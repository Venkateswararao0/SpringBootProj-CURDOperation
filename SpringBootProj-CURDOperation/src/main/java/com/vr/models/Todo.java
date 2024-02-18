package com.vr.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="TODOLIST")
@Data
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private String todo;
    private String status;
    private String priority;

    // Constructors, getters, and setters
    public Todo(Integer id, String todo, String status, String priority) {
		super();
		this.id = id;
		this.todo = todo;
		this.status = status;
		this.priority = priority;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}
    

	@Override
	public String toString() {
		return "Todo [id=" + id + ", todo=" + todo + ", status=" + status + ", priority=" + priority + "]";
	}
    
}