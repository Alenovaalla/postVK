package ru.netology.domain;

public class Post {
    private int id;
    private int userPageId;
    private int autorPostId;
    private String text;
    private int data;
    private CommentsInfo commentsInfo;
    private int repostUserPageId;
    private boolean frendsOnly;
    private LikeInfo likeInfo;
    private RepostInfo repostInfo;
    private int viewsInfo;
    private int createdById;
    private int ReplyOwnerId;
    private String copyright;
    private String postType;
    private Geo geo;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private int postponedId;
    private int quantityComments;
    private boolean canCommentsUserPage;
    private boolean onComments;
    private int quantityLikes;
    private int userPageLikes;
    private boolean canLike;
    private int quantityReposts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserPageId() {
        return userPageId;
    }

    public void setUserPageId(int userPageId) {
        this.userPageId = userPageId;
    }

    public int getAutorPostId() {
        return autorPostId;
    }

    public void setAutorPostId(int autorPostId) {
        this.autorPostId = autorPostId;
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

    public int getRepostUserPageId() {
        return repostUserPageId;
    }

    public void setRepostUserPageId(int repostUserPageId) {
        this.repostUserPageId = repostUserPageId;
    }

    public boolean isFrendsOnly() {
        return frendsOnly;
    }

    public void setFrendsOnly(boolean frendsOnly) {
        this.frendsOnly = frendsOnly;
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

    public int getCreatedById() {
        return createdById;
    }

    public void setCreatedById(int createdById) {
        this.createdById = createdById;
    }

    public int getReplyOwnerId() {
        return ReplyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        ReplyOwnerId = replyOwnerId;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

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

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public int getQuantityReposts() {
        return quantityReposts;
    }

    public void setQuantityReposts(int quantityReposts) {
        this.quantityReposts = quantityReposts;
    }
}



