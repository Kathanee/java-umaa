package org.objects;

public class OfficerPostingMain {
    public static void main(String[] args) {



        OfficerPosting // Type Of Reference Variable To The Object
                officerPostingJunaid // This is reference variable =
                = new // java keyword, to create object
                OfficerPosting() ; // invoking the constructor to create object of type OfficerPosting ;

        officerPostingJunaid.name = "Junaid Ahemad";
        officerPostingJunaid. marksSecuredInUpscExam = 1077;
        officerPostingJunaid.qualifyingYear = 2018;
        officerPostingJunaid.upscRank = 3;

        System.out.println(officerPostingJunaid.name + " is posted as " + officerPostingJunaid.getPostingStatus()); // behaviour

        //----------------------------------------------------------------------
        OfficerPosting  officerPostingKanisk  = new OfficerPosting();
        officerPostingKanisk .name = "Kanisk Kataria";
        officerPostingKanisk . marksSecuredInUpscExam = 1121;
        officerPostingKanisk  .qualifyingYear= 2018;
        officerPostingKanisk  .upscRank = 1;

        System.out.println(officerPostingKanisk.name + " is posted as " + officerPostingKanisk .getPostingStatus()); // behaviour

        // --------------------------------------------------------------------
        System.out.println( officerPostingJunaid.getClass());


        System.out.println(officerPostingJunaid == officerPostingKanisk); // false
        System.out.println("Junaid Ahemad: "+officerPostingJunaid.hashCode());
        System.out.println("Kanisk Kataria: "+officerPostingKanisk.hashCode());

        OfficerPosting ofiicerPostingJunaidAnotherVariable = officerPostingJunaid;

        System.out.println(ofiicerPostingJunaidAnotherVariable== officerPostingJunaid); // true

        System.out.println(officerPostingJunaid.hashCode());
        System.out.println(ofiicerPostingJunaidAnotherVariable.hashCode());

    }
}
