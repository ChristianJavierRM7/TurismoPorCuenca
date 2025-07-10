package clases;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GoogleMapsTester {

    public static String resolverRedireccion(String shortUrl) {
        try {
            HttpURLConnection con = (HttpURLConnection) new URL(shortUrl).openConnection();
            con.setInstanceFollowRedirects(false); // No sigue redirección automáticamente
            con.connect();

            // Obtener URL a la que se redirige
            String location = con.getHeaderField("Location");
            if (location == null) {
                // Si no hay redirección, devolver la URL original
                return shortUrl;
            }
            return location;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static double[] extraerCoordenadas(String url) {
        // Lista de patrones comunes en URLs de Google Maps para coordenadas
        String[] patrones = {
            "/search/(-?\\d+\\.\\d+),\\+?(-?\\d+\\.\\d+)",        // /search/lat,lon
            "/@(-?\\d+\\.\\d+),(-?\\d+\\.\\d+),",               // /@lat,lon,zoom
            "[?&]q=(-?\\d+\\.\\d+),(-?\\d+\\.\\d+)",             // parámetro q=lat,lon
            "/place/.*?/(-?\\d+\\.\\d+),(-?\\d+\\.\\d+)"         // /place/.../lat,lon
        };

        for (String patron : patrones) {
            Pattern pattern = Pattern.compile(patron);
            Matcher matcher = pattern.matcher(url);
            if (matcher.find()) {
                try {
                    double lat = Double.parseDouble(matcher.group(1));
                    double lon = Double.parseDouble(matcher.group(2));
                    return new double[]{lat, lon};
                } catch (NumberFormatException e) {
                    // Ignorar y probar siguiente patrón
                }
            }
        }

        // Si no encuentra coordenadas
        return null;
    }

    public static void main(String[] args) {
        // Ejemplos para probar con distintos tipos de URLs de Google Maps
        String[] urls = {
            "https://maps.app.goo.gl/dgVhq1fWJSAZkKv27",                                 // URL corta (redirige)
            "https://www.google.com/maps/search/37.4219999,+-122.0840575",               // /search/lat,lon
            "https://www.google.com/maps/@37.4219999,-122.0840575,15z",                  // /@lat,lon,zoom
            "https://www.google.com/maps?q=37.4219999,-122.0840575",                     // parámetro q
            "https://www.google.com/maps/place/Some+Place/@37.4219999,-122.0840575,17z"  // /place/.../@lat,lon,...
        };

        for (String shortUrl : urls) {
            System.out.println("Probando URL: " + shortUrl);
            String expandedUrl = resolverRedireccion(shortUrl);

            if (expandedUrl == null) {
                System.out.println("❌ No se pudo resolver la URL.");
                continue;
            }

            System.out.println("URL expandida: " + expandedUrl);

            double[] coords = extraerCoordenadas(expandedUrl);
            if (coords != null) {
                System.out.println("Latitud: " + coords[0]);
                System.out.println("Longitud: " + coords[1]);
            } else {
                System.out.println("❌ No se encontraron coordenadas en la URL.");
            }

            System.out.println("-------------------------------------------------");
        }
    }
}
