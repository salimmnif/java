package tn.esprit.gestionzoo.entities;

public class Animal {
     private String family;
     private String name;
     private int age;
     private  boolean isMammal;
     Animal(String name, int age, boolean isMammal, String family) {
         this.name = name;
         this.age = age;
         this.isMammal = isMammal;
         this.family = family;
     }
     public String getName() {
         return name;
     }
     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         if (age < 0) {
             System.out.println("Invalid Age");
         }
         else{
             this.age = age;
         }

     }



     public void displayanimal() {
          System.out.println(name);
          System.out.println(family);
          System.out.println(age);
          System.out.println(isMammal);}




}
