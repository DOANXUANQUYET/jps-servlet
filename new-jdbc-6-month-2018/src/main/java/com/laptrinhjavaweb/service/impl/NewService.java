package com.laptrinhjavaweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.INewDao;
import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.service.INewService;

public class NewService implements INewService {

	@Inject
	private INewDao newDao;

	@Override
	public List<NewModel> findByCategoryId(Long categoryId) {
		return newDao.findByCategoryId(categoryId);
	}

	@Override
	public NewModel save(NewModel newModel) {
		Long newId = newDao.save(newModel);
		System.out.println(newId);
		return newDao.findOne(newId);
	}

	@Override
	public NewModel update(NewModel updateNew) {
		//lay them du lieu ma client k gui du, vi client se k gui toan bo du lieu ve
		NewModel oldNew = newDao.findOne(updateNew.getId());
		updateNew.setCreateDate(oldNew.getCreateDate());
		updateNew.setCreatedBy(oldNew.getCreatedBy());
		newDao.update(updateNew);
		
		return newDao.findOne(updateNew.getId());
	}

}
