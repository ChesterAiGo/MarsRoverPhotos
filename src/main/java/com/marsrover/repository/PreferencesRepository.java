package com.marsrover.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marsrover.dto.HomeDto;

public interface PreferencesRepository extends JpaRepository<HomeDto, Long> {

//  @Query("select dto from HomeDto dto where userId = :userId")
//  @Query(value="select * from mars_api_preferences where user_id = :userId", nativeQuery=true)
  HomeDto findByUserId(Long userId);

}
