package com.blog.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

	private Integer categoryId;
	
	@NotBlank
	@Size(min = 4, message = "Minimum size of title should be 4 characters")
	private String categoryTitle;
	
	@NotBlank
	@Size(min = 10, message = "Minimum size of description should be 10 characters")
	private String categoryDescription;
	
}
