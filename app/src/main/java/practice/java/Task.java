package practice.java;

public class Task {
    private String taskkName;
    private String dueDate;
    private boolean isHabit;
    private boolean isCompleted;

    public Task(String task, String date, boolean habit){
        this.taskkName = task;
        this.dueDate = date;
        this.isHabit = habit;
        this.isCompleted = false;
    }
     
    public void markComplete() {
        this.isCompleted = true;
    }

    // Getters
    public String getDueDate(){return dueDate; }
    public String getTaskName(){return taskkName;}
    public boolean isHabit(){return isHabit;}
    public boolean isCompleted(){ return isCompleted;}
    
    public String toString(){
        if(isCompleted){ 
            return "[x] " + taskkName + "  (Due: " + dueDate + ", " + (isHabit ? "Habit" : "Task") + ")";
        }
        else{
            return "[ ] " + taskkName + " (Due: " + dueDate + ", " + (isHabit ? "Habit" : "Task") + ")";
        }
    }

}
