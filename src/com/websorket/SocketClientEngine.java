package com.websorket;
import java.net.URISyntaxException;


public class SocketClientEngine{


    public static void main(String[] args) {
        try {
            WebClientEnum.CLIENT.initClient(new MsgWebSocketClient("ws://192.168.1.51:9000/video?url=rtsp%3A%2F%2Fadmin123%3Aadmin%40192.168.1.2%3A554"));
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
