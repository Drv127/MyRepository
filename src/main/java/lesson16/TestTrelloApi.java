package lesson16;

import org.testng.annotations.Test;

import java.io.IOException;

public class TestTrelloApi {
   /* @Test
    public void testGetBoarLists() throws IOException{
        TrelloApiNew trelloApiNew= new TrelloApiNew();
        String boardList= trelloApiNew.getBoardsList("BDkZLEYc");
        System.out.println(boardList);
    }*/
    @Test
    public void testGetLabelLists2() throws IOException{
        TrelloApiNew trelloApiNew= new TrelloApiNew();
        String boardList= trelloApiNew.getLabeList("BDkZLEYc");
        System.out.println(boardList);
    }
}
