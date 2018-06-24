
package masterlock;

import java.util.Arrays;

public class CombinationDisk
{
    private String[] combination;                 // list of UDLR movements
    private String location;                    // position (top, bottom, left, right)
    private int[] orientation;                  // orientation of combination disk

    public CombinationDisk(String placement, String code)
    {
        location = placement.toUpperCase();
        orientation = new int[2];
        setOrientation(code);
    }

    public CombinationDisk(String placement)
    {
        location = placement.toUpperCase();
        orientation = new int[] {0,0};
    }

    public void setOrientation(String input)
    {
        combination = input.split("");
        if(location.equals("RIGHT"))
            for(String x : combination)
            {
                if(orientation[1]==0)
                {
                    if(x.equals("R"))
                        orientation[0]++;
                    if(x.equals("U"))
                        orientation[1]++;
                    if(x.equals("D")){
                        orientation[0]++;
                        orientation[1]--;}
                }
                else if(orientation[1]==1)
                {
                    if(x.equals("R")){
                        orientation[0]++;
                        orientation[1]--;}
                    if(x.equals("U"))
                        orientation[0]++;
                    if(x.equals("D")){
                        orientation[0]++;
                        orientation[1]=-1;}
                }
                else if(orientation[1]==-1)
                {
                    if(x.equals("R"))
                        orientation[1]++;
                    if(x.equals("U"))
                        orientation[1]=1;
                    if(x.equals("D"))
                        orientation[0]++;
                }
            }                               //end RIGHT combination disk

        else if(location.equals("LEFT"))
            for(String x : combination)
            {
                if(orientation[1]==0)
                {
                    if(x.equals("L"))
                        orientation[0]++;
                    if(x.equals("U")){
                        orientation[0]++;
                        orientation[1]--;}
                    if(x.equals("D"))
                        orientation[1]++;
                }
                else if(orientation[1]==1)
                {
                    if(x.equals("L")){
                        orientation[0]++;
                        orientation[1]--;}
                    if(x.equals("U")){
                        orientation[0]++;
                        orientation[1]=-1;}
                    if(x.equals("D"))
                        orientation[0]++;
                }
                else if(orientation[1]==-1)
                {
                    if(x.equals("L"))
                        orientation[1]++;
                    if(x.equals("U"))
                        orientation[0]++;
                    if(x.equals("D"))
                        orientation[1]=1;
                }
            }                               //end LEFT combination disk

        else if(location.equals("TOP"))
            for(String x : combination)
            {
                if(orientation[1]==0)
                {
                    if(x.equals("U"))
                        orientation[0]++;
                    if(x.equals("L"))
                        orientation[1]++;
                    if(x.equals("R")){
                        orientation[0]++;
                        orientation[1]--;}
                }
                else if(orientation[1]==1)
                {
                    if(x.equals("U")){
                        orientation[0]++;
                        orientation[1]--;}
                    if(x.equals("L"))
                        orientation[0]++;
                    if(x.equals("R")){
                        orientation[0]++;
                        orientation[1]=-1;}
                }
                else if(orientation[1]==-1)
                {
                    if(x.equals("U"))
                        orientation[1]++;
                    if(x.equals("L"))
                        orientation[1]=1;
                    if(x.equals("R"))
                        orientation[0]++;
                }
            }                               //end TOP combination disk

        else if(location.equals("BOTTOM"))
            for(String x : combination)
            {
                if(orientation[1]==0)
                {
                    if(x.equals("D"))
                        orientation[0]++;
                    if(x.equals("R"))
                        orientation[1]++;
                    if(x.equals("L")){
                        orientation[0]++;
                        orientation[1]--;}
                }
                else if(orientation[1]==1)
                {
                    if(x.equals("D")){
                        orientation[0]++;
                        orientation[1]--;}
                    if(x.equals("R"))
                        orientation[0]++;
                    if(x.equals("L")){
                        orientation[0]++;
                        orientation[1]=-1;}
                }
                else if(orientation[1]==-1)
                {
                    if(x.equals("D"))
                        orientation[1]++;
                    if(x.equals("R"))
                        orientation[1]=1;
                    if(x.equals("L"))
                        orientation[0]++;
                }
            }                               //end BOTTOM combination disk
        orientation[0]%=5;
    }

    public int[] getOrientation()
    {
        return orientation;
    }

    public int[] getOrientation(String input)
    {
        combination = input.split("");
        if(location.equals("RIGHT"))
            for(String x : combination)
            {
                if(orientation[1]==0)
                {
                    if(x.equals("R"))
                        orientation[0]++;
                    if(x.equals("U"))
                        orientation[1]++;
                    if(x.equals("D")){
                        orientation[0]++;
                        orientation[1]--;}
                }
                else if(orientation[1]==1)
                {
                    if(x.equals("R")){
                        orientation[0]++;
                        orientation[1]--;}
                    if(x.equals("U"))
                        orientation[0]++;
                    if(x.equals("D")){
                        orientation[0]++;
                        orientation[1]=-1;}
                }
                else if(orientation[1]==-1)
                {
                    if(x.equals("R"))
                        orientation[1]++;
                    if(x.equals("U"))
                        orientation[1]=1;
                    if(x.equals("D"))
                        orientation[0]++;
                }
            }                               //end RIGHT combination disk

        else if(location.equals("LEFT"))
            for(String x : combination)
            {
                if(orientation[1]==0)
                {
                    if(x.equals("L"))
                        orientation[0]++;
                    if(x.equals("U")){
                        orientation[0]++;
                        orientation[1]--;}
                    if(x.equals("D"))
                        orientation[1]++;
                }
                else if(orientation[1]==1)
                {
                    if(x.equals("L")){
                        orientation[0]++;
                        orientation[1]--;}
                    if(x.equals("U")){
                        orientation[0]++;
                        orientation[1]=-1;}
                    if(x.equals("D"))
                        orientation[0]++;
                }
                else if(orientation[1]==-1)
                {
                    if(x.equals("L"))
                        orientation[1]++;
                    if(x.equals("U"))
                        orientation[0]++;
                    if(x.equals("D"))
                        orientation[1]=1;
                }
            }                               //end LEFT combination disk

        else if(location.equals("TOP"))
            for(String x : combination)
            {
                if(orientation[1]==0)
                {
                    if(x.equals("U"))
                        orientation[0]++;
                    if(x.equals("L"))
                        orientation[1]++;
                    if(x.equals("R")){
                        orientation[0]++;
                        orientation[1]--;}
                }
                else if(orientation[1]==1)
                {
                    if(x.equals("U")){
                        orientation[0]++;
                        orientation[1]--;}
                    if(x.equals("L"))
                        orientation[0]++;
                    if(x.equals("R")){
                        orientation[0]++;
                        orientation[1]=-1;}
                }
                else if(orientation[1]==-1)
                {
                    if(x.equals("U"))
                        orientation[1]++;
                    if(x.equals("L"))
                        orientation[1]=1;
                    if(x.equals("R"))
                        orientation[0]++;
                }
            }                               //end TOP combination disk

        else if(location.equals("BOTTOM"))
            for(String x : combination)
            {
                if(orientation[1]==0)
                {
                    if(x.equals("D"))
                        orientation[0]++;
                    if(x.equals("R"))
                        orientation[1]++;
                    if(x.equals("L")){
                        orientation[0]++;
                        orientation[1]--;}
                }
                else if(orientation[1]==1)
                {
                    if(x.equals("D")){
                        orientation[0]++;
                        orientation[1]--;}
                    if(x.equals("R"))
                        orientation[0]++;
                    if(x.equals("L")){
                        orientation[0]++;
                        orientation[1]=-1;}
                }
                else if(orientation[1]==-1)
                {
                    if(x.equals("D"))
                        orientation[1]++;
                    if(x.equals("R"))
                        orientation[1]=1;
                    if(x.equals("L"))
                        orientation[0]++;
                }
            }                               //end BOTTOM combination disk
        orientation[0]%=5;
        return orientation;
    }

    public boolean equals(CombinationDisk disk)
    {
        return Arrays.equals(orientation,disk.getOrientation());
    }

    @Override
    public String toString()
    {
        return ("["+orientation[0]+", "+orientation[1]+"]");
    }


}
