package com.revature.dao;

import java.sql.SQLException;

public interface SuperHeroDAO {
	public void createSuperHero(String heroName) throws SQLException;
}
