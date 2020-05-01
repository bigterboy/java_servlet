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

//    @Override
//    public NewModel findOne(Long id) {
//
//        return null;
//    }

    @Override
    public List<NewModel> findByCategoryId(Long categoryId) {
        return newDAO.findByCategoryId(categoryId);
    }

    @Override
    public NewModel save(NewModel newModel) {
        Long newId = newDAO.save(newModel);

        return newDAO.findOne(newId);

        //return newDAO.save(newModel);

    }

    @Override
    public NewModel update(NewModel updateNew) {

        NewModel oldNew = newDAO.findOne(updateNew.getId());
        updateNew.setCreatedDate(oldNew.getCreatedDate()) ;
        updateNew.setCreatedBy(oldNew.getCreatedBy());

        newDAO.update(updateNew);

        return newDAO.findOne(updateNew.getId());
    }

    @Override
    public void delete(long[] ids) {
        for(long id : ids ){
            newDAO.delete(id) ;
        }
    }
}
