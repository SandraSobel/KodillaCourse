package com.kodilla.stream.forum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ForumUserTestSuite {

    @Test
    void testGetLocationsOfFriends() {
        //given
        ForumUser user1 = new ForumUser("alan01", "Alan Kosovsky", "Washington");
        ForumUser user2 = new ForumUser("ethanrerard", "Ethan Rerard", "Miami");
        ForumUser user3 = new ForumUser("eRiK", "Erik Hull", "Key West");
        ForumUser user4 = new ForumUser("booth", "Mya Booth", "Washington");
        ForumUser user5 = new ForumUser("nicole1987", "Nicole Lee", "Orlando");
        ForumUser user6 = new ForumUser("nobody", "Briana Williams", "Miami");
        ForumUser user7 = new ForumUser("bigmac", "Robert Mcdonald", "Washington");
        ForumUser user8 = new ForumUser("thebigone", "Clay Small", "Orlando");
        ForumUser user9 = new ForumUser("user121212", "Marisa Frank", "Washington");
        ForumUser user10 = new ForumUser("lawyer", "Lexie John", "Miami");

        //when
        user1.addFriend(user3);
        user1.addFriend(user7);
        user1.addFriend(user10);

        user3.addFriend(user1);
        user3.addFriend(user7);
        user3.addFriend(user2);
        user3.addFriend(user9);

        user7.addFriend(user1);
        user7.addFriend(user3);

        user10.addFriend(user1);

        user2.addFriend(user3);

        user9.addFriend(user3);

        //then
        //user1 has 3 friends with following locations: key west, washington, miami
        assertEquals(3, user1.getLocationOfFriends().size());
        assertTrue(user1.getLocationOfFriends().contains("Key West"));
        assertTrue(user1.getLocationOfFriends().contains("Washington"));
        assertTrue(user1.getLocationOfFriends().contains("Miami"));
        assertFalse(user1.getLocationOfFriends().contains("Orlando"));
    }
        @Test
        void testGetLocationsOfFriendsOfFriends(){
            //given
            ForumUser user1 = new ForumUser("alan01","Alan Kosovsky", "Washington");
            ForumUser user2 = new ForumUser("ethanrerard","Ethan Rerard","Miami");
            ForumUser user3 = new ForumUser("eRiK","Erik Hull","Key West");
            ForumUser user4 = new ForumUser("booth","Mya Booth","Washington");
            ForumUser user5 = new ForumUser("nicole1987","Nicole Lee","Orlando");
            ForumUser user6 = new ForumUser("nobody","Briana Williams","Miami");
            ForumUser user7 = new ForumUser("bigmac","Robert Mcdonald","Washington");
            ForumUser user8 = new ForumUser("thebigone","Clay Small","Orlando");
            ForumUser user9 = new ForumUser("user121212","Marisa Frank","Washington");
            ForumUser user10 = new ForumUser("lawyer","Lexie John","Miami");

            //when
            user1.addFriend(user3);
            user1.addFriend(user7);
            user1.addFriend(user10);

            user3.addFriend(user1);
            user3.addFriend(user7);
            user3.addFriend(user2);
            user3.addFriend(user9);

            user7.addFriend(user1);
            user7.addFriend(user3);

            user10.addFriend(user1);

            user2.addFriend(user3);

            user9.addFriend(user3);

            //then

            assertEquals(3,user1.getLocationOfFriendsOfFriends().size());
            assertTrue(user1.getLocationOfFriendsOfFriends().contains("Key West"));
            assertTrue(user1.getLocationOfFriendsOfFriends().contains("Washington"));
            assertTrue(user1.getLocationOfFriendsOfFriends().contains("Miami"));
            assertFalse(user1.getLocationOfFriendsOfFriends().contains("Orlando"));



    }

}
