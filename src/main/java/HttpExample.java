import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpExample {
    public static void main(String[] args) throws IOException {

        HttpClient httpClient = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet("http://yandex.ru");
        HttpResponse httpResponse = httpClient.execute(httpGet);

        String body = EntityUtils.toString(httpResponse.getEntity());
        System.out.println(body);

        HttpPost httpPost = new HttpPost("http://yandex.ru");
        httpPost.setHeader("igor", "igor");
        httpResponse = httpClient.execute(httpPost);
        body = EntityUtils.toString(httpResponse.getEntity());
        System.out.println(body);
    }
}
