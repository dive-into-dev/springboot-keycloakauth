package dive.dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dive.dev.entity.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long>{

	List<MenuItem> findAllByMenuId(Long id);

}
