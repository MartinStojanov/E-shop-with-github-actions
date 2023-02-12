package mk.ukim.finki.fashionstore.service.impl;

import mk.ukim.finki.fashionstore.repsitory.jpa.ManufacturerRepository;
import mk.ukim.finki.fashionstore.model.Manufacturer;
import mk.ukim.finki.fashionstore.service.ManufacturerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManufactuerServiceImpl implements ManufacturerService {

    private final ManufacturerRepository manufacturerRepository;

    public ManufactuerServiceImpl(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }

    @Override
    public List<Manufacturer> findAll() {
        return this.manufacturerRepository.findAll();
    }

    @Override
    public Optional<Manufacturer> findById(Long id) {
        return this.manufacturerRepository.findById(id);
    }
    @Override
    public Optional<Manufacturer> save(String name, String address) {
        return Optional.of( this.manufacturerRepository.save(new Manufacturer(name, address)));
    }

    @Override
    public void deleteById(Long id) {
         this.manufacturerRepository.deleteById(id);
    }

}
