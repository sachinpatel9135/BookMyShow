package com.example.bookmyshowApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookmyshowApp.beans.Screen;

public interface ScreenRepo extends JpaRepository<Screen, Integer> {

	Screen findByScreenName(String screenName);

}
