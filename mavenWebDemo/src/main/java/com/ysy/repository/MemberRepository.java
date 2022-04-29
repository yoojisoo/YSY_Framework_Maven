package com.ysy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ysy.model.Member;


public interface MemberRepository extends JpaRepository<Member, Integer> {

	  Optional<Member> findByAccount(String account);
}
