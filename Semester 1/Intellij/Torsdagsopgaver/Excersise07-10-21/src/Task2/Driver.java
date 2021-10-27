package Task2;

public class Driver {
    private String name;
    private int age;
    private boolean isFemale;
    private int skillLevel;
    private float weight;
    private boolean isWearingSunGlasses;
    private int goldChains;

    public Driver(String name, int age, boolean isFemale, int skillLevel, float weight, boolean isWearingSunGlasses, int goldChains) {
        this.name = name;
        this.age = age;
        this.isFemale = isFemale;
        this.skillLevel = skillLevel;
        this.weight = weight;
        this.isWearingSunGlasses = isWearingSunGlasses;
        this.goldChains = goldChains;
    }

    @Override
    public String toString(){
        String s;
        s = "Name:"+name +" - Age:" + age+" - Weight:"+weight+"Kg. - Skill:"+skillLevel+"\n";
        return s;
    }
}
