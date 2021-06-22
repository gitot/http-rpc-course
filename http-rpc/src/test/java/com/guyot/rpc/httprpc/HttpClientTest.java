package com.guyot.rpc.httprpc;


import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class HttpClientTest {


    @Test
    void testGet() throws IOException {
        HttpClientBuilder builder = HttpClients.custom();
        CloseableHttpClient client = builder.build();
        HttpGet request = new HttpGet("http://localhost:8080/users/ping?userName=guyot");
        String resp = client.execute(request,(response) -> EntityUtils.toString(response.getEntity()));
        System.out.println(resp);
    }
}
