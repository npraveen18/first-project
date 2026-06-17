import java.util.ArrayList;
public class ClassRoom {
    String nameOfClass;
    int classNum;
    ArrayList<String> assignments;

    
    public ClassRoom(){
        classNum = 0;
        nameOfClass = "Untitled";
        assignments = new ArrayList<String>();
    }
    public ClassRoom(String name, int num){
        classNum = num;
        nameOfClass = name;
        assignments = new ArrayList<String>();
    }
    

    public String getName(){
        return nameOfClass;
    }
    public void setName(String newName){
        nameOfClass = newName;
    }


    public ArrayList<String> getAssignments(){
        return assignments;
    }
    public ArrayList<String> addAssignment(String str){
        assignments.add(str);
        return assignments;
    }
    public String removeAssignment(){
        //I am going to change this to where you can put in any
        //index to delete an assignment, for now though for 
        //simplicity I will just keep it as it is now
        String output = assignments.remove(0);
        return output;
    }

    public int getClassNum(){
        return classNum;
    }
    public void setClassNum(int n){
        classNum = n;
    }


}