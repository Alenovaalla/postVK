package ru.netology.domain;

public class LikeInfo {
private int quantityLikes;
private int userPageLikes;
private boolean canLike;
private boolean canPublish;

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }

    public int getQuantityLikes() {
        return quantityLikes;
    }

    public void setQuantityLikes(int quantityLikes) {
        this.quantityLikes = quantityLikes;
    }

    public int getUserPageLikes() {
        return userPageLikes;
    }

    public void setUserPageLikes(int userPageLikes) {
        this.userPageLikes = userPageLikes;
    }
}
