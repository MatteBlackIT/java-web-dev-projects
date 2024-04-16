package org.launchcode;

import org.junit.jupiter.api.Test;

import java.beans.Transient;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    @Test
    public void launchCodeTrueBraxI() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void launchCodeTrueBraxII() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void launchCodeTrueBraxIII () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void launchCodeTrueBraxIV () {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void launchCodeTrueBraxV () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void launchCodeFalseBraxI () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void launchCodeFalseBraxII () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void launchCodeFalseBraxIII () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void launchCodeFalseBraxIV () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
}

