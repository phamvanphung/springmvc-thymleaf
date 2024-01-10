package vn.kienlongbank.spirngmvcthemleaf.repository;

import org.springframework.stereotype.Repository;
import vn.kienlongbank.spirngmvcthemleaf.entity.SeedStarter;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SeedStarterRepository {

    private final List<SeedStarter> seedStarters = new ArrayList<>();


    public SeedStarterRepository() {
        super();
    }



    public List<SeedStarter> findAll() {
        return new ArrayList<SeedStarter>(this.seedStarters);
    }


    public void add(final SeedStarter seedStarter) {
        this.seedStarters.add(seedStarter);
    }
}
