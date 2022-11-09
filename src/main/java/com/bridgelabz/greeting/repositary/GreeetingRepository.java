package com.bridgelabz.greeting.repositary;

import com.bridgelabz.greeting.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreeetingRepository extends JpaRepository<Greeting,Integer> {
}
