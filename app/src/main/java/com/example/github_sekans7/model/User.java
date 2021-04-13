package com.example.github_sekans7.model;

import com.google.gson.annotations.SerializedName;

public class User{

	@SerializedName("gists_url")
	private String gistsUrl;

	@SerializedName("repos_url")
	private String reposUrl;

	@SerializedName("following_url")
	private String followingUrl;

	@SerializedName("twitter_username")
	private Object twitterUsername;

	@SerializedName("bio")
	private Object bio;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("login")
	private String login;

	@SerializedName("type")
	private String type;

	@SerializedName("blog")
	private String blog;

	@SerializedName("subscriptions_url")
	private String subscriptionsUrl;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("site_admin")
	private boolean siteAdmin;

	@SerializedName("company")
	private Object company;

	@SerializedName("id")
	private String id;

	@SerializedName("public_repos")
	private String  publicRepos;

	@SerializedName("gravatar_id")
	private String gravatarId;

	@SerializedName("email")
	private String email;

	@SerializedName("organizations_url")
	private String organizationsUrl;

	@SerializedName("hireable")
	private Object hireable;

	@SerializedName("starred_url")
	private String starredUrl;

	@SerializedName("followers_url")
	private String followersUrl;

	@SerializedName("public_gists")
	private int publicGists;

	@SerializedName("url")
	private String url;

	@SerializedName("received_events_url")
	private String receivedEventsUrl;

	@SerializedName("followers")
	private String followers;

	@SerializedName("avatar_url")
	private String avatarUrl;

	@SerializedName("events_url")
	private String eventsUrl;

	@SerializedName("html_url")
	private String htmlUrl;

	@SerializedName("following")
	private String  following;

	@SerializedName("name")
	private String name;

	@SerializedName("location")
	private Object location;

	@SerializedName("node_id")
	private String nodeId;

	public void setGistsUrl(String gistsUrl){
		this.gistsUrl = gistsUrl;
	}

	public String getGistsUrl(){
		return gistsUrl;
	}

	public void setReposUrl(String reposUrl){
		this.reposUrl = reposUrl;
	}

	public String getReposUrl(){
		return reposUrl;
	}

	public void setFollowingUrl(String followingUrl){
		this.followingUrl = followingUrl;
	}

	public String getFollowingUrl(){
		return followingUrl;
	}

	public void setTwitterUsername(Object twitterUsername){
		this.twitterUsername = twitterUsername;
	}

	public Object getTwitterUsername(){
		return twitterUsername;
	}

	public void setBio(Object bio){
		this.bio = bio;
	}

	public Object getBio(){
		return bio;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setLogin(String login){
		this.login = login;
	}

	public String getLogin(){
		return login;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setBlog(String blog){
		this.blog = blog;
	}

	public String getBlog(){
		return blog;
	}

	public void setSubscriptionsUrl(String subscriptionsUrl){
		this.subscriptionsUrl = subscriptionsUrl;
	}

	public String getSubscriptionsUrl(){
		return subscriptionsUrl;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setSiteAdmin(boolean siteAdmin){
		this.siteAdmin = siteAdmin;
	}

	public boolean isSiteAdmin(){
		return siteAdmin;
	}

	public void setCompany(Object company){
		this.company = company;
	}

	public Object getCompany(){
		return company;
	}

	public void setId(String  id){
		this.id = id;
	}

	public String  getId(){
		return id;
	}

	public void setPublicRepos(String  publicRepos){
		this.publicRepos = publicRepos;
	}

	public String  getPublicRepos(){
		return publicRepos;
	}

	public void setGravatarId(String gravatarId){
		this.gravatarId = gravatarId;
	}

	public String getGravatarId(){
		return gravatarId;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String  getEmail(){
		return email;
	}

	public void setOrganizationsUrl(String organizationsUrl){
		this.organizationsUrl = organizationsUrl;
	}

	public String getOrganizationsUrl(){
		return organizationsUrl;
	}

	public void setHireable(Object hireable){
		this.hireable = hireable;
	}

	public Object getHireable(){
		return hireable;
	}

	public void setStarredUrl(String starredUrl){
		this.starredUrl = starredUrl;
	}

	public String getStarredUrl(){
		return starredUrl;
	}

	public void setFollowersUrl(String followersUrl){
		this.followersUrl = followersUrl;
	}

	public String getFollowersUrl(){
		return followersUrl;
	}

	public void setPublicGists(int publicGists){
		this.publicGists = publicGists;
	}

	public int getPublicGists(){
		return publicGists;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setReceivedEventsUrl(String receivedEventsUrl){
		this.receivedEventsUrl = receivedEventsUrl;
	}

	public String getReceivedEventsUrl(){
		return receivedEventsUrl;
	}

	public void setFollowers(String followers){
		this.followers = followers;
	}

	public String getFollowers(){
		return followers;
	}

	public void setAvatarUrl(String avatarUrl){
		this.avatarUrl = avatarUrl;
	}

	public String getAvatarUrl(){
		return avatarUrl;
	}

	public void setEventsUrl(String eventsUrl){
		this.eventsUrl = eventsUrl;
	}

	public String getEventsUrl(){
		return eventsUrl;
	}

	public void setHtmlUrl(String htmlUrl){
		this.htmlUrl = htmlUrl;
	}

	public String getHtmlUrl(){
		return htmlUrl;
	}

	public void setFollowing(String following){
		this.following = following;
	}

	public String getFollowing(){
		return following;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLocation(Object location){
		this.location = location;
	}

	public Object getLocation(){
		return location;
	}

	public void setNodeId(String nodeId){
		this.nodeId = nodeId;
	}

	public String getNodeId(){
		return nodeId;
	}
}