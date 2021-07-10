package cyx.springframework.sfgpetclinic.repositories;

import cyx.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long>{

    Owner findByLastName(String lastName);
}
