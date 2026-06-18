import java.util.ArrayList;
public class ClassRoom {
    String nameOfClass;
    int classNum;
    ArrayList<Assignment> assignments;

    
    public ClassRoom(){
        classNum = 0;
        nameOfClass = "Untitled";
        assignments = new ArrayList<Assignment>();
    }
    public ClassRoom(String name, int num){
        classNum = num;
        nameOfClass = name;
        assignments = new ArrayList<Assignment>();
    }
    

    public String getName(){
        return nameOfClass;
    }
    public void setName(String newName){
        nameOfClass = newName;
    }


    public ArrayList<Assignment> getAssignments(){
        return assignments;
    }
    public ArrayList<Assignment> addAssignment(Assignment str){
        assignments.add(str);
        return assignments;
    }
    public Assignment removeAssignment(){
        //I am going to change this to where you can put in any
        //index to delete an assignment, for now though for 
        //simplicity I will just keep it as it is now
        Assignment output = assignments.remove(0);
        return output;
    }

    public int getClassNum(){
        return classNum;
    }
    public void setClassNum(int n){
        classNum = n;
    }


}