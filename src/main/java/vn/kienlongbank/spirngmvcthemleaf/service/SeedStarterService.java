package vn.kienlongbank.spirngmvcthemleaf.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.kienlongbank.spirngmvcthemleaf.entity.SeedStarter;
import vn.kienlongbank.spirngmvcthemleaf.repository.SeedStarterRepository;

import java.util.List;

@Service
public class SeedStarterService {

    @Autowired
    private SeedStarterRepository seedstarterRepository;


    public SeedStarterService() {
        super();
    }



    public List<SeedStarter> findAll() {
        return this.seedstarterRepository.findAll();
    }

    public void add(final SeedStarter seedStarter) {
        this.seedstarterRepository.add(seedStarter);
    }
}
