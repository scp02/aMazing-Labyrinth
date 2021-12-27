package model;

import java.io.Serializable;

public class Card implements Serializable {

    // name of the treasure that the class displays
    private String treasure;
    private boolean isTaken = false;

    // the name of the file that corresponds with this card
    private String fileName;

    public Card(String treasure) {
        super();
        this.treasure = treasure;
        fileName = getFileName();
    }

    public String getTreasure() {
        return treasure;
    }

    public void setTreasure(String treasure) {
        this.treasure = treasure;
    }

    public boolean getIsTaken() {
        return isTaken;
    }

    public void setIsTaken(boolean taken) {
        isTaken = taken;
    }

    // returns file name of this card after determining whether it has been taken by user.
    public String getFileName() {
        if (isTaken)
            return "images/CardFound.png";
        else
            return "images/Card" + treasure.substring(0, 1).toUpperCase() + treasure.substring(1) + ".png";
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "Card{" + "treasure='" + treasure + '\'' + ", isTaken=" + isTaken + ", fileName='" + fileName + '\'' + '}';
    }
}