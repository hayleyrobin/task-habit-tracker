package practice.java;

public class Task {
    private String taskName;
    private String dueDate;
    private boolean isHabit;
    private boolean isCompleted;

    public Task(String task, String date, boolean habit){
        this.taskName = task;
        this.dueDate = date;
        this.isHabit = habit;
        this.isCompleted = false;
    }

    public Task(String name, String dueDate, boolean isHabit, boolean isComplete) {
        this.taskName = name;
        this.dueDate = dueDate;
        this.isHabit = isHabit;
        this.isCompleted = isComplete;
    }    
     
    public void markComplete() {
        this.isCompleted = true;
    }

    // Getters
    public String getDueDate(){return dueDate; }
    public String getTaskName(){return taskName;}
    public boolean isHabit(){return isHabit;}
    public boolean isCompleted(){ return isCompleted;}
    
    public String toString(){
        if(isCompleted){ 
            return "[x] " + taskName + "  (Due: " + dueDate + ", " + (isHabit ? "Habit" : "Task") + ")";
        }
        else{
            return "[ ] " + taskName + " (Due: " + dueDate + ", " + (isHabit ? "Habit" : "Task") + ")";
        }
    }

}
