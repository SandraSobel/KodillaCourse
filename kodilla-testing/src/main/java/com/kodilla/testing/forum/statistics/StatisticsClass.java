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


    public void calculateAdvStatistics(Statistics statistics){
        int numberOfUsers = statistics.usersNames().size();
        int numberOfPosts = statistics.postsCount();
        int numberOfComments = statistics.commentsCount();
        double averagePostsPerUser = numberOfPosts/numberOfUsers;
        double averageCommentsPerUser = numberOfComments/numberOfUsers;
        double averageCommentsPerPosts = numberOfComments/numberOfPosts;
        }

    public void showStatistic() {
        System.out.println("Average post per user: " + averagePostsPerUser);
        System.out.println("Average comments per user: " + averageCommentsPerUser);
        System.out.println("Average comments per post: " + averageCommentsPerPosts);
    }
}
