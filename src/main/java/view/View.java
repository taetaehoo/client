package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View implements IView {
    private Scanner sc = new Scanner(System.in);

    public View() {}
    @Override
    public void view() {

    }
    public Scanner getSc() {
        return sc;
    }
    public int selMenu() {
        int sel = 0;
        while (true) {
            try {
                sel = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력 형식입니다.");
                sc.next();
                continue;
            }
            return sel;
        }
    }
    public boolean checkLength(String line, int id) {
        if (line.length() > id)
            return false;
        return true;
    }
}
