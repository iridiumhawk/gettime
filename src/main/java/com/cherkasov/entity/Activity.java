package com.cherkasov.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class Activity {
    private int id;
    private int userId; //User
    private Map<LocalDateTime,LocalDateTime> timeFromBeginToEnd;
    private List<ActivityCategory> categories;
    private String description;
    private String result;
    private ActivityStatus status;
    private boolean deleted;


}
