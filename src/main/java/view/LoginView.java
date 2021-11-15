package view;

import Network.Network;
import handler.ViewHandler;

public class LoginView extends View {
    public LoginView() {super();}

    public void view() {
        int sel = 0;
        while (true) {
            System.out.println("1. 매니저 로그인");
            System.out.println("2. 매니저 회원가입");
            System.out.println("3. 교수 로그인");
            System.out.println("4. 학생 로그인");
            System.out.println("5. 종료");
            System.out.print("메뉴 선택: ");

            switch (sel = selMenu()) {
                case 1:
                    if(Managerlogin() == 0) {
                        ViewHandler.setPos(1);
                        return;
                    }
                    else {
                        System.out.println("로그인 실패");
                        return;
                    }
                case 2:
                    break;
                case 3:
                    if (ProfessorLogin() == 0) {
                        ViewHandler.setPos(2);
                        return;
                    }
                    else {
                        System.out.println("로그인 실패");
                        return;
                    }
                case 4:
                    if (StudentLogin() == 0) {
                        ViewHandler.setPos(3);
                        return;
                    }
                    else {
                        System.out.println("로그인 실패");
                        return;
                    }

                case 5:
                    exit();
                    System.exit(0);
                default:
                    System.out.println("다시 입력해주세요: ");
                    break;
            }
        }
    }
    public void exit() {
        try {
            Network.exit();
        }catch (Exception e) {

        }
    }
    public int Managerlogin() {
        String id, password;
        while(true) {
            System.out.print("id 입력: ");
            if (checkLength(id = super.getSc().next(), Constraint.ID))
                break;
        }
        while (true) {
            System.out.print("password 입력: ");
            if (checkLength(password = super.getSc().next(), Constraint.PASSWORD))
                break;
        }
        int result;
        try {result = Network.ManagerLogin(id+"\n"+password);}
        catch(Exception e) {
            result = 1;
        }
        return result;
    }

    public int ProfessorLogin() {
        String id, password;
        while(true) {
            System.out.print("id 입력: ");
            if (checkLength(id = super.getSc().next(), Constraint.pNumber))
                break;
        }
        while (true) {
            System.out.print("password 입력: ");
            if (checkLength(password = super.getSc().next(), Constraint.password));
                break;
        }

        int result;
        try {result = Network.ProfessorLogin(id+"\n"+password);}
        catch(Exception e) {
            result = 1;
        }
        return result;
    }

    public int StudentLogin() {
        String id, password;
        while(true) {
            System.out.print("id 입력: ");
            if (checkLength(id = super.getSc().next(), Constraint.sNumber))
                break;
        }
        while (true) {
            System.out.print("password 입력: ");
            if (checkLength(password = super.getSc().next(), Constraint.password));
            break;
        }

        int result;
        try {result = Network.StudentLogin(id+"\n"+password);}
        catch(Exception e) {
            result = 1;
        }
        return result;
    }


}
