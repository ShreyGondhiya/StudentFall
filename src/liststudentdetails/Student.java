/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liststudentdetails;

/**
 *
 * @author User
 */
public class Student //entity
{
    private String name; //variables must always be defined as private - "encapsulation"
    private int Sid;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the Sid
     */
    public int getSid() {
        return Sid;
    }

    /**
     * @param sid the Sid to set
     */
    public void setSid(int sid) {
        this.Sid = sid;
    }
}
