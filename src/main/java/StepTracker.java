import java.util.ArrayList;
public class StepTracker{
 private int min,steps,days,actives;
 public StepTracker(int minSteps){
  min=minSteps;
  steps=0;
  days=0;
  actives=0;
 }
 public void addDailySteps(int daily){
  steps+=daily;
  days++;
  if(daily>=min) actives++;
 }
 public int activeDays(){
  return actives;
 }
 public double averageSteps(){
  if(days==0) return 0.0;
  else return (double)steps/days;
 }
} 
