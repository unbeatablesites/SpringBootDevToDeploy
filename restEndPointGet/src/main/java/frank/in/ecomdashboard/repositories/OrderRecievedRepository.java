package frank.in.ecomdashboard.repositories;


import frank.in.ecomdashboard.entity.OrderRecieved;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier(value = "orderRecievedRepository")
public interface OrderRecievedRepository extends JpaRepository<OrderRecieved,Long> {
}
