package Vihu;


import java.time.LocalDateTime;

public class NotesRunner {
    public static void main(String[] args) {
        UsersList users = new UsersList();
        users.addUser("Paul", "pas1");
        users.addUser("Katy", "pas2");
        users.addUser("Bob", "pas3");


        User user1 = users.loginUser();//Paul`s notes:)
        user1.arrayAddNote("Today i had the best day ever:))", "beautiful", LocalDateTime.now().minusMonths(1));
        user1.arrayAddNote("Feeling bad", "sad", LocalDateTime.now().minusDays(5));
        user1.arrayAddNote("No comments", "very sad", LocalDateTime.now().minusDays(2));
        user1.arrayAddNote("I am stupid", "crazy", LocalDateTime.now().minusDays(1));
        user1.arrayAddNote("i am married", "the best", LocalDateTime.now());
        user1.changeUser();
        user1.changeUser();
        System.out.println(user1.listLastNotes());// must show only 4
        users.logoutUser();

        User user2 = users.loginUser();//Katy`s notes:)
        user2.arrayAddNote("he will marry me", "beautiful", LocalDateTime.now().minusMonths(1));
        user2.arrayAddNote("he really wanna me be his wife", "crazy", LocalDateTime.now().minusDays(7));
        user2.arrayAddNote("i am married", "the best", LocalDateTime.now());
        System.out.println(user2.listLastNotes());// must show all
        user2.arrayDateSearch();

        User user3 = users.loginUser();//Bob`s notes:)
        user3.arrayAddNote("feel HAPPY! my Katy is wife now", "the happiest dad", LocalDateTime.now());
        System.out.println("Your id is: " + user3.seeMyId());


        users.addUser();//Add your own user:)
        User user4 = users.loginUser();
        user4.arrayAddNote();
        System.out.println(user4.seeMyId());

        System.out.println(users.showUser());
        users.deleteUser(user4.seeMyId());//if you will pass the verification user 4 will be deleted
        System.out.println(users.showUser());
    }
}
/*
 * Paul
 * input password:
 * pas1
 * What will you wanna change?? (username/password)
 * username
 * Paul1997
 * What will you wanna change?? (username/password)
 * password
 * 12345
 * Notes:
 * | 2018-10-10T23:31:32.937435
 * | i am married
 * | feelings: the best
 * | 2018-10-09T23:31:32.937419
 * | I am stupid
 * | feelings: crazy
 * | 2018-10-08T23:31:32.937387
 * | No comments
 * | feelings: very sad
 * | 2018-10-05T23:31:32.937344
 * | Feeling bad
 * | feelings: sad
 * <p>
 * input username:
 * Katy
 * input password:
 * pas2
 * Notes:
 * | 2018-10-10T23:32:28.173018
 * | i am married
 * | feelings: the best
 * | 2018-10-03T23:32:28.172945
 * | he really wanna me be his wife
 * | feelings: crazy
 * | 2018-09-10T23:32:28.172892
 * | he will marry me
 * | feelings: beautiful
 * <p>
 * input username:
 * Bob
 * input password:
 * pas3
 * Your id is: 3
 * Input username: Viktor
 * Input password: 123
 * input username:
 * Viktor
 * input password:
 * 123
 * input your note:
 * MyNote:)
 * input your feelings:
 * well
 * 4
 * [Paul1997, Katy, Bob, Viktor]
 * input password:
 * 123
 * your account will be deleted:)
 * [Paul1997, Katy, Bob]
 */