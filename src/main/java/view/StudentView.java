package view;

import Network.Network;
import handler.ViewHandler;

public class StudentView extends View {
    public StudentView() {super();}

    public void view() {
        int sel = 0;
        while (true) {
            System.out.println("1. 개인정보 및 비밀번호 수정");
            System.out.println("2. 수강 신청/취소");
            System.out.println("3. 개설 교과목 목록(전학년) 조회");//학년별, 담당 교수별, 학년 + 담당 교수
            System.out.println("4. 선택 교과목 강의 계획서 조회");
            System.out.println("5. 본인 시간표 조회");
            System.out.println("6. 뒤로 가기");
            System.out.print("메뉴 선택: ");
            switch (sel = selMenu()) {
                case 1:
                case 2:
                    viewDetail(sel);
                case 3:
                    viewDetail(sel);
                case 4:
                case 5:
                    break;
                case 6:
                    backTO();
                    return;
                default:
                    System.out.println("다시 입력해주세요");
                    break;
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
            case 2:
                while (true) {
                    System.out.println("1. 수강 신청");
                    System.out.println("2. 수강 신청 삭제");
                    System.out.print("메뉴 선택: ");
                    switch (selDetail = selMenu()) {
                        case 1:
                            return;
                        case 2:
                            return;
                        default:
                            System.out.println("다시 입력해주세요");
                            break;
                    }
                }
            case 3:
                while (true) {
                    System.out.println("1. 개설 교과목 전 학년 조회");
                    System.out.println("2. 개설 교과목 선택 학년별 조회");
                    System.out.println("3. 개설 교과목 담당 교수별 조회");
                    System.out.println("4. 개설 교과목 학년, 담당 교수별 조회");
                    System.out.print("메뉴 선택");
                    switch (selDetail = selMenu()) {
                        case 1:
                            return;
                        case 2:
                            return;
                        case 3:
                            return;
                        default:
                            System.out.println("다시 입력해주세요: ");
                            break;
                    }
                }
        }
    }
}
