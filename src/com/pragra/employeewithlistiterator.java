package com.pragra;

public class employeewithlistiterator {

       private String name;
        private String email;
        private int age;
       private String country;

        public employeewithlistiterator(String name,String email, int age, String country){
            this.name = name;
            this.email = email;
            this.age = age;
            this.country = country;
        }

        public void setName(String name){
            this.name = name;
        }
        public String getname(){
            return name;
        }

        public void setEmail(String email){
            this.email = email;
        }
        public String getEmail(){
            return email;
        }
        public void setAge(int age){
            this.age = age;
        }
        public int getAge(){
            return age;
        }
        public void setCountry(String country){
            this.country = country;
        }
        public String getCountry(){
            return country;
        }

    @Override
    public String toString() {
        return "employeewithlistiterator{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }



}
