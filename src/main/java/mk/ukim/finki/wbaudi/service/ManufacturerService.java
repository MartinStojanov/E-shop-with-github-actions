package mk.ukim.finki.wbaudi.service;

import mk.ukim.finki.wbaudi.model.Manufacturer;

import java.util.List;
import java.util.Optional;

public interface ManufacturerService {

    List<Manufacturer> findAll();
    Optional<Manufacturer> findById(Long id);
    Optional<Manufacturer> save(String name, String address);
    void deleteById(Long id);

}
