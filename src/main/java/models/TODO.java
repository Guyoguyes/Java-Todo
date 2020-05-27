package models;

import java.util.ArrayList;

public class TODO {

    private String task;
    private String description;
    private String completeDate ;
    private  static ArrayList<Object> mInstances = new ArrayList<>();

    public TODO(String task, String description, String completeDate){
        this.task = task;
        this.description = description;
        this.completeDate = completeDate;
        mInstances.add(this);
    }

    public static ArrayList<Object> getAll(){
        return  mInstances;
    }

    public static void clearAllTODO(){
        mInstances.clear();
    }
}
