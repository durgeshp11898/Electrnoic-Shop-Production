package com.mc.electronic.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mc.electronic.store.entities.Role;

public interface RoleRepository extends JpaRepository<Role,String> {
}
