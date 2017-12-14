package stm;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;

public class StaticTemplateMethods {

    public static void downloadFileByUrl(String from, String to) {
        try {
            OutputStream outputStream = null;
            URL url = new URL(from);
            URLConnection connection = url.openConnection();
            InputStream inputStream = connection.getInputStream();
            File file = new File(to);
            Files.copy(inputStream, file.toPath());
        } catch (IOException e){
        }
    }
}
