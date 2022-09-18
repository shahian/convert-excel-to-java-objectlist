package com.shahian.convertexceltojavaobjectlist.repository;

import com.shahian.convertexceltojavaobjectlist.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {

    List<Group> findAll();
    Optional<Group> findById(Long aLong);
    Optional<Group> findByTitle (String title);
}
