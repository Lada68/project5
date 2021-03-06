package com.amr.project.converter;

import com.amr.project.model.dto.CategoryMainPageDto;
import com.amr.project.model.entity.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    List<CategoryMainPageDto> categoryListToListCategoryMainPageDTO(List<Category> list);
}