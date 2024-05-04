package Los_View;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("ip-address")
public class IPAddressView extends VerticalLayout {

    private TextField ipv4BinaryField;
    private TextField ipv6BinaryField;
    private TextArea resultArea;

    public IPAddressView() {
        ipv4BinaryField = new TextField("Introduce la dirección IPv4 en formato binario separado por espacios:");
        ipv6BinaryField = new TextField("Introduce la dirección IPv6 en formato binario separado por espacios:");
        resultArea = new TextArea("Resultados:");

        Button convertButton = new Button("Convertir");
        convertButton.addClickListener(event -> convertAddresses());

        add(ipv4BinaryField, ipv6BinaryField, convertButton, resultArea);
    }

    private void convertAddresses() {
        String ipv4Binary = ipv4BinaryField.getValue();
        String ipv6Binary = ipv6BinaryField.getValue();

        // Lógica para convertir direcciones IPv4 e IPv6
        String ipv4Decimal = IPAddressService.convertIPv4BinaryToDecimal(ipv4Binary);
        String ipv6Hexadecimal = IPAddressService.convertIPv6BinaryToHexadecimal(ipv6Binary);

        // Mostrar los resultados en el área de resultados
        resultArea.setValue("Dirección IPv4 en formato decimal: " + ipv4Decimal + "\n" +
                "Dirección IPv6 en formato hexadecimal: " + ipv6Hexadecimal);
    }
}
