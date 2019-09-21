package com.hyeon.makingtripback.repositories;

import com.hyeon.makingtripback.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
