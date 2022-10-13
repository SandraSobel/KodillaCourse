package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
//nie wywoluje metody statistic
//when wywolanie metody
//then rzucam zmienne
//wylatek arytmetyczny
//
public class StatisticsTestSuite {
    @Mock
    Statistics statisticsMock = mock(Statistics.class);

    @Test
    void testWhenQuantityOfPostIsZero() {
        //given
        StatisticsClass statisticsClass = new StatisticsClass(statisticsMock);

        List<String> listOfUsernamesMock = new ArrayList<>();
        for(int i=0;i<5;i++){
            listOfUsernamesMock.add("username"+i);
        }
        int postCountMock= 0;
        int commentsCountMock=10;
        when(statisticsMock.usersNames()).thenReturn(listOfUsernamesMock);
        when(statisticsMock.postsCount()).thenReturn(postCountMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountMock);
        //when
        statisticsClass.calculateAdvStatistics(statisticsMock);

        //then
        int usersNumber = statisticsClass.numberOfUsers;
        int postsNumber = statisticsClass.numberOfPosts;
        int commentsNumber = statisticsClass.numberOfComments;
        double averagePostPerUser = statisticsClass.averagePostsPerUser;
        double averageCommPerUser = statisticsClass.averageCommentsPerUser;
        double averageCommPerPost = statisticsClass.averageCommentsPerPosts;

        assertEquals(5, usersNumber);
        assertEquals(0, postsNumber);
        assertEquals(10, commentsNumber);
        assertEquals(0, averagePostPerUser);
        assertEquals(2, averageCommPerUser);
        assertEquals(0, averageCommPerPost);
    }
    @Test
    void testWhenQuantityOfPostIsThousand() {
        //given
        StatisticsClass statisticsClass = new StatisticsClass(statisticsMock);

        List<String> listOfUsernamesMock = new ArrayList<>();
        for(int i=0;i<100;i++){
            listOfUsernamesMock.add("username"+i);
        }
        int postCountMock= 1000;
        int commentsCountMock=2000;
        when(statisticsMock.usersNames()).thenReturn(listOfUsernamesMock);
        when(statisticsMock.postsCount()).thenReturn(postCountMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountMock);
        //when
        statisticsClass.calculateAdvStatistics(statisticsMock);

        //then
        int usersNumber = statisticsClass.numberOfUsers;
        int postsNumber = statisticsClass.numberOfPosts;
        int commentsNumber = statisticsClass.numberOfComments;
        double averagePostPerUser = statisticsClass.averagePostsPerUser;
        double averageCommPerUser = statisticsClass.averageCommentsPerUser;
        double averageCommPerPost = statisticsClass.averageCommentsPerPosts;

        assertEquals(100, usersNumber);
        assertEquals(1000, postsNumber);
        assertEquals(2000, commentsNumber);
        assertEquals(10, averagePostPerUser);
        assertEquals(20, averageCommPerUser);
        assertEquals(2, averageCommPerPost);
    }
    @Test
    void testWhenQuantityOfCommentsIsZero() {
        //given
        StatisticsClass statisticsClass = new StatisticsClass(statisticsMock);

        List<String> listOfUsernamesMock = new ArrayList<>();
        for(int i=0;i<100;i++){
            listOfUsernamesMock.add("username"+i);
        }
        int postCountMock= 1000;
        int commentsCountMock=0;
        when(statisticsMock.usersNames()).thenReturn(listOfUsernamesMock);
        when(statisticsMock.postsCount()).thenReturn(postCountMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountMock);
        //when
        statisticsClass.calculateAdvStatistics(statisticsMock);

        //then
        int usersNumber = statisticsClass.numberOfUsers;
        int postsNumber = statisticsClass.numberOfPosts;
        int commentsNumber = statisticsClass.numberOfComments;
        double averagePostPerUser = statisticsClass.averagePostsPerUser;
        double averageCommPerUser = statisticsClass.averageCommentsPerUser;
        double averageCommPerPost = statisticsClass.averageCommentsPerPosts;

        assertEquals(100, usersNumber);
        assertEquals(1000, postsNumber);
        assertEquals(0, commentsNumber);
        assertEquals(10, averagePostPerUser);
        assertEquals(0, averageCommPerUser);
        assertEquals(0, averageCommPerPost);
    }
    @Test
    void testWhenQuantityOfCommentsIsLowerThanQuantityOfPosts() {
        //given
        StatisticsClass statisticsClass = new StatisticsClass(statisticsMock);

        List<String> listOfUsernamesMock = new ArrayList<>();
        for(int i=0;i<10;i++){
            listOfUsernamesMock.add("username"+i);
        }
        int postCountMock= 2000;
        int commentsCountMock=1000;
        when(statisticsMock.usersNames()).thenReturn(listOfUsernamesMock);
        when(statisticsMock.postsCount()).thenReturn(postCountMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountMock);

        //when
        statisticsClass.calculateAdvStatistics(statisticsMock);

        //then
        int usersNumber = statisticsClass.numberOfUsers;
        int postsNumber = statisticsClass.numberOfPosts;
        int commentsNumber = statisticsClass.numberOfComments;
        double averagePostPerUser = statisticsClass.averagePostsPerUser;
        double averageCommPerUser = statisticsClass.averageCommentsPerUser;
        double averageCommPerPost = statisticsClass.averageCommentsPerPosts;

        assertEquals(10, usersNumber);
        assertEquals(2000, postsNumber);
        assertEquals(1000, commentsNumber);
        assertEquals(200, averagePostPerUser);
        assertEquals(100, averageCommPerUser);
        assertEquals(0.5, averageCommPerPost);
    }
    @Test
    void testWhenQuantityOfCommentsIsHigherThanQuantityOfPosts() {
        //given
        StatisticsClass statisticsClass = new StatisticsClass(statisticsMock);
        List<String> listOfUsernamesMock = new ArrayList<>();
        for(int i=0;i<100;i++){
            listOfUsernamesMock.add("username"+i);
        }
        int postCountMock= 1000;
        int commentsCountMock=2000;
        when(statisticsMock.usersNames()).thenReturn(listOfUsernamesMock);
        when(statisticsMock.postsCount()).thenReturn(postCountMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountMock);

        //when
        statisticsClass.calculateAdvStatistics(statisticsMock);


        //then
        int usersNumber = statisticsClass.numberOfUsers;
        int postsNumber = statisticsClass.numberOfPosts;
        int commentsNumber = statisticsClass.numberOfComments;
        double averagePostPerUser = statisticsClass.averagePostsPerUser;
        double averageCommPerUser = statisticsClass.averageCommentsPerUser;
        double averageCommPerPost = statisticsClass.averageCommentsPerPosts;

        assertEquals(100, usersNumber);
        assertEquals(1000, postsNumber);
        assertEquals(2000, commentsNumber);
        assertEquals(10, averagePostPerUser);
        assertEquals(20, averageCommPerUser);
        assertEquals(2, averageCommPerPost);
    }
    @Test
    void testWhenQuantityOfUsersIsZero() {
        //given
        StatisticsClass statisticsClass = new StatisticsClass(statisticsMock);
        List<String> listOfUsernamesMock = new ArrayList<>();
        int postCountMock= 1000;
        int commentsCountMock=2000;
        when(statisticsMock.usersNames()).thenReturn(listOfUsernamesMock);
        when(statisticsMock.postsCount()).thenReturn(postCountMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountMock);

        //when
        statisticsClass.calculateAdvStatistics(statisticsMock);

        //then
        int usersNumber = statisticsClass.numberOfUsers;
        int postsNumber = statisticsClass.numberOfPosts;
        int commentsNumber = statisticsClass.numberOfComments;
        double averagePostPerUser = statisticsClass.averagePostsPerUser;
        double averageCommPerUser = statisticsClass.averageCommentsPerUser;
        double averageCommPerPost = statisticsClass.averageCommentsPerPosts;

        assertEquals(0, usersNumber);
        assertEquals(1000, postsNumber);
        assertEquals(2000, commentsNumber);
        assertEquals(0, averagePostPerUser);
        assertEquals(0, averageCommPerUser);
        assertEquals(2, averageCommPerPost);
    }
    @Test
    void testWhenQuantityOfUsersIs100() {
        //given
        StatisticsClass statisticsClass = new StatisticsClass(statisticsMock);
        List<String> listOfUsernamesMock = new ArrayList<>();
        for(int i=0;i<100;i++){
            listOfUsernamesMock.add("username"+i);
        }
        int postCountMock= 1000;
        int commentsCountMock=2000;
        when(statisticsMock.usersNames()).thenReturn(listOfUsernamesMock);
        when(statisticsMock.postsCount()).thenReturn(postCountMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountMock);

        //when
        statisticsClass.calculateAdvStatistics(statisticsMock);

                //then
        int usersNumber = statisticsClass.numberOfUsers;
        int postsNumber = statisticsClass.numberOfPosts;
        int commentsNumber = statisticsClass.numberOfComments;
        double averagePostPerUser = statisticsClass.averagePostsPerUser;
        double averageCommPerUser = statisticsClass.averageCommentsPerUser;
        double averageCommPerPost = statisticsClass.averageCommentsPerPosts;

        assertEquals(100, usersNumber);
        assertEquals(1000, postsNumber);
        assertEquals(2000, commentsNumber);
        assertEquals(10, averagePostPerUser);
        assertEquals(20, averageCommPerUser);
        assertEquals(2, averageCommPerPost);
    }
}
