package Los_View;

public class IPAddressService {

    public static String convertIPv4BinaryToDecimal(String binaryAddress) {
        StringBuilder decimalAddress = new StringBuilder();
        String[] octets = binaryAddress.split("\\s+");
        for (String octet : octets) {
            decimalAddress.append(Integer.parseInt(octet, 2)).append(".");
        }
        // Eliminar el último punto extra
        return decimalAddress.substring(0, decimalAddress.length() - 1);
    }

    public static String convertIPv6BinaryToHexadecimal(String binaryAddress) {
        StringBuilder hexAddress = new StringBuilder();
        String[] groups = binaryAddress.split("\\s+");
        for (String group : groups) {
            hexAddress.append(Integer.toHexString(Integer.parseInt(group, 2))).append(":");
        }
        // Eliminar el último dos puntos extra
        return hexAddress.substring(0, hexAddress.length() - 1);
    }
}
