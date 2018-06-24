/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package masterlock;

/**
 *
 * @author C13Zachary.Zeitlin
 */
public class CombinationLock
{
    private CombinationDisk TOP;
    private CombinationDisk BOTTOM;
    private CombinationDisk LEFT;
    private CombinationDisk RIGHT;
    private String combo;

    public CombinationLock()
    {
        TOP = new CombinationDisk("TOP");
        BOTTOM = new CombinationDisk("BOTTOM");
        LEFT = new CombinationDisk("LEFT");
        RIGHT = new CombinationDisk("RIGHT");
    }

    public CombinationLock(String combination)
    {
        combo = combination;
        TOP = new CombinationDisk("TOP", combination.toUpperCase());
        BOTTOM = new CombinationDisk("BOTTOM", combination.toUpperCase());
        LEFT = new CombinationDisk("LEFT", combination.toUpperCase());
        RIGHT = new CombinationDisk("RIGHT", combination.toUpperCase());
    }

    public void setCombination(String combination)
    {
        combo = combination;
        TOP = new CombinationDisk("TOP", combination.toUpperCase());
        BOTTOM = new CombinationDisk("BOTTOM", combination.toUpperCase());
        LEFT = new CombinationDisk("LEFT", combination.toUpperCase());
        RIGHT = new CombinationDisk("RIGHT", combination.toUpperCase());
    }

    public boolean equals(CombinationLock input)
    {
        return (TOP.equals(input.getTOP()) &&
                BOTTOM.equals(input.getBOTTOM()) &&
                LEFT.equals(input.getLEFT()) &&
                RIGHT.equals(input.getRIGHT()));
    }
    @Override
    public String toString()
    {
        return (""+TOP+", "+RIGHT+", "+BOTTOM+", "+LEFT);
    }

    public String toStringCombination()
    {
        return combo;
    }

    public CombinationDisk getTOP()
    {
        return TOP;
    }
    public CombinationDisk getBOTTOM()
    {
        return BOTTOM;
    }
    public CombinationDisk getLEFT()
    {
        return LEFT;
    }
    public CombinationDisk getRIGHT()
    {
        return RIGHT;
    }
}
