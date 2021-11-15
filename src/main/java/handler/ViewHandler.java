package handler;

import view.*;

public class ViewHandler {
    private View[] views;
    private static int pos;

    public ViewHandler() {
        views = new View[4];
        views[0] = new LoginView();
        views[1] = new ManagerView();
        views[2] = new ProfessorView();
        views[3] = new StudentView();
        pos = 0;
    }
    public void start() {
        views[pos].view();
    }

    public static void setPos(int newPos) {
        pos = newPos;
    }
}
