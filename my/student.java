  class Student {
    String name;
    String section;
    String motto;

    public Student(String name, String section, String motto) {
        this.name = name;
        this.section = section;
        this.motto = motto;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Section: " + section);
        System.out.println("Motto: " + motto);
    
}


    public static void main(String[] args) {
  
        Student student1 = new Student("loren", "IT23", "Learn from yesterday, live for today, hope for tomorrow.");
        

        
        System.out.println("Student 1");
        student1.displayDetails();
        
    }
}
