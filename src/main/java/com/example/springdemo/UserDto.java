package com.example.springdemo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
//DTO 는 이동할 때 쓰이는 객체 데이터를 쓰기 위해 사용하는 class

//ToString 은 객체의 정보를 출력할 때 사용하는 것!
//lombok을 쓰면 더이상 getter setter 쓸 필요 없다! 이노테이션 두개만 해주면 됨!

public class UserDto {

	private String name;
	private int age;
}
