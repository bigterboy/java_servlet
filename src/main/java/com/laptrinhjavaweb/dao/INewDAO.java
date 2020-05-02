package com.laptrinhjavaweb.dao;

import com.laptrinhjavaweb.dao.impl.NewDAO;
import com.laptrinhjavaweb.model.NewModel;

import java.util.List;

public interface INewDAO{
//public interface INewDAO extends GenericDAO<NewModel>{
    List<NewModel> findByCategoryId(Long categoryId);
    Long save(NewModel newModel);
    NewModel findOne(Long id);
    void update(NewModel updateNew);
    void delete(long id);
    List<NewModel> findAll(Integer offset, Integer limit);
    int getTotalItem();
}
