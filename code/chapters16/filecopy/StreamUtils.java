package filecopy;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamUtils {

    public static byte[] streamToByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int len = 0;

        while((len = inputStream.read(bytes)) != -1) {
            byteArrayOutputStream.write(bytes, 0, len);
        }
        byte[] array = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return array;

    }

    public static String streamToString(InputStream inputStream) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder stringBuilder = new StringBuilder();
        String line = "";

        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line + "\r\n");
        }
        return stringBuilder.toString();
    }

}
