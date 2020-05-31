package ru.netology.domain;

public class CommentsInfo {
    private int quantityComments;
    private boolean canCommentsUserPage;
    private boolean onComments;
    private boolean canPost;
    private boolean canClose;
    private boolean canOpen;

    public int getQuantityComments() {
        return quantityComments;
    }

    public void setQuantityComments(int quantityComments) {
        this.quantityComments = quantityComments;
    }

    public boolean isCanCommentsUserPage() {
        return canCommentsUserPage;
    }

    public void setCanCommentsUserPage(boolean canCommentsUserPage) {
        this.canCommentsUserPage = canCommentsUserPage;
    }

    public boolean isOnComments() {
        return onComments;
    }

    public void setOnComments(boolean onComments) {
        this.onComments = onComments;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}
