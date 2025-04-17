package com.codeb.mis_invoice_generation_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeb.mis_invoice_generation_system.entity.Groups;

public interface GroupRepository extends JpaRepository<Groups, Integer> {

}
