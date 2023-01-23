package mk.ukim.finki.wbaudi.repsitory.jpa;

import mk.ukim.finki.wbaudi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
Optional<Product> findByName(String name);
}
