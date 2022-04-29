package com.ysy.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysy.model.TestModel;
import com.ysy.repository.TestRepository;


@Service
public class TestService  {

	@Autowired
	private TestRepository repository;
	
	
	public TestModel save(TestModel demo1) {
		TestModel tt = new TestModel();
//      Timestamp tim = new Timestamp(System.currentTimeMillis());
      Timestamp tim = new Timestamp(1);
      tt.setCol1("1-1");
      tt.setCol2("1-2");
      tt.setCol3("1-3");
      tt.setCol4("1-4");
      tt.setReg_date(tim);
      repository.save(tt);
		return repository.save(demo1);
		
	}
	
	
	public List<TestModel> getDataList() {

		Class clz = repository.getClass();
		System.out.println("class name = "+clz.getName());
		
		// 클래스가 구현하고 있는 인터페이스 목록
        Class[] interfaces = clz.getInterfaces();

        Stream.of(interfaces).forEach(inter -> System.out.println("interface name = "+inter.getName()));
		
     // 클래스의 부모 클래스
        Class superClasses = clz.getSuperclass();
        
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(8);
        List<TestModel> datas = ( List<TestModel>)repository.findAllById(ids);//여어 조건 조회
        
        
        System.out.println("parent class name = "+superClasses.getName());
        TestModel tt = repository.findById(5).orElse(new TestModel());
        System.out.println(repository.findById(5));
		return (List<TestModel>) repository.findAll();
	}
}
