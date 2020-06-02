package ru.netology.domain;

public class LikeInfo {
    private int AutorId;
    private boolean onlyFrendsCanLikes;
    private boolean liked;

    public int getAutorId() {
        return AutorId;
    }

    public void setAutorId(int autorId) {
        AutorId = autorId;
    }

    public boolean isOnlyFrendsCanLikes() {
        return onlyFrendsCanLikes;
    }

    public void setOnlyFrendsCanLikes(boolean onlyFrendsCanLikes) {
        this.onlyFrendsCanLikes = onlyFrendsCanLikes;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }
}
