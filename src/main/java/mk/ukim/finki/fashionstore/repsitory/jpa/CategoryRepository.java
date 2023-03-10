package mk.ukim.finki.fashionstore.repsitory.jpa;

import mk.ukim.finki.fashionstore.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
   void deleteByName(String name);
   List<Category> findAllByNameLike(String text);
}
