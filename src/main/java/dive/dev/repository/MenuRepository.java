package dive.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dive.dev.entity.Menu;

public interface MenuRepository  extends JpaRepository<Menu, Long>{

	Menu findByRestaurantId(Long restaurantId);
}
