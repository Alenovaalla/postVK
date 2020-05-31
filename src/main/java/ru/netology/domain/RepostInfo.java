package ru.netology.domain;

public class RepostInfo {
    private int quantityReposts;
    private boolean userPageRepost;


    public int getQuantityReposts() {
        return quantityReposts;
    }

    public void setQuantityReposts(int quantityReposts) {
        this.quantityReposts = quantityReposts;
    }

    public boolean isUserPageRepost() {
        return userPageRepost;
    }

    public void setUserPageRepost(boolean userPageRepost) {
        this.userPageRepost = userPageRepost;
    }
}
