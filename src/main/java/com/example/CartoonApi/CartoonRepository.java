package com.example.CartoonApi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartoonRepository extends JpaRepository<Cartoon, Long> {

    List<Cartoon> findByName(String name);

    List<Cartoon> findByDialogue(String dialogue);

    List<Cartoon> findByFact(String fact);

    List<Cartoon> findByRating(float rating);
}
