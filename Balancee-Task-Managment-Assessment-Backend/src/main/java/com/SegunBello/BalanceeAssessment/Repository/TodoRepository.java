package com.SegunBello.BalanceeAssessment.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SegunBello.BalanceeAssessment.Model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
	Todo findByTitleAndUser(String title, String user_email);

	List<Todo> findByUser(String user_email);
}
