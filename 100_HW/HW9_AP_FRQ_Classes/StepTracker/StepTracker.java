import java.util.*;

public class StepTracker{
    int steps;
    int avgSteps;
    int days;
    public StepTracker(int steps){
        steps = 10000;
        this.steps = steps;
    }
    public void addDailySteps(int steps){
        this.steps = steps + this.steps;
    }
    public int activeDays(){
        days = 0;
        if(steps >= this.steps){
            days = days + 1;
            return days;
         }
        return days;
    }
    public int averageSteps(){
        int b = this.steps/days;
        return b;
    }
}