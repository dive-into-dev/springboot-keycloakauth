package dive.dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dive.dev.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	List<OrderItem> findByOrderId(Long id);

}
