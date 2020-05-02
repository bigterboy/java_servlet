package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dao.impl.NewDAO;
import com.laptrinhjavaweb.model.NewModel;

import java.util.List;

public interface INewService {
//    NewModel findOne(Long id);
    List<NewModel> findByCategoryId(Long categoryId);
    NewModel save(NewModel newModel);
    NewModel update(NewModel updateNew);
    void delete(long[] ids);
    List<NewModel> findAll(Integer offset, Integer limit);
    int getTotalItem() ;
}
