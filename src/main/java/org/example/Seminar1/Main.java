package org.example.Seminar1;

import com.google.gson.Gson;

public class Main {

    public static class User {
        private int age;
        private String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public User() {}

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Gson gson = new Gson();
        User user = new User(100 , "Roman");
        String json = gson.toJson(user);
        System.out.println(json);

        String jsonDate = "{ \"name\": \"Roman\", \"age\": 30 }";
        User user2 = gson.fromJson(jsonDate, User.class);
        System.out.println(user2);
    }
}