package CSVScaner;

public class City {
    private int id;
    private String name;
    private String region;
    private String district;
    private long populetion;
    private String foundation;

    public City(int id, String name, String region, String district,
                long populetion) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.district = district;
        this.populetion = populetion;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", populetion=" + populetion +
                ", foundation='" + foundation + '\'' +
                '}';
    }
}
