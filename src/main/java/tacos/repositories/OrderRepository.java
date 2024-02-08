package tacos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tacos.models.TacoOrder;
@Repository
public interface OrderRepository extends JpaRepository<TacoOrder, Long> {
}
