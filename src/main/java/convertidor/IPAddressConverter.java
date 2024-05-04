package convertidor;

import java.util.Scanner;

public class IPAddressConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca la dirección IPv4 en formato binario
        System.out.println("Introduce la dirección IPv4 en formato binario separado por espacios:");
        String ipv4Binary = scanner.nextLine();

        // Pedir al usuario que introduzca la dirección IPv6 en formato binario
        System.out.println("Introduce la dirección IPv6 en formato binario separado por espacios:");
        String ipv6Binary = scanner.nextLine();

        // Convertir direcciones IPv4 e IPv6
        String ipv4Decimal = IPv4Converter.binaryToDecimal(ipv4Binary);
        String ipv6Hexadecimal = IPv6Converter.binaryToHexadecimal(ipv6Binary);

        // Imprimir los resultados
        System.out.println("Dirección IPv4 en formato decimal: " + ipv4Decimal);
        System.out.println("Dirección IPv6 en formato hexadecimal: " + ipv6Hexadecimal);

        scanner.close();
    }
}