public class Car {

    // can only be accessed by this class when public
    private int door;
    private int wheels;
    private String model;
    private String engine;
    private String colour;


    // encapsulation
    // data are valid and accurate
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
    public String getModel() {
        return this.model;
    }
}
