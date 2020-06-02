package ru.netology.domain;

public class CommentsInfo {
    private int AutorId;
    private int quantityLikes;
    private boolean onlyFrendsCanLikes;


    public int getAutorId() {
        return AutorId;
    }

    public void setAutorId(int autorId) {
        AutorId = autorId;
    }

    public int getQuantityLikes() {
        return quantityLikes;
    }

    public void setQuantityLikes(int quantityLikes) {
        this.quantityLikes = quantityLikes;
    }

    public boolean isOnlyFrendsCanLikes() {
        return onlyFrendsCanLikes;
    }

    public void setOnlyFrendsCanLikes(boolean onlyFrendsCanLikes) {
        this.onlyFrendsCanLikes = onlyFrendsCanLikes;
    }
}
