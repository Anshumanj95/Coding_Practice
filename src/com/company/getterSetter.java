package com.company;
class MITSStu{
    private int enrollnment;
    private String name;
    public void setEnrollnment(int n){
        enrollnment=n;
    }
    public int getEnrollnment(){
        return enrollnment;
    }
    public void setName(String n){
        name =n;
    }
    public String getName(){
        return name;
    }

}
public class getterSetter {
    public static void main(String[] args) {
    MITSStu stud1=new MITSStu();
    MITSStu stud2=new MITSStu();
    stud1.setEnrollnment(191023);
    System.out.println(stud1.getEnrollnment());
    stud2.setEnrollnment(191025);
    System.out.println(stud2.getEnrollnment());
    stud1.setName("Anshuman jain");
    System.out.println(stud1.getName());
    stud2.setName("Pratiksha jain");
    System.out.println(stud2.getName());
    }
}
