/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 *
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testNegate(){
    Picture arch = new Picture("arch.jpg");
    arch.explore();
    arch.negate();
    arch.explore();
  }
  public static void testGrayscale(){
    Picture blueMotorcycle = new Picture("blueMotorcycle.jpg");
    blueMotorcycle.explore();
    blueMotorcycle.grayscale();
    blueMotorcycle.explore();
  }

  public static void testMirrorVertical() {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  public static void testMirrorVerticalRightToLeft(){
    Picture butterfly1 = new Picture("butterfly1.jpg");
    butterfly1.explore();
    butterfly1.mirrorVerticalRightToLeft();
    butterfly1.explore();
  }

  public static void testmirrorHorizontalBotToTop() {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }

  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void testmirrorArms(){
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  public static void testmirroGull(){
    Picture gull = new Picture("seagull.jpg");
    gull.explore();
    gull.mirrorGull();
    gull.explore();
  }

  public static void testCollage()
  {
    Picture canvas = new Picture("blue-mark.jpg");
    canvas.explore();
    canvas.createCollage();
    canvas.explore();
    canvas.myCollage();
  }

  public static void testEdgeDetection()
  {
    //Picture swan = new Picture("swan.jpg");
    //swan.explore();
    //swan.edgeDetection(10);
    //swan.explore();
    Picture koala = new Picture("koala.jpg");
    koala.explore();
    koala.edgeDetection(10);
    koala.explore();
  }

  //
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testmirrorHorizontalBotToTop();
    //testmirrorArms();
    //testMirrorTemple();
    //testmirroGull();
    //testCollage();
    testEdgeDetection();
  }

}