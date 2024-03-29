package com.yuan.mybatis.pojo;

/**
 * @description:
 * @author: gbanya
 * @create: 2023-07-19 21:43
 * @Version 1.0
 **/
public class User {

    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String gender;
    private String email;

    public User() {
    }

    public User(Integer id, String username, String password, Integer age, String gender, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
