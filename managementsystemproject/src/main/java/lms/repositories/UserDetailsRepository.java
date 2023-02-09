package lms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import lms.entities.UserDetails;

/**
 * this interface will be used to connect {@link UserDetails} from database
 * @author ashutosh.baranwal
 *
 */

@EnableJpaRepositories
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
	
	
	
}
