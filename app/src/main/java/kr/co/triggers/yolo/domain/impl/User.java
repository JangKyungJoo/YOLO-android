package kr.co.triggers.yolo.domain.impl;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class User extends RealmObject {

    @PrimaryKey
    private long id;

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }


    private String name;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }


    private Date birth;

    public Date getBirth() { return birth; }
    public void setBirth(Date birth) { this.birth = birth; }


    private String gender;

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
}
