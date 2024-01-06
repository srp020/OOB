public class Lab3_2 {
    String prename;
    String name;
    String surName;
    int age;
    /** Creates a new instance of Lab3_2 */
        public Lab3_2() {
            prename = "Mr.";
            name = "Somchai";
            surName = "Cheingpongpan";
            age = 24;
        }
        public static void main(String[] args) {
            Lab3_2 person,std;
            long id;
            String value;
            id = 5066260000L;
            person = new Lab3_2();
            std = new Lab3_2();
            value = person.prename + person.name + " " + person.surName;
            value += ", " + person.age + " year old.";
            System.out.println("ID : " + id);
            System.out.println("Data person : " + value);
            System.out.println("===============================");

            person.prename = "Mrs.";
            person.name = "John";
            person.surName = "Smith";
            person.age = 29;
            value = person.prename + person.name + " " + person.surName;
            value += ", " + person.age + " year old.";
            System.out.println("ID : " + id);
            System.out.println("New data person : " + value);
            System.out.println("===============================");
            
            std.prename = "Miss";
            std.name = "Siripha";
            std.surName = "Penprapha";
            std.age = 20;
            value = std.prename + std.name + " " + std.surName;
            value += ", " + std.age + " year old.";
            System.out.println("ID : " + id);
            System.out.println("New data person : " + value);
        }
    }
