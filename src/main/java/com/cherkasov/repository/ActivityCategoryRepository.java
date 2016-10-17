package com.cherkasov.repository;

import com.cherkasov.entity.ActivityCategory;

import java.util.List;

public interface ActivityCategoryRepository {

    //add to list ActivityCategory
    ActivityCategory create();

    ActivityCategory get();

    List<ActivityCategory> getAll();

    ActivityCategory getBy();

    boolean update();

    // remove from ActivityCategory list
    boolean delete();
}
