package kr.co.triggers.yolo.domain.impl;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Tag extends RealmObject {

    public static final String TYPE_ARTIST = "artist";
    public static final String TYPE_GENRE = "genre";
    public static final String TYPE_HASHTAG = "hashtag";

    @PrimaryKey
    private long id;

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }


    private String name;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }


    private String type;

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}
