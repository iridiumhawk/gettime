package com.cherkasov.entity;

import java.time.LocalDateTime;
import java.util.List;

public class User {
    private int id;
    private String loginName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private boolean enabled; //one status?
    private boolean deleted;

    private LocalDateTime registeredDate;
    private LocalDateTime deletedDate;
    private String timeZone; //???
    private UserStatus status;
    private Activity currentActivity;
    private List<Activity> listActivity;
    private List<ActivityCategory> activityCategoryList;// linked List?

    public User() {
    }


}

