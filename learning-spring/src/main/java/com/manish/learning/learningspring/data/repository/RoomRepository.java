package com.manish.learning.learningspring.data.repository;

import com.manish.learning.learningspring.data.entity.Room;
import org.springframework.data.repository.CrudRepository;

//Crud repository is the base repository and is actually a marker interface. Allows operations like
//findOne and gets
public interface RoomRepository extends CrudRepository<Room, Long>  {

}
