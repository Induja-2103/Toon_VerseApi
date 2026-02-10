package com.example.CartoonApi;

import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/cartoons")
@CrossOrigin(origins = "*")
public class CartoonController {

    private final CartoonService service;

    public CartoonController(CartoonService service) {
        this.service = service;
    }
    @PostMapping
    public Cartoon add(@RequestBody Cartoon cartoon) {
        return service.add(cartoon);
    }
    @GetMapping
    public List<Cartoon> getAll() {
        return service.getAll();
    }
    @GetMapping("/id/{id}")
    public Cartoon getById(@PathVariable Long id) {
        return service.getById(id);
    }
    @GetMapping("/name/{name}")
    public List<Cartoon> getByName(@PathVariable String name) {
        return service.getByName(name);
    }
    @GetMapping("/dialogue/{dialogue}")
    public List<Cartoon> getByDialogue(@PathVariable String dialogue) {
        return service.getByDialogue(dialogue);
    }
    @GetMapping("/fact/{fact}")
    public List<Cartoon> getByFact(@PathVariable String fact) {
        return service.getByFact(fact);
    }
    @GetMapping("/rating/{rating}")
    public List<Cartoon> getByRating(@PathVariable float rating) {
        return service.getByRating(rating);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
