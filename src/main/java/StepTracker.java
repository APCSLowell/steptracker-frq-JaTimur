import java.util.ArrayList;
public class StepTracker{
 private int min,days,actives;
 private ArrayList<Integer> steps;
 public StepTracker(int minSteps){
  min=minSteps;
  days=0;
  actives=0;
  steps=new ArrayList<Integer>();
 }
 public void addDailySteps(int daily){
  steps.add(daily);
  days++;
  if(daily>=min) actives++;
 }
 public int activeDays(){
  return actives;
 }
 public double averageSteps(){
  int sum=0;
  for(int n=0;n<steps.size();n++){
   sum+=steps.get(n);
  }
  return (double)sum/days;
 }
} 
