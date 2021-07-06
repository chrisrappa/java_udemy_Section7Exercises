public class GuestBedroom extends Bedroom{

  private String numWalls;
  private String color;
  private String floorType;
  private String lightSource;
  private String bedSize;
  private String deskColor;
  private String dresserColor;
  private String TVSize;

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

  public GuestBedroom(String numWalls,
                      String floorType,
                      String color,
                      String lightSource,
                      String bedSize,
                      String TVSize,
                      String deskColor,
                      String dresserColor) {

    this.numWalls = numWalls;
    this.floorType = floorType;
    this.color = color;
    this.lightSource = lightSource;
    this.bedSize = bedSize;
    this.TVSize = TVSize;
    this.deskColor = deskColor;
    this.dresserColor = dresserColor;
  }

  public String getNumWalls() {
    return numWalls;
  }

  public String getColor() {
    return color;
  }

  public String getFloorType() {
    return floorType;
  }

  public String getLightSource() {
    return lightSource;
  }

  public String getBedSize() {
    return bedSize;
  }

  public String getDeskColor() {
    return deskColor;
  }

  public String getDresserColor() {
    return dresserColor;
  }

  public String getTVSize() {
    return TVSize;
  }
}
