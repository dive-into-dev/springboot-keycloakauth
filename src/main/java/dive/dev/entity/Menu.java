package dive.dev.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

import java.util.List;

@Entity
public class Menu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    private Long restaurantId;

    private Boolean active;

    @Transient
    private List<MenuItem> menuItems;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<MenuItem> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

}
