package com.learners007.reservations.repository;

import org.springframework.data.repository.CrudRepository;

import com.learners007.reservations.domain.Room;

public interface RoomRepository extends CrudRepository<Room, Long> {

	Room findByNumber(String number);
}
