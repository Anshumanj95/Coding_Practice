package Data_Structure;

import javax.imageio.stream.ImageInputStream;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.Collection;

class Student{
    void print(){
        System.out.println("Student");
    }
}
class enggStrudent extends Student{
    void print(){
        System.out.println("Engineering Student");
    }
}
class mangStudent extends Student{
    void print(){
        System.out.println("Management Student");
    }
}

public class wildcard {
    public static void print(ArrayList<? extends Student> al){
        for(Student s:al){
            s.print();
        }
    }

    public static void main(String[] args) {
        ArrayList<enggStrudent> e=new ArrayList<>();
        e.add(new enggStrudent());
        e.add(new enggStrudent());
        ArrayList<mangStudent> m=new ArrayList<>();
        m.add(new mangStudent());
        print(e);
        print(m);
    }
}
