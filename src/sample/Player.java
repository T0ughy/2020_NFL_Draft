package sample;

import java.util.Date;

public class Player implements Comparable<Player>{
    String name;
    String college;
    String position;
    Date dateOfBirth;
    int jerseyNumber;
    int pick;
    int weight;
    int height;
    //picture
    /*
    URL iconURL = new URL("");
    iconURL is null when not found
    ImageIcon icon = new ImageIcon(iconURL);
    Image i = icon.getImage();

    Image i; is the variable that stores the the image, You can use it from there.
    I suggest that instead of saving the whole image in the database, just save the path to the image....
    */
    String draftTeam;

    public Player(String name, String college, String position, Date dateOfBirth,
                  int jerseyNumber, int pick, int weight, int height, String draftTeam) {
        this.name = name;
        this.college = college;
        this.position = position;
        this.dateOfBirth = dateOfBirth;
        this.jerseyNumber = jerseyNumber;
        this.pick = pick;
        this.weight = weight;
        this.height = height;
        this.draftTeam = draftTeam;
    }

    @Override
    public int compareTo(Player o) {
        if(this.pick>o.pick){
            return 1;
        }
        return -1;
    }
}