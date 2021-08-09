package com.demo.service;

import java.util.List;

import com.demo.entities.Favorite;
import com.demo.repository.FavoriteRepo;

public interface FavoriteService {
	
	 public List<Favorite> getAllFavorite();
	 public Favorite getFavoriteById(int id);
	 public  Favorite addFavorite(Favorite favorite);
	 public Favorite deleteFavorite(int id);
	 public Favorite getByLocation(String location);
}
