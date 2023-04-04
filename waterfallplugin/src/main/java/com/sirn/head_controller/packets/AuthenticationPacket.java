package com.sirn.head_controller.packets;

public class AuthenticationPacket {
    public String name;
    public AuthenticationKind kind;
    public String ip;

    @Override
    public String toString() {
        return "AuthenticationPacket{" +
                "name='" + name + '\'' +
                ", kind=" + kind +
                ", ip='" + ip + '\'' +
                '}';
    }
}
