public class GuestBedroom extends Bedroom{

  String numWalls;
  String color;
  String floorType;
  String lightSource;
  String bedSize;
  String deskColor;
  String dresserColor;
  String TVSize;

  @Override
  public String addWalls(String numWalls) {
    return super.addWalls(numWalls);
  }

  @Override
  public String addPaint(String color) {
    return super.addPaint(color);
  }

  @Override
  public String addFloor(String floorType) {
    return super.addFloor(floorType);
  }

  @Override
  public String addLight(String lightSource) {
    return super.addLight(lightSource);
  }

  @Override
  public String addBed(String bedSize) {
    return super.addBed(bedSize);
  }

  @Override
  public String addDesk(String deskColor) {
    return super.addDesk(deskColor);
  }

  @Override
  public String addDresser(String dresserColor) {
    return super.addDresser(dresserColor);
  }

  @Override
  public String addTV(String TVSize) {
    return super.addTV(TVSize);
  }

  public GuestBedroom() {
    this.numWalls = addWalls("4");
    this.floorType = addFloor("Tile");
    this.color = addPaint("White");
    this.lightSource = addLight("Ceiling Fan");
    this.bedSize = addBed("King");
    this.TVSize = addTV("56in");
    this.deskColor = addDesk("White");
    this.dresserColor = addDresser("White");
  }


}
