package practice.java;

import java.util.ArrayList;

public class Tasks {
    ArrayList<Task> tasks = new ArrayList<Task>();

    public Tasks(){}

    public void addTask(Task newTask){
        tasks.add(newTask);
    }

    public void viewTasks(){
        System.out.println(tasks);
    }

}
