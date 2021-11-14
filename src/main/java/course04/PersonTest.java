package course04;


public class PersonTest implements Comparable<PersonTest>{
    int height;
    String name;

    public PersonTest(int height, String name) {
        this.height = height;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(PersonTest other) {
        return Integer.compare(
                this.getHeight(),
                other.getHeight()
                );
    }

    @Override
    public String toString() {
        return "PersonTest{" +
                "height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
