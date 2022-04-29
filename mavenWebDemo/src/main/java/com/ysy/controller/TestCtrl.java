package com.ysy.controller;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ysy.model.TestModel;
import com.ysy.service.TestService;

/**
 * @RestController : @Controller에 @ResponseBody가 결합된 어노테이션
 * 컨트롤러 클래스 하위 메서드에 @ResponseBody 어노테이션을 붙이지 않아도
 * 문자열과 JSON 등을 전송할 수 있다.
 * */
@RestController
@RequestMapping("/testCtrl")
@CrossOrigin
public class TestCtrl {
	
	/**
	 * @Autowired를 설정한 메서드가 자동으로 호출되고, 인스턴스가 자동으로 주입된다.
	 * 즉, 해당 변수 및 메서드에 스프링이 관리하는 Bean을 자동으로 매핑해주는 개념
	 * */
	@Autowired
	private TestService service;
	
	@PostMapping("/save")
	public String save(@RequestBody TestModel model) {
		System.out.println("1231455");
		TestModel t = service.save(model);
		return "save demo1";
	}
	@GetMapping("/getDataList")
	public List<TestModel> getDataList(){
		List<TestModel> tmpList =service.getDataList();
		return tmpList;
	}
	@GetMapping("/getDataList2")
	public List<TestModel> getDataList2(@RequestParam(value = "msg")String msg){
		System.out.println("client msg = " + msg);
		List<TestModel> tmpList =service.getDataList();
		return tmpList;
	}
	@GetMapping("/getDataList3")
	public List<TestModel> getDataList3(@RequestParam(value = "array")List<String> array){
		array.stream().forEach(x->{
			System.out.println("client array = " + x);
		});
		
		IntStream.range(0, array.size())
		         .forEach(index -> System.out.println("Value at Index : " + (index + 1) + " is " + array.get(index)));

		
		List<TestModel> tmpList =service.getDataList();
		return tmpList;
	}
	@GetMapping("/vueCon")
	public String vueCon(){
		
		return "serve data!!";
	}
}
