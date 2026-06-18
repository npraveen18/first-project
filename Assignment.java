public class Assignment {
    String title;
    String dueDate;
    boolean isComplete;

    public Assignment(){
        title = "Untitled";
        dueDate = "None";
        isComplete = false;
    }
    public Assignment(String t){
        title = t;
        dueDate = "None";
        isComplete = false;
    }
    public Assignment(String t, String d){
        title = t;
        dueDate = d;
        isComplete = false;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String str){
        title = str;
    }
    
    public String getDueDate(){
        return dueDate;
    }
    public void setDueDate(String str){
        dueDate = str;
    }

    public boolean isComplete(){
        return isComplete;
    }
    public void setComplete(boolean b){
        isComplete = b;
    }


}
