package kr.co.triggers.yolo.domain.impl;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Artist extends RealmObject {

    @PrimaryKey
    private long id;

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }


    private String name;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }


    private RealmList<Feed> feeds;

    public RealmList<Feed> getFeeds() { return feeds; }
    public void setFeeds(RealmList<Feed> feeds) { this.feeds = feeds; }


    private Tag tag;

    public Tag getTag() { return tag; }
    public void setTag(Tag tag) { this.tag = tag; }


    private RealmList<Track> tracks;


    public RealmList<Track> getTracks() { return tracks; }
    public void setTracks(RealmList<Track> tracks) { this.tracks = tracks; }


    private boolean liked;

    public boolean isLiked() { return liked; }
    public void setLiked(boolean liked) { this.liked = liked; }
}
