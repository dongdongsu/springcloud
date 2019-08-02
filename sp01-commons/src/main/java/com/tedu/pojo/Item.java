package com.tedu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//toString hashcode equals
@NoArgsConstructor
@AllArgsConstructor
public  class Item {

	private Integer id;
	private String name;
	private Integer number;
}
