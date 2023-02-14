public class GenerateCharacter {
    public static String GenerateClass(){
        String c = "";
        int rand = (int)(Math.random() * 10);
        switch(rand){

            case 1: c = "Cleric";
            break;

            case 2: c = "Bard";
            break;

            case 3: c = "Wizard";
            break;

            case 4: c = "Rogue";
            break;

            case 5: c = "Artificer";
            break;

            case 6: c = "Sorcerer";
            break;

            case 7: c = "Druid";
            break;

            case 8: c = "Barbarian";
            break;

            case 9: c = "Ranger";
            break;

            default: c = "Fighter";
            break;
        }

        return c;
    }
    public static String GenerateRace(){
        String c = "";
        int rand = (int)(Math.random() * 16);
        switch(rand){

            case 1: c = "Dwarf";
            break;

            case 2: c = "Gnome";
            break;

            case 3: c = "Elf";
            break;

            case 4: c = "Half-Elf";
            break;

            case 5: c = "Dragonborn";
            break;

            case 6: c = "Firbolg";
            break;

            case 7: c = "Fire Genasi";
            break;

            case 8: c = "Water Genasi";
            break;

            case 9: c = "Half Orc";
            break;

            case 10: c = "Aarakocra";
            break;

            case 11: c = "Satyr";
            break;

            case 12: c = "Leonin";
            break;

            case 13: c = "Tiefling";
            break;

            case 14: c = "Centaur";
            break;

            case 15: c = "Changeling";
            break;

            default: c = "Human";
            break;
        }

        return c;
    }

    public static String generateLoot(){
        String loot = "";
        int rand = (int)(Math.random() * 11);
        switch(rand){
            case 1: loot = Integer.toString((int)(Math.random() * 99) + 1) + " gold pieces ";
            break;

            case 2: loot = "Flaming poisoning raging sword of doom";
            break;

            case 3: loot = "Dagger (d4)";
            break;

            case 4: loot = "Fork (d4)";
            break;

            case 5: loot = "Chain Shirt (AC: 13)";
            break;

            case 6: loot = "Brick o' Calling";
            break;

            case 7: loot = "Diamond (1,000 gp)";
            break;

            case 8: loot = "Healing Potion (D6 + Con)";
            break;

            case 9: loot = "Eggg";
            break;

            case 10: loot = "Wizard's spell book";
            break;

            default: loot = Integer.toString((int)(Math.random() * 99) + 1) + " silver pieces";
        }
        return loot;
    }

    public static String generateEncounter(){
        int rand = (int)(Math.random() * 11);
        String en = "";
        switch(rand){
            case 1: en = "A troll jumps out from under a bridge";
            break;

            case 2: en = "A squirrel jumps on a player's face";
            break;

            case 3: en = "A goblin";
            break;

            case 4: en = "The party comes upon a wizard tower";
            break;

            case 5: en = "A mirror is used to shine light in eyes";
            break;

            case 6: en = "Bar fight";
            break;

            case 7: en = "A player gets lassoed by a rancher";
            break;

            case 8: en = "A slapdash plan made by orc goes awry";
            break;

            case 9: en = "An imbroglio occurs in the town square";
            break;

            case 10: en = "A defenestrated body falls into your path";
            break;


            default: en = "Thieves sneak up while the party is sleeping";
        }
        return en;
    }
}
