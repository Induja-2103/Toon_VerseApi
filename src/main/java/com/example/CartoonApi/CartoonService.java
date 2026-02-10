package com.example.CartoonApi;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CartoonService {

    private final CartoonRepository repo;
    public Cartoon add(Cartoon cartoon) {
        return repo.save(cartoon);
    }
    public List<Cartoon> getAll() {
        return repo.findAll();
    }
    public CartoonService(CartoonRepository repo) {
        this.repo = repo;
    }

    public Cartoon getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public List<Cartoon> getByName(String name) {
        return repo.findByName(name);
    }

    public List<Cartoon> getByDialogue(String dialogue) {
        return repo.findByDialogue(dialogue);
    }

    public List<Cartoon> getByFact(String fact) {
        return repo.findByFact(fact);
    }

    public List<Cartoon> getByRating(float rating) {
        return repo.findByRating(rating);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
