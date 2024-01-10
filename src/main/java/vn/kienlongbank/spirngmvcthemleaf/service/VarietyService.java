package vn.kienlongbank.spirngmvcthemleaf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.kienlongbank.spirngmvcthemleaf.entity.Variety;
import vn.kienlongbank.spirngmvcthemleaf.repository.VarietyRepository;

import java.util.List;

@Service
public class VarietyService {

    @Autowired
    private VarietyRepository varietyRepository;

    public VarietyService (){
        super();
    }

    public List<Variety> findAll() {
        return this.varietyRepository.findAll();
    }

    public Variety findById(final Integer id) {
        return this.varietyRepository.findById(id);
    }

}
