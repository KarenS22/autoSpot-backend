package idao;

import java.util.List;
import models.ParkingSpace;

public interface IParkingSpaceDAO {
    public void insertParkingSpace(ParkingSpace parkingSpace);
    public void updateParkingSpace(ParkingSpace parkingSpace);
    public ParkingSpace readParkingSpace (int id);
    public List<ParkingSpace> listParkingSpaces ();
    
}
