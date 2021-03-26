package com.manish.learning.learningspring.data.repository;

import com.manish.learning.learningspring.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;

public interface GuestRepository extends CrudRepository<Guest, Long> {
}
