package com.lti.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lti.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	public List<User> findByAge(int age);
	@Query("select u from User u where u.userName=:name")
	public List<User> findByName(@Param ("name") String name);

	@Transactional
	@Modifying
	@Query("update User u set u.userName =:name")
	public void changeToUserName(@Param("name") String name) ;
		

}
