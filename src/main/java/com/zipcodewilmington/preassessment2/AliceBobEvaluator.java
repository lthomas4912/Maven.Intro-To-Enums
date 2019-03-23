package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {


    private String name;

    AliceBobEvaluator(String name) {
        this.name = name.toUpperCase();
    }

    public boolean isAlice() {
        return this.name.equals(AliceBobEnum.ALICE.name());
    }

    public boolean isBob() {
        return this.name.equals(AliceBobEnum.BOB.name());

    }
}
