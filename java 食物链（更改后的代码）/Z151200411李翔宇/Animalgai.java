package Animegai;

public abstract class Animalgai {
    private String species;
    private int rank;
    private boolean life;

    Animalgai(String a) {
        setSpecies(a);
        JudgeRank();
        this.life = true;
    }

	String getSpecies() {
        return species;
    }

	void setSpecies(String species) {
        this.species = species;
    }

	int getRank() {
        return rank;
    }

	void setRank(int rank) {
        this.rank = rank;
    }

	boolean getLife() {
        return life;
    }

	void setLife(boolean life) {
        this.life = life;
    }

	void JudgeRank() {
        switch (species) {
            case "Ê¨×Ó":
                this.setRank(1);
                break;
            case "ÀÇ":
                this.setRank(2);
                break;
            case "ÍÃ×Ó":
                this.setRank(3);
                break;
        }
    }
}