abstract class ColorManager {
    protected ColorModel colorModel;

    public ColorManager(ColorModel colorModel) {
        this.colorModel = colorModel;
    }

    public void setColorModel(ColorModel colorModel) {
        this.colorModel = colorModel;
    }

    public void setColor(int... values) {
        colorModel.setColor(values);
    }

    public String getColor() {
        return colorModel.getColor();
    }
}
