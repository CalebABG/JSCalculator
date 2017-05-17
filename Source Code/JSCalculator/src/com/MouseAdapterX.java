package com;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public interface MouseAdapterX extends MouseListener {
    default void mouseClicked(MouseEvent e) {}
    default void mousePressed(MouseEvent e) {}
    default void mouseReleased(MouseEvent e) {}
    default void mouseEntered(MouseEvent e) {}
    default void mouseExited(MouseEvent e) {}
}

