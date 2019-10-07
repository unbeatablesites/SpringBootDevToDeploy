package frank.in.ecomdashboard.repositories;

import frank.in.ecomdashboard.entity.OrderCollectionStatus;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
@Qualifier(value = "orderCollectionStatusRepository")
public interface OrderCollectionStatusRepository extends JpaRepository<OrderCollectionStatus,Long> {
}
