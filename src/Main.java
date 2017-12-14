import stm.StaticTemplateMethods;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StaticTemplateMethods.downloadFileByUrl("https://www.google.com/images/srpr/logo11w.png", "C:\\google1.jpg");
    }
}
