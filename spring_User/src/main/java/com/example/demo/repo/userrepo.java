package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.user;

public interface userrepo extends JpaRepository<user,Long> {

}
