package com.talan.exoactivitystatistic;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class UserTrackingBean {
		
	private Date createdDate;
	
	private Date startDate ; 
	
	private Date endDate ; 
            
    private String UserName ;
    
    private String UserUid ;
    
    private HashMap<String , Long > activityNumberPerType ; 
    
    private ArrayList<Long>  commentsNumberPerActivity; 
    
    private ArrayList<Long> likesNumberPerActivity;
    
    private long  totalactivitiesNumber;
    
    private long totallikesNumber ; 
    
    private long totalcommentsNumber;
    
    // this is a cumulative number of comments made  by the user
    private long commentsPostedNumber;
    
    private long activitiesSharedNumber;
    
    private long linksSharedNumber;
    
    private long documentsSharedNumber;
    
    private float avgLikes = 0 ; 
    
    private float avgComments = 0 ;
    
    
    
    public void addActivity (String type , long number ){
    	if (this.activityNumberPerType.containsKey(type)){
    		this.activityNumberPerType.put(type, number);
    	}else{
    		
    	}
    }

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return UserName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		UserName = userName;
	}

	/**
	 * @return the userUid
	 */
	public String getUserUid() {
		return UserUid;
	}

	/**
	 * @param userUid the userUid to set
	 */
	public void setUserUid(String userUid) {
		UserUid = userUid;
	}

	/**
	 * @return the totalactivitiesNumber
	 */
	public long getTotalactivitiesNumber() {
		return totalactivitiesNumber;
	}

	/**
	 * @param totalactivitiesNumber the totalactivitiesNumber to set
	 */
	public void setTotalactivitiesNumber(long totalactivitiesNumber) {
		this.totalactivitiesNumber = totalactivitiesNumber;
	}

	/**
	 * @return the totallikesNumber
	 */
	public long getTotallikesNumber() {
		return totallikesNumber;
	}

	
	/**
	 * @return the totalcommentsNumber
	 */
	public long getTotalcommentsNumber() {
		return totalcommentsNumber;
	}
	
	
	/**
	 * @param likes Number to add 
	 * @return nothing 
	 */
	public void addLikes (long likesNumber){
		this.totallikesNumber = this.totallikesNumber + likesNumber ; 
		this.likesNumberPerActivity.add(likesNumber);
	}
	

	/**
	 * @param likes Number to add 
	 * @return nothing 
	 */
	
	public void addComments(long CommentsNumber ){
		this.totalcommentsNumber = this.totalcommentsNumber + CommentsNumber; 
		this.commentsNumberPerActivity.add(CommentsNumber);
	}
	/**
	 * @param adds One Comment made by the user   
	 * @return nothing 
	 */	
	public void addpostedComment(long comment ){
		this.commentsPostedNumber = this.commentsPostedNumber + comment ;  
	}
	
	
}
