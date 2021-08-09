package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Favorite;
import com.demo.repository.FavoriteRepo;
import com.demo.service.exception.*;

@Service
public class FavoriteServiceImpl implements FavoriteService{

	
	private FavoriteRepo favoriteRepo;
	
	
	@Autowired
	public FavoriteServiceImpl(FavoriteRepo favoriteRepo) {
		super();
		this.favoriteRepo = favoriteRepo;
	}

	@Override
	public List<Favorite> getAllFavorite() {
		
		return favoriteRepo.findAll();
	}

	@Override
	public Favorite addFavorite(Favorite favorite) {
		favoriteRepo.save(favorite);
		return favorite;
	}

	@Override
	public Favorite deleteFavorite(int id) {
		Favorite favoriteToDelete=getFavoriteById(id);
		favoriteRepo.delete(favoriteToDelete);
		return favoriteToDelete;
	}

	@Override
	public Favorite getFavoriteById(int id) {
		return favoriteRepo.findById(id).orElseThrow(FavoriteNotFoundException:: new);
	}

	@Override
	public Favorite getByLocation(String location) {
		return favoriteRepo.findByLocation(location);
	}

	

}
