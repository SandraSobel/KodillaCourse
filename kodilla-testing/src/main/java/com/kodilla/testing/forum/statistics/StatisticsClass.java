package com.kodilla.testing.forum.statistics;

public class StatisticsClass {

    private Statistics statistics;
    public int numberOfUsers;
    public int numberOfPosts;
    public int numberOfComments;
    public double averagePostsPerUser;
    public double averageCommentsPerUser;
    public double averageCommentsPerPosts;

    public StatisticsClass(Statistics statistics){
        this.statistics = statistics;
    }
//if  if jak zero
    //usun double

    public void calculateAdvStatistics(Statistics statistics){

        numberOfUsers = statistics.usersNames().size();

        numberOfPosts = statistics.postsCount();

        numberOfComments = statistics.commentsCount();

        if (numberOfUsers == 0) {
            averagePostsPerUser = 0;
        } else {
            averagePostsPerUser = (double)numberOfPosts/(double)numberOfUsers;}

        if (numberOfUsers == 0) {
            averageCommentsPerUser = 0;
        } else {
            averageCommentsPerUser = (double)numberOfComments/(double)numberOfUsers;}

        if (numberOfPosts == 0) {
            averageCommentsPerPosts= 0;
        }else {
            averageCommentsPerPosts = (double)numberOfComments/(double)numberOfPosts;
        }
    }

    public void showStatistic() {
        System.out.println("Average post per user: " + averagePostsPerUser);
        System.out.println("Average comments per user: " + averageCommentsPerUser);
        System.out.println("Average comments per post: " + averageCommentsPerPosts);
    }
}
