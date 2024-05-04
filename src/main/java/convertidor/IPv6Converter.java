package convertidor;

// Clase para manejar conversiones de direcciones IPv6
public class IPv6Converter {

    public static String binaryToHexadecimal(String binaryAddress) {
        StringBuilder hexAddress = new StringBuilder();
        String[] groups = binaryAddress.split("\\s+");
        for (String group : groups) {
            hexAddress.append(Integer.toHexString(Integer.parseInt(group, 2))).append(":");
        }
        // Eliminar el último dos puntos extra
        return hexAddress.substring(0, hexAddress.length() - 1);
    }
}