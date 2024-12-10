class RGBColorModel implements ColorModel {
    private int red;
    private int green;
    private int blue;
    @Override
    public void setColor(int... values) {
        if (values.length == 3) {
            this.red = values[0];
            this.green = values[1];
            this.blue = values[2];
        } else {
            System.out.println("ERR");
        }
    }

    @Override
    public String getColor() {
        return "RGB(" + red + ", " + green + ", " + blue + ")";
    }
}
