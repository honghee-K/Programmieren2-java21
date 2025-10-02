package WS25.Lek14;

public class Punkt
{
    public int x;
    public int y;
    public void verschiebePunkt(int zielX, int zielY) {
        if (zielX < 0 || zielY < 0) {
            throw new RuntimeException("x oder y darf nicht negative sein.");
        }
        if (zielX > 1920 || zielY > 1080) {
            throw new RuntimeException("x muss größer als 1920 sein oder y muss größer als 1080 sein.");
        }
        x = zielX;
        y = zielY;
    }

}
