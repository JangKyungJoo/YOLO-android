package kr.co.triggers.yolo.domain.impl;

import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Track extends RealmObject {

    @PrimaryKey
    private long id;

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }


    private int rank;

    public int getRank() { return rank; }
    public void setRank(int rank) { this.rank = rank; }


    private String title;

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }


    private Date release;

    public Date getRelease() { return release; }
    public void setRelease(Date release) { this.release = release; }


    private String link;

    public String getLink() { return link; }
    public void setLink(String link) { this.link = link; }


    private int dropAt;

    public int getDropAt() { return dropAt; }
    public void setDropAt(int dropAt) { this.dropAt = dropAt; }


    private boolean liked;

    public boolean isLiked() { return liked; }
    public void setLiked(boolean liked) { this.liked = liked; }


    private RealmList<Artist> composers;

    public RealmList<Artist> getComposers() { return composers; }
    public void setComposers(RealmList<Artist> composers) { this.composers = composers; }


    private RealmList<Tag> genres;

    public RealmList<Tag> getGenres() { return genres;}
    public void setGenres(RealmList<Tag> genres) { this.genres = genres; }
}
