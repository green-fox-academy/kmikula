package com.greenfoxacademy.p2papp.repositories;

import com.greenfoxacademy.p2papp.models.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users,Long> {

    Users findUsersById(Long id);
}
