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
public class StudentAcc {

   
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo("CITCS", "2nd Term 2018-2019");
        s1.setID("18-1405-501");
        s1.setLastName("Ramos");
        s1.setFirstName("Allen Joshua");
        s1.setProgram("BSCS");
        s1.setTrack("n/a");
        s1.print();
    }
    
}
