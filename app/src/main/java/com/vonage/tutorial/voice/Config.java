package com.vonage.tutorial.voice;

public class Config {

    public static User getAlice() {
        return new User(
                "Alice",
                "ALICE_TOKEN" // TODO: "set Alice JWT token"
        );
    }

    public static User getBob() {
        return new User(
                "Bob",
                "BOB_TOKEN" // TODO: "set Bob JWT token"
        );
    }
}
