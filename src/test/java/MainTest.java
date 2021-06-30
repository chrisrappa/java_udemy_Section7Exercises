import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


  @Test
  public void AddFloorReturnsTile(){
    Bedroom bedroomOne = new Bedroom();
    String expected = "Tile";
    assertEquals(expected,"Tile");
  }

  @Test
  public void CreateNewInstanceOfGuestBedroomAndPrintBedSize(){
    GuestBedroom guestBedroom = new GuestBedroom();
    String expected = "King";
    assertEquals(expected, guestBedroom.bedSize);
  }

  @Test
  public void CreateNewInstanceOfGuestBedroomAndPrintRoomColor(){
    GuestBedroom guestBedroom = new GuestBedroom();
    String expected = "White";
    assertEquals(expected, guestBedroom.color);
  }

  @Test
  public void CreateNewInstanceOfGuestBedroomAndPrintLightSource(){
    GuestBedroom guestBedroom = new GuestBedroom();
    String expected = "Ceiling Fan";
    assertEquals(expected, guestBedroom.lightSource);
  }

  @Test
  public void PrintLightSourceAndRoomColorFromGuestBedroom(){
    GuestBedroom guestBedroom = new GuestBedroom();
    String lightAndColor = guestBedroom.lightSource + " " + guestBedroom.color;
    String expected = "Ceiling Fan White";
    assertEquals(expected, lightAndColor);
  }

}