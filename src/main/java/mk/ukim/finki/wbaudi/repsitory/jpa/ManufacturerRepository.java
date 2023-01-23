package mk.ukim.finki.wbaudi.repsitory.jpa;

import mk.ukim.finki.wbaudi.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer,Long> {

}
