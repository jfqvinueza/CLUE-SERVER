package pedidos.pedidos.core.authz.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pedidos.pedidos.core.authz.entity.Role;




public interface RoleRepository extends CrudRepository <Role, Long> {

    List<Role> findAll();
    
}
