package com.trabajometodos.application;

import Los_View.IPAddressView;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route("")
@PWA(name = "My Application", shortName = "My App")
@CssImport("./styles/shared-styles.css")
public class MainView extends Div {

    public MainView() {
        add(new IPAddressView());
    }
}
