package pkg2.univ1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnivRepo extends JpaRepository<UnivEntity, Integer> {
	
}
