class HSVColorModel implements ColorModel {
    private int hue;
    private int saturation;
    private int value;

    @Override
    public void setColor(int... values) {
        if (values.length == 3) {
            this.hue = values[0];
            this.saturation = values[1];
            this.value = values[2];
        } else {
            System.out.println("ERR");
        }
    }

    @Override
    public String getColor() {
        return "HSV(" + hue + ", " + saturation + ", " + value + ")";
    }
}
