import java.util.*;
public class RandomStringChooser
{
private ArrayList<String> arr;
public RandomStringChooser(String[] myArr){
  arr = new ArrayList<String>();
  for(String a : myArr)
    arr.add(a);
}
public String getNext(){
  if(arr.size() == 0)
    return "NONE";
  int i = (int)(Math.random() * arr.size());
  return arr.remove(i);
}
}
