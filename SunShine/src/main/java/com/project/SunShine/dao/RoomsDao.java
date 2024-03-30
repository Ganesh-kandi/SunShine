package com.project.SunShine.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.SunShine.model.Rooms;

@Repository
public interface RoomsDao extends JpaRepository<Rooms, Integer>{

}
