package dive.dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dive.dev.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	List<Order> findByRestaurantId(Long restaurantId);

}
