package com.ysy.model;

import java.sql.Timestamp;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString // toString() 자동 생성!
@NoArgsConstructor // 디폴트 생성자 넣어 줌!
@Entity
@Embeddable 
@Table(name="Semes_demo_mst1")
public class TestModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int idx;
	

	private String col1;
	private String col2;
	private String col3;
	private String col4;
	
	// 엔티티가 생성되는 시점의 날짜 데이터를 기록하는 설정
	@CreationTimestamp
	private Timestamp reg_date;
	// 엔티티가 업데이트되는 시점의 날짜 데이터를 기록하는 설정
	@UpdateTimestamp
	private Timestamp mod_date;
	
	
}
