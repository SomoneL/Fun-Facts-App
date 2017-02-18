package somoneletman.org.funfacts;


import java.util.Random;

public class FactBook {
    //Fields (Member Variables) - Properties about the object
    private String[] mFacts = new String[]{
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "When hippos are upset, their sweat turns red.",
            "If you lift a kangaroo’s tail off the ground it can’t hop.",
            "During your lifetime, you will produce enough saliva to fill two swimming pools.",
            "Bananas are curved because they grow towards the sun.",
            "The following can be read forward and backwards: Do geese see God?",
            "Sea otters hold hands when they sleep so they don’t drift away from each other.",
            "If you leave everything to the last minute… it will only take a minute.",
            "The Twitter bird actually has a name – Larry.",
            "It snowed in the Sahara desert for 30 minutes on the 18th February 1979.",
            "The average person walks the equivalent of twice around the world in a lifetime."

    };


    //Methods - Actions the object can take
    public String getFact(){
        String fact = "";
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }

}
