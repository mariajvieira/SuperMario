package com.aor.supermario.viewer;

import com.aor.supermario.gui.GUI;
import com.aor.supermario.elements.Element;


public interface ElementViewer<T extends Element> {
    void draw(T element, GUI gui);
}
