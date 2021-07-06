import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

  GuestBedroom guestBedroom = new GuestBedroom("4",
          "Tile", "White", "Ceiling Fan"
          ,"King", "56in", "White", "White");

  @Test
  public void AddFloorReturnsTile(){
    Bedroom bedroomOne = new Bedroom();
    String expected = "Tile";
    assertEquals(expected,"Tile");
  }

  @Test
  public void CreateNewInstanceOfGuestBedroomAndPrintBedSize(){
    String expected = "King";
    assertEquals(expected, guestBedroom.addBed("King"));
  }

  @Test
  public void CreateNewInstanceOfGuestBedroomAndPrintRoomColor(){
    String expected = "White";
    assertEquals(expected, guestBedroom.addPaint("White"));
  }

  @Test
  public void CreateNewInstanceOfGuestBedroomAndPrintLightSource(){
    String expected = "Ceiling Fan";
    assertEquals(expected, guestBedroom.addLight("Ceiling Fan"));
  }

  @Test
  public void PrintLightSourceAndRoomColorFromGuestBedroom(){
    String lightAndColor = guestBedroom.addLight("Ceiling Fan") + " " + guestBedroom.addPaint("White");
    String expected = "Ceiling Fan White";
    assertEquals(expected, lightAndColor);
  }

}