/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentacc;

/**
 *
 * @author m304user
 */
public class StudentInfo {
    String university;
    String college;
    String term;
    
    
    private String idnumber;
    private String famname;
    private String firstname;
    private String acaprog;
    private String acatrack;
    
    //<access modifier><class name>(<argument>) { }
    StudentInfo(String college, String term){
        this.university = "University of the Cordilleras";
        this.college = college;
        this.term = term;
    }
     public void setID(String id){
         idnumber = id;
     }
     public String getID(){
         return idnumber;
     }
     public void setLastName(String ln){
         famname = ln;
     }
     public String getLastName(){
         return famname;
     }
     public void setFirstName(String fn){
         firstname = fn;
     }
     public String getFirstName(){
         return firstname;
     }
     public void setProgram(String prog){
         acaprog = prog;
     }
     public String getProgram(){
         return acaprog;
     }
     public void setTrack(String track){
         acatrack = track;
     }
     public String getTrack(){
         return acatrack;
     }
     public void print(){
         System.out.println("===============================");
         System.out.println(university);
         System.out.println("\t"+college);
         System.out.println("\t"+term);
         System.out.println();
         System.out.println("Student Info:");
         System.out.println();
         System.out.println("ID Number: " + getID());
         System.out.println("Name: " + getLastName() + ", " + getFirstName());
         System.out.println("Academic Program: " + getProgram() + " - " + getTrack());
     }
}
