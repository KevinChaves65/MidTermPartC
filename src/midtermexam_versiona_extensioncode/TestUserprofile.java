/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author kevinchaves
 */
public class TestUserprofile {
    public static void main(String[]args){
        String id, genre;
        Scanner answer = new Scanner(System.in);
        System.out.println("Enter ID");
        id =answer.nextLine();
        System.out.println("Enter Genre");
        genre = answer.nextLine();
        UserProfile p1 = new UserProfile(id,genre);
        System.out.println(p1);
    }
}
