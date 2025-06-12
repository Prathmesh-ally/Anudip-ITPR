class Student {
    private String name; // 👈 Private variable

    // Setter method
    public void setName(String newName) {
        name = newName;
    }

    // Getter method
    public String getName() {
        return name;
    }
}

public class encapsulationgettersetter {
    public static void main(String[] args) {
        Student s1 = new Student();        // Create object
        s1.setName("Prathmesh");           // Set name using setter
        System.out.println(s1.getName());  // Get name using getter
    }
}

    

