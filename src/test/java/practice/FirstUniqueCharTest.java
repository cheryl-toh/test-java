package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstUniqueCharTest {

    @Test
    public void findsFirstUnique() {
        Assert.assertEquals(Questions.firstUniqueChar("swiss"), 'w');
    }

    @Test
    public void uniqueCharInTheMiddle() {
        Assert.assertEquals(Questions.firstUniqueChar("aabcc"), 'b');
    }

    @Test
    public void allCharactersRepeat() {
        Assert.assertEquals(Questions.firstUniqueChar("aabbcc"), '_');
    }

    @Test
    public void emptyString() {
        Assert.assertEquals(Questions.firstUniqueChar(""), '_');
    }

    @Test
    public void singleCharacter() {
        Assert.assertEquals(Questions.firstUniqueChar("a"), 'a');
    }

    @Test
    public void caseMatters() {
        Assert.assertEquals(Questions.firstUniqueChar("Aa"), 'A');
    }
}