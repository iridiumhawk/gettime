package com.cherkasov.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class Activity extends BaseEntity{
//    private int id;
    private Long userId; //User
    private Map<LocalDateTime,LocalDateTime> timeFromBeginToEnd;
    private List<ActivityCategory> categories;
    private String description;
    private String result;
    private ActivityStatus status;
    private boolean deleted;


}
