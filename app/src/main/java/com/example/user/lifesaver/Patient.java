package com.example.user.lifesaver;

/**
 * Created by User on 8/19/2016.
 */
public class Patient {
    private String age;
    private String name;
    private String gender;
    private String diagnosis;
    // private String picture_url;
    private String category;
    private String id;

    public void Patient(String age, String name, String gender, String diagnosis,  String category, String id){
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.diagnosis = diagnosis;

        this.category = category;
        this.id = id;
    }

    public int getAge(){
        return Integer.valueOf(this.age);
    }
    public String getName(){
        return this.name;
    }
    public String getGender(){
        return this.gender;
    }
    public String getDiagnosis(){
        return this.diagnosis;
    }
    public String getCategory(){
        return this.category;
    }
    public int getId(){
        return  Integer.valueOf(this.id);
    }
}
