package practice.java;

public class Task {
    private String taskkName;
    private String dueDate;
    private boolean isHabit;
    private boolean isCompleted;

    public Task(String task, String date, boolean habit, boolean completed){
        taskkName = task;
        dueDate = date;
        isHabit = habit;
        isCompleted = completed;
    }
     
    public void markComplete() {
        this.isCompleted = true;
    }
    public void markHabit(){
        this.isHabit = true;
    }
    public void setTaskName(String task){
        this.taskkName = task;
    }
    public void setDate(String date){
        this.dueDate = date;
    }
    public String getDate(){
        return dueDate;
    }
    public String getTaskName(){
        return taskkName;
    }
    public boolean getHabit(){
        return isHabit;
    }
    public boolean getCompleted(){return isCompleted;}
}
