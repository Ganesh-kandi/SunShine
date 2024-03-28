package com.project.SunShine.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.SunShine.model.Guest;

@Repository
public interface GuestDao extends JpaRepository<Guest, String>{

}
