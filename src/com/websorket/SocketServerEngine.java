package com.websorket;

public class SocketServerEngine{


    public static void main(String[] args) {
        WebServerEnum.server.init(new MsgWebSocketServer(8099));
    }
}

