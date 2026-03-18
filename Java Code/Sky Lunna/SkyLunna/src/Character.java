public class Character {

    //Atributos
    private int Agility = 1;
    private int Charisma = 1;
    private int Strength = 1;
    private int Intelligence = 1;
    private int Perception = 1;
    private int Resistance = 1;
    private int Luck = 1;
    private int Race = 0;

    //Equações de Atributos
    private int HP = 5 + Resistance + Strength;
    private int Iniciativa = Perception + Agility + Dado.D12();
    private int Attack = Força + Arm.Weapon();

    //Bonus de Raça
    public Character(int Race){
        this.Race = Race;
        if(Race == 1){ //Humano
            Strength += 1;
            Intelligence += 1;
        }
        if(Race == 2){ //Demi Humano
            Perception += 1;
            Agility += 1;
        }
        if(Race == 3){ //Elfos
            Perception += 1;
            Intelligence += 1;
        }
        if(Race == 4){ //Ferais
            Strength += 1;
            Agility += 1;
        }
        if(Race == 5){ //Fadas
            Intelligence += 1;
            Charisma += 1;
        }
        if(Race == 6){ //Orcs
            Strength += 2;
        }
        if(Race == 7){ //Demi monstros
            Strength += 1;
            Perception += 1;
        }
        if(Race == 8){ //Meio Demônios
            Strength += 1;
            Charisma += 1;
        }
        if(Race == 9){ //Meio anjo
            Strength += 1;
            Agility += 1;
        }
    }

    public int getAgility() {
        return Agility;
    }

    public void setAgility(int agility) {
        Agility = agility;
    }

    public int getCharisma() {
        return Charisma;
    }

    public void setCharisma(int charisma) {
        Charisma = charisma;
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public void setIntelligence(int intelligence) {
        Intelligence = intelligence;
    }

    public int getPerception() {
        return Perception;
    }

    public void setPerception(int perception) {
        Perception = perception;
    }

    public int getResistance() {
        return Resistance;
    }

    public void setResistance(int resistance) {
        Resistance = resistance;
    }

    public int getLuck() {
        return Luck;
    }

    public void setLuck(int luck) {
        Luck = luck;
    }

    public int getRace() {
        return Race;
    }

    public void setRace(int race) {
        Race = race;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int hP) {
        HP = hP;
    }

    public int getIniciativa() {
        return Iniciativa;
    }

    public void setIniciativa(int iniciativa) {
        Iniciativa = iniciativa;
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int attack) {
        Attack = attack;
    }

    

}
