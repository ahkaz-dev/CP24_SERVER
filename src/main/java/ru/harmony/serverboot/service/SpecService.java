package ru.harmony.serverboot.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.harmony.serverboot.entity.Spec;
import ru.harmony.serverboot.repo.SpecRepo;

import java.util.List;

@Service
@AllArgsConstructor
public class SpecService {
    private final SpecRepo repo;

    public List<Spec> getAll() {
        return repo.findAll();
    }

    // place for findById

    public Spec save(Spec data) {
        return repo.save(data);
    }

    public void update(Spec data) {
        repo.save(data);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}