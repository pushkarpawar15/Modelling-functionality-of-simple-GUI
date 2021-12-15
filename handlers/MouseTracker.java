package handlers;

import java.util.ArrayList;

public class MouseTracker {
    public void addMouseWatcher(MouseWatcher m) // func to add widgets in registered widgets list
    {
        mws.add(m);
    }

    public void processEvent(int x, int y, boolean isClicked) // MouseClick or mouse hover events are processed here.
    {
        if (x >= 0 && y >= 0) {
            for (MouseWatcher m : mws) {
                m.moveTo(x, y);
            }
        }
        if (isClicked) {
            for (MouseWatcher m : mws) {
                m.onClick();
            }
        }
    }

    private ArrayList<MouseWatcher> mws = new ArrayList<MouseWatcher>(); // List to store registered widgets
}