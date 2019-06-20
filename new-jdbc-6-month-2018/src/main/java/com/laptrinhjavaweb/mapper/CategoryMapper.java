package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.model.CategoryModel;

public class CategoryMapper implements IRowMapper<CategoryModel> {

	@Override
	public CategoryModel mapRow(ResultSet resultSet) {
		CategoryModel category = new CategoryModel();
		try {
			// lay du lieu ben trong resultset qua ham get kieu du lieu tuong ung, (get theo
			// vi tri collumn), hoac ten cot)
			category.setId(resultSet.getLong("id"));
			category.setCode(resultSet.getString("code"));
			category.setName(resultSet.getString("name"));
		} catch (SQLException e) {
			return null;
		}
		return category;
	}

}
