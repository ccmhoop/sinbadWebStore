package CompanyOrder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CompanyOrderRepository extends JpaRepository<CompanyOrder, Long> {
}
