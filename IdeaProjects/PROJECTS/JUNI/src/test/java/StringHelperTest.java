import static org.junit.Assert.*;

public class StringHelperTest {

    @org.junit.Test
    public void truncateAInFirst2Positions() {
        StringHelper stringHelper=new StringHelper();
        String str1=stringHelper.truncateAInFirst2Positions("AACD");
        String str2=stringHelper.truncateAInFirst2Positions("ACD");
        assertEquals(str2,str1);


    }

    @org.junit.Test
    public void areFirstAndLastTwoCharactersTheSame() {
    }
}