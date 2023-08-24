package org.example.model;

import org.example.behaviour.SimpleSwim;

import java.util.Optional;

public class FishFactory {
    public static Fish getFish(String fishType, String swimType, Boolean turbo) {
        // TODO Add factory pattern
        String fishOption = Optional.ofNullable(fishType).orElseGet(() -> "");
        String swimOption = Optional.ofNullable(swimType).orElseGet(() -> "");
        Boolean turboOption = Optional.ofNullable(turbo).orElseGet(() -> false);
        return null;
    }
}
