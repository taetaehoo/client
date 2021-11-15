package view;

import Network.Network;
import handler.ViewHandler;

public class ProfessorView extends View {
    public ProfessorView() {
        super();

    }

    public void view() {
        while (true) {
            int sel = 0;
            while (true) {
            System.out.println("1. 개인정보 및 비밀번호 수정");
            System.out.println("2. 강의 계획서 입력/수정");
            System.out.println("3. 교과목 목록 조회");
            System.out.println("4. 교과목 강의 계획서 조회");
            System.out.println("5. 교과목 수강 신청 학생 목록 조회");
            System.out.println("6. 교과목 시간표 조회");
            System.out.println("7. 개설 교과목 관리");
            System.out.println("8. 뒤로 가기");
            System.out.print("메뉴 선택: ");


                switch (sel = selMenu()) {
                    case 1:
                        break;
                    case 2:
                        viewDetail(sel);
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        viewDetail(sel);
                        break;
                    case 8:
                        backTO();
                        return;
                    default:
                        System.out.println("다시 입력해주세요: ");
                        break;
                }
            }
        }
    }
    public void backTO() {
        try {
            Network.ManagerBackTo();
            ViewHandler.setPos(0);
        }catch(Exception e) {

        }
    }
    private void viewDetail(int sel) {
        int selDetail = 0;
        switch(sel) {
            case 2:
                while (true) {
                    System.out.println("1. 강의계획서 입력");
                    System.out.println("2. 강의계획서 수정");
                    System.out.print("메뉴 선택: ");

                    switch(selDetail = selMenu()) {//protocol 전송
                        case 1:
                            return;
                        case 2:
                            return;
                        default:
                            System.out.println("다시 입력해주세요");
                            break;
                    }
                }
            case 7:
                while (true) {
                    System.out.println("1. 교과목 개설");
                    System.out.println("2. 개설 교과목 수정");
                    System.out.println("3. 개설 교과목 삭제");
                    System.out.print("메뉴 선택: ");

                    switch(selDetail = selMenu()) {
                        case 1:
                            return;
                        case 2:
                            return;
                        case 3:
                            return;
                        default:
                            System.out.println("다시 입력해주세요");
                            break;
                    }
                }
        }
    }
}