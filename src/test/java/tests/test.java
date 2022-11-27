package tests;
import org.testng.Assert;
import org.testng.annotations.Test;



public class test extends HelperBase {

   @Test
   public void searchSong() {
      app.getHelperBase().search();
      app.getHelperBase().searchJustifySong();
      Assert.assertTrue(app.getHelperBase().isSongPlaying());

   }


}




