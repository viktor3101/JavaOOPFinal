package Vihu;


import java.time.LocalDateTime;
import java.util.Scanner;

public class NotesRunner {
    public static void main(String[] args) {
        UsersList users = new UsersList();
        users.addUser("Paul", "pas1");
        users.addUser("Katy", "pas2");
        users.addUser("Bob", "pas3");


        User user1 = users.loginUser();//Paul`s notes:)
        user1.arrayAddNote("Today i had the best day ever:))","beautiful",LocalDateTime.now().minusMonths(1) );
        user1.arrayAddNote("Feeling bad","sad",LocalDateTime.now().minusDays(5));
        user1.arrayAddNote("No comments","very sad",LocalDateTime.now().minusDays(2));
        user1.arrayAddNote("I am stupid","crazy",LocalDateTime.now().minusDays(1));
        user1.arrayAddNote("i am married","the best",LocalDateTime.now());
        user1.changeUser();
        user1.changeUser();
        System.out.println(user1.listLastNotes());// must show only 4
        users.logoutUser();

        User user2 = users.loginUser();//Katy`s notes:)
        user2.arrayAddNote("he will marry me","beautiful",LocalDateTime.now().minusMonths(1));
        user2.arrayAddNote("he really wanna me be his wife","crazy",LocalDateTime.now().minusDays(7));
        user2.arrayAddNote("i am married","the best",LocalDateTime.now());
        System.out.println(user2.listLastNotes());// must show all
        user2.arrayDateSearch();

        User user3 = users.loginUser();//Bob`s notes:)
        user3.arrayAddNote("feel HAPPY! my Katy is wife now","the happiest",LocalDateTime.now());
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
