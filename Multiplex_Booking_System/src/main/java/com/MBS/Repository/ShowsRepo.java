package com.MBS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MBS.Model.Shows;

@Repository
public interface ShowsRepo extends JpaRepository<Shows,Integer>{



}
