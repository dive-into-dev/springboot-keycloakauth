package dive.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dive.dev.entity.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{
}
