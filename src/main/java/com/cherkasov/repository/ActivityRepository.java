package com.cherkasov.repository;

import com.cherkasov.entity.Activity;

import java.util.List;

public interface ActivityRepository {

    //add to list Activity
    Activity create();

    Activity get();

    List<Activity> getAll();

    Activity getBy();

    boolean update();

    // remove from Activity list
    boolean delete();

    //start Activity and set in CurrentActivity
    boolean start();

    boolean pause();

    boolean resume();

    //remove from CurrentActivity
    boolean stop();

}
