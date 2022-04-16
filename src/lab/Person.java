package lab;
import java.util.Scanner;

    public class Person {

        static class person{
            String name;
            String age;
            String address;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAge() {
                return age;
            }

            public void setAge(String age) {
                this.age = age;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }
        }
        static class student extends person {
            String std;
            String marks;

            public String getStd() {
                return std;
            }

            public void setStd(String std) {
                this.std = std;
            }

            public String getMarks() {
                return marks;
            }

            public void setMarks(String marks) {
                this.marks = marks;
            }
        }
        static class teacher extends person {
            String subject;
            String salary;

            public String getSubject() {
                return subject;
            }

            public void setSubject(String subject) {
                this.subject = subject;
            }

            public String getSalary() {
                return salary;
            }

            public void setSalary(String salary) {
                this.salary = salary;
            }
        }
        static class employee extends person {
            String organization;
            String joining_date;
            String salary;

            public String getOrganization() {
                return organization;
            }

            public void setOrganization(String organization) {
                this.organization = organization;
            }

            public String getJoining_date() {
                return joining_date;
            }

            public void setJoining_date(String joining_date) {
                this.joining_date = joining_date;
            }

            public String  getSalary() {
                return salary;
            }

            public void setSalary(String  salary) {
                this.salary = salary;
            }
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter your class\n" +
                    "1.Student\n" +
                    "2.Employee\n" +
                    "3.Teacher\n");
            int class_to=sc.nextInt();
            sc.nextLine();
            if(class_to==1){
                student student1=new student();
                System.out.println("Enter your name");
                student1.name=sc.nextLine();
                System.out.println("Enter your address city");
                student1.address=sc.nextLine();
                System.out.println("Enter your age");
                student1.age=sc.nextLine();
                System.out.println("enter your class");
                student1.std=sc.nextLine();
                System.out.println("enter your marks");
                student1.marks=sc.nextLine();
                System.out.println(student1.getName());
                System.out.println(student1.getAddress());
                System.out.println(student1.getAge());
                System.out.println(student1.getMarks());
                System.out.println(student1.getStd());
            }
            else if(class_to==2){
                employee employee1=new employee();
                System.out.println("Enter your name");
                employee1.name=sc.nextLine();
                System.out.println("Enter your address city");
                employee1.address=sc.nextLine();
                System.out.println("Enter your age");
                employee1.age=sc.nextLine();
                System.out.println("enter your organization");
                employee1.organization=sc.nextLine();
                System.out.println("dte of joining");
                employee1.joining_date=sc.nextLine();
                System.out.println("salary");
                employee1.salary=sc.nextLine();
                System.out.println(employee1.getName());
                System.out.println(employee1.getAddress());
                System.out.println(employee1.getAge());
                System.out.println(employee1.getOrganization());
                System.out.println(employee1.getJoining_date());
                System.out.println(employee1.getSalary());
            }
            else if(class_to==3){
                teacher teacher1=new teacher();
                System.out.println("enter your name");
                teacher1.name=sc.nextLine();
                System.out.println("address");
                teacher1.address=sc.nextLine();
                System.out.println("age");
                teacher1.age=sc.nextLine();
                System.out.println("subject");
                teacher1.subject=sc.nextLine();
                System.out.println("salary");
                teacher1.salary=sc.nextLine();
                System.out.println(teacher1.getName());
                System.out.println(teacher1.getAddress());
                System.out.println(teacher1.getAge());
                System.out.println(teacher1.getSubject());
                System.out.println(teacher1.getSalary());
            }


        }
    }
