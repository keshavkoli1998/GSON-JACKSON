package com.jsontojavaobject.jackson;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SchoolAddress {

	private String street;
	private String city;
	private String state;
	private Integer pincode;
	
}
