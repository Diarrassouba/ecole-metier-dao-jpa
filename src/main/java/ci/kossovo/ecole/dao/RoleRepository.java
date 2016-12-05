package ci.kossovo.ecole.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.kossovo.ecole.entity.Role;
import java.lang.String;
import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {
	List<Role> findByRoleName(String rolename);

}
