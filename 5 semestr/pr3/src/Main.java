public class Main {
    public static void main(String[] args) {
        ColorModel rgbModel = new RGBColorModel();
        ColorModel cmykModel = new CMYKColorModel();
        ColorModel hsvModel = new HSVColorModel();

        ColorManager colorManager = new GraphicEditorColorManager(rgbModel);

        // Используем RGB
        colorManager.setColor(255, 0, 0);
        System.out.println("цвет: " + colorManager.getColor());

        // Переключаемся на CMYK
        colorManager.setColorModel(cmykModel);
        colorManager.setColor(0, 100, 100, 0);
        System.out.println("цвет: " + colorManager.getColor());

        // Переключаемся на HSV
        colorManager.setColorModel(hsvModel);
        colorManager.setColor(360, 100, 100);
        System.out.println("цвет: " + colorManager.getColor());
    }
}