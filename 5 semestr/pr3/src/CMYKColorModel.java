class CMYKColorModel implements ColorModel {
    private int cyan;
    private int magenta;
    private int yellow;
    private int black;

    @Override
    public void setColor(int... values) {
        if (values.length == 4) {
            this.cyan = values[0];
            this.magenta = values[1];
            this.yellow = values[2];
            this.black = values[3];
        } else {
            System.out.println("ERR");
        }
    }

    @Override
    public String getColor() {
        return "CMYK(" + cyan + ", " + magenta + ", " + yellow + ", " + black + ")";
    }
}