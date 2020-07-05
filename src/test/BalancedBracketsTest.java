package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void bracketedStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Hello World]"));
    }

    @Test
    public void bracketEnclosedByStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Hello[]World"));
    }

    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void singleBracketReturnsFalse1() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void singleBracketStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Hello World]"));
    }

    @Test
    public void singleBracketStringReturnsFalse1() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Hello World"));
    }

    @Test
    public void noBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void noBracketStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Hello World"));
    }
    @Test
    public void backwardsBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void backwardsBracketsAfterBracketPairReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[hello world]["));
    }
    @Test
    public void backwardsBracketsBeforeBracketPairReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][hello world]"));
    }
    @Test
    public void alternatingBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }
    @Test
    public void nestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
}
