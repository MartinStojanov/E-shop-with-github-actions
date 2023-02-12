package mk.ukim.finki.fashionstore.repsitory.jpa;

import mk.ukim.finki.fashionstore.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer,Long> {

}
