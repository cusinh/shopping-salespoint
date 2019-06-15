package vn.com.itzenk.shopping.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.com.itzenk.shopping.entity.ContactEntity;

@Repository
public interface ContactRepository extends CrudRepository<ContactEntity, Long>{

}
