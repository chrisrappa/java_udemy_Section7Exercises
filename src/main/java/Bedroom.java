public class Bedroom implements Room{

  @Override
  public String addWalls(String numWalls) {
    return numWalls;
  }

  @Override
  public String addPaint(String color) {
    return color;
  }

  @Override
  public String addFloor(String floorType) {
    return floorType;
  }

  @Override
  public String addLight(String lightSource) {
    return lightSource;
  }

  public String addBed(String bedSize){
    return(bedSize);
  };

  public String addDesk(String deskColor){
    return (deskColor);
  };

  public String addDresser(String dresserColor){
    return (dresserColor);
  };

  public String addTV(String TVSize){
    return (TVSize);
  };


}
