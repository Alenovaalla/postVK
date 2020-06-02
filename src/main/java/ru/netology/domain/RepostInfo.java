package ru.netology.domain;

public class RepostInfo {
    private boolean reposted;
    private int userPageIdRepost;


    public boolean isReposted() {
        return reposted;
    }

    public void setReposted(boolean reposted) {
        this.reposted = reposted;
    }

    public int getUserPageIdRepost() {
        return userPageIdRepost;
    }

    public void setUserPageIdRepost(int userPageIdRepost) {
        this.userPageIdRepost = userPageIdRepost;
    }
}
