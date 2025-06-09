public class thiskey {
    static class student {
        int rollno;
        String name;
        int age;
        // Constructor to initialize the student object
        void printinfo(){
            System.out.println(this.rollno);
            System.out.println(this.name);
            System.out.println(this.age);
        }
    }

    public static void main(String[] args){
        student s1 = new student();
        s1.rollno = 101;
        s1.name = "John Doe";
        s1.age = 20;
        s1.printinfo();
    }
}