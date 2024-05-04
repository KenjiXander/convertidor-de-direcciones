package convertidor;

import java.util.Scanner;

// Clase para manejar conversiones de direcciones IPv4
public class IPv4Converter {

    public static String binaryToDecimal(String binaryAddress) {
        StringBuilder decimalAddress = new StringBuilder();
        String[] octets = binaryAddress.split("\\s+");
        for (String octet : octets) {
            decimalAddress.append(Integer.parseInt(octet, 2)).append(".");
        }
        // Eliminar el último punto extra
        return decimalAddress.substring(0, decimalAddress.length() - 1);
    }

}