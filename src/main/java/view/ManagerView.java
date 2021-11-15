package view;

import Network.Network;
import handler.ViewHandler;

public class ManagerView extends View {
    public ManagerView() {
        super();
    }

    public void view() {
        while (true) {
            int sel = 0;
            while (true) {
                System.out.println("1. 교수 학생 계정 생성");
                System.out.println("2. 교과목 생성/수정/삭제");
                System.out.println("3. 강의 계획서 입력 기간 설정");
                System.out.println("4. 학년별 수강 신청 기간 설정");
                System.out.println("5. 교수/학생 정보 조회");
                System.out.println("6. 교과목 정보 조회");
                System.out.println("7. 뒤로 가기");
                System.out.print("메뉴 선택: ");


                switch (sel = selMenu()) {
                    case 1:
                        viewDetail(sel);
                        break;
                    case 2:
                        viewDetail(sel);
                        break;
                    case 3://protocol 전송
                        break;
                    case 4:
                        viewDetail(sel);
                        break;
                    case 5:
                        viewDetail(sel);
                        break;
                    case 6://protocol 전송
                        break;
                    case 7:
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
        switch (sel) {
            case 1:
                while (true) {
                    System.out.println("1. 교수");
                    System.out.println("2. 학생");
                    System.out.print("메뉴 선택: ");
                    switch (selDetail = selMenu()) {//protocol 전송
                        case 1:
                            return;
                        case 2:
                            return;
                        default:
                            System.out.println("다시 입력해주세요: ");
                            break;
                    }
                }
            case 2:
                while (true) {
                    System.out.println("1. 교과목 개설");
                    System.out.println("2. 교과목 수정");
                    System.out.println("3. 교과목 삭제");
                    System.out.print("메뉴 선택: ");

                    switch (selDetail = selMenu()) {//protocol
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
            case 4:
                while (true) {
                    System.out.print("학년 선택: ");

                    switch (selDetail = selMenu()) {//protocol 전송
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            return;
                        default:
                            System.out.println("다시 입력해주세요: ");
                            break;
                    }
                }
            case 5:
                while (true) {
                    System.out.println("1. 교수");
                    System.out.println("2. 학생");
                    System.out.print("메뉴 선택: ");

                    switch (selDetail = selMenu()) {//protocol 전송
                        case 1:
                            return;
                        case 2:
                            return;
                        default:
                            System.out.println("다시 입력해주세요: ");
                            break;
                    }
                }
        }
    }
}
