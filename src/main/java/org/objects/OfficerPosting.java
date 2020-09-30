package org.objects;

public class OfficerPosting {
    public String name;
    public Integer marksSecuredInUpscExam;
    public Integer qualifyingYear;
    public Integer upscRank;

    // no system.out.println statement
    public String getPostingStatus()
    {
        if(upscRank >=1 && upscRank <= 100)
        {
            return "IAS";
        }

        if(upscRank >=101 && upscRank <= 200)
        {
            return "IFS";
        }

        if(upscRank >=201 && upscRank <= 300)
        {
            return "IRS";
        }

        if(upscRank >=301 )
        {
            return "Not Qualified";
        }

        return "Not Attempted";
    }

}
