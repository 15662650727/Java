package com.websorket;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import org.json.JSONObject;

public class MsgWebSocketClient extends WebSocketClient{

    public MsgWebSocketClient(String url) throws URISyntaxException {
        super(new URI(url));
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onOpen(ServerHandshake shake) {
        // TODO Auto-generated method stub
        System.out.println("握手...");
        for(Iterator<String> it=shake.iterateHttpFields();it.hasNext();) {
            String key = it.next();
            System.out.println(key+":"+shake.getFieldValue(key));
        }
    }

    @Override
    public void onMessage(String paramString) {
        // TODO Auto-generated method stub
        System.out.println("接收到消息："+paramString);
        JSONObject obj = new JSONObject(paramString);
        String type = obj.getString("type");
        if(type.equals("recognized")){
            String error = obj.getString("error");
            JSONObject objPerson = obj.getJSONObject("person");
            String name = objPerson.getString("name");
            String description = objPerson.getString("description");
            String job_number = objPerson.getString("job_number");
            String department = objPerson.getString("department");
            System.out.println(String.format("name=%s,job_number=%s,department=%s,description=%s",name,job_number,department,description ));
        }
    }

    @Override
    public void onClose(int paramInt, String paramString, boolean paramBoolean) {
        // TODO Auto-generated method stub
        System.out.println("关闭...");
    }

    @Override
    public void onError(Exception e) {
        // TODO Auto-generated method stub
        System.out.println("异常"+e);

    }

    public static void main(String[] args) {
        try {
            new MsgWebSocketClient("ws://127.0.0.1:8099");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
