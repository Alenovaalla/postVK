package ru.netology.domain;

public class Post {
    private int ID;
    private int userPageID;
    private int autorPostID;
    private String text;
    private int data;
    private CommentsInfo commentsInfo;
    private int repostUserPageID;
    private boolean Private;
    private LikeInfo likeInfo;
    private RepostInfo repostInfo;
    private int viewsInfo;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getUserPageID() {
        return userPageID;
    }

    public void setUserPageID(int userPageID) {
        this.userPageID = userPageID;
    }

    public int getAutorPostID() {
        return autorPostID;
    }

    public void setAutorPostID(int autorPostID) {
        this.autorPostID = autorPostID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public int getRepostUserPageID() {
        return repostUserPageID;
    }

    public void setRepostUserPageID(int repostUserPageID) {
        this.repostUserPageID = repostUserPageID;
    }

    public boolean isPrivate() {
        return Private;
    }

    public void setPrivate(boolean aPrivate) {
        Private = aPrivate;
    }

    public LikeInfo getLikeInfo() {
        return likeInfo;
    }

    public void setLikeInfo(LikeInfo likeInfo) {
        this.likeInfo = likeInfo;
    }

    public RepostInfo getRepostInfo() {
        return repostInfo;
    }

    public void setRepostInfo(RepostInfo repostInfo) {
        this.repostInfo = repostInfo;
    }

    public int getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(int viewsInfo) {
        this.viewsInfo = viewsInfo;
    }
}
