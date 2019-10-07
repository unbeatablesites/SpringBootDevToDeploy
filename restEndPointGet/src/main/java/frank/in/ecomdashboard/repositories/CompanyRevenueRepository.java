package frank.in.ecomdashboard.repositories;

import frank.in.ecomdashboard.entity.CompanyRevenue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "companyRevenueRepository")
public interface CompanyRevenueRepository extends JpaRepository <CompanyRevenue,Long>{
}
