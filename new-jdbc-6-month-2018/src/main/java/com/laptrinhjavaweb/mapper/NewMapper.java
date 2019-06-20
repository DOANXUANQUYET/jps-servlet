package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.model.NewModel;

public class NewMapper implements IRowMapper<NewModel> {

	@Override
	public NewModel mapRow(ResultSet resultSet) {
		NewModel news = new NewModel();
		try {
			// lay du lieu ben trong resultset qua ham get kieu du lieu tuong ung, (get theo
			// vi tri collumn), hoac ten cot)
			news.setId(resultSet.getLong("id"));
			news.setTitle(resultSet.getString("title"));
			news.setContent(resultSet.getString("content"));
			news.setCategoryId(resultSet.getLong("categoryId"));
		} catch (SQLException e) {
			return null;
		}
		return news;
	}

}
