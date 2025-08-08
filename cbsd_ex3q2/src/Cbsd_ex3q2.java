/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author devbykokokung
 */
public class Cbsd_ex3q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LiveScoreBean bean = new LiveScoreBean();

        Subscriber s1 = new Subscriber("Display1");
        Subscriber s2 = new Subscriber("Display2");

        bean.addPropertyChangeListener("scoreLine", s1);
        bean.addPropertyChangeListener("scoreLine", s2);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Score ");
            String line = sc.nextLine();
            if (line.trim().isEmpty()) {
                System.out.println("Program terminated.");
                break;
            }
            bean.setScoreLine(line);
        }
        sc.close();
    }
}
