package dive.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dive.dev.entity.Order;
import dive.dev.entity.OrderItem;
import dive.dev.repository.OrderItemRepository;
import dive.dev.repository.OrderRepository;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	OrderItemRepository orderItemRepository;
	
	@GetMapping
	@RequestMapping("/{restaurantId}/list")
	// manager can access (suresh)
	public List<Order> getOrders(@PathVariable Long restaurantId) {
		return orderRepository.findByRestaurantId(restaurantId);
    }
	
	@GetMapping
	@RequestMapping("/{orderId}")
	// manager can access (suresh)
	public Order getOrderDetails(@PathVariable Long orderId) {
		Order order = orderRepository.findById(orderId).get();
        order.setOrderItems(orderItemRepository.findByOrderId(order.getId()));
        return order;
    }
	
	@PostMapping
	// authenticated users can access
	public Order createOrder(Order order) {
		orderRepository.save(order);
        List<OrderItem> orderItems = order.getOrderItems();
        orderItems.forEach(orderItem -> {
            orderItem.setOrderId(order.id);
            orderItemRepository.save(orderItem);
        });
        return order;
    }

}
