package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.dao.INewDAO;
import com.laptrinhjavaweb.dao.impl.NewDAO;
import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.service.INewService;

import javax.inject.Inject;
import java.util.List;

public class NewService implements INewService {

    @Inject
    private INewDAO newDAO;

    @Override
    public List<NewModel> findByCategoryId(Long categoryId) {
        return newDAO.findByCategoryId(categoryId);
    }

    @Override
    public Long save(NewModel newModel) {
        return newDAO.save(newModel);
    }
}
