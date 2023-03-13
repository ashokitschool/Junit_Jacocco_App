package in.ashokit.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Serializable> {

	public UserEntity findByUserEmail(String userEmail);
}
