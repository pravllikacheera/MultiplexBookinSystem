package com.MBS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MBS.Model.Hall;

@Repository
public interface HallRepo extends JpaRepository<Hall,Integer>{
	

}
