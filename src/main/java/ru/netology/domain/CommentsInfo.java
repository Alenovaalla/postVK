package ru.netology.domain;

public class CommentsInfo {
    private int UserId;
    private int quantityLikes;
    private boolean viewOnlyForFriends;


    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public int getQuantityLikes() {
        return quantityLikes;
    }

    public void setQuantityLikes(int quantityLikes) {
        this.quantityLikes = quantityLikes;
    }

    public boolean isViewOnlyForFriends() {
        return viewOnlyForFriends;
    }

    public void setViewOnlyForFriends(boolean viewOnlyForFriends) {
        this.viewOnlyForFriends = viewOnlyForFriends;
    }
}
