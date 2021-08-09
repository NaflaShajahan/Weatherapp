package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Favorite;

@Repository
public interface FavoriteRepo extends JpaRepository<Favorite, Integer>{
 public  Favorite findByLocation(String location);
}
