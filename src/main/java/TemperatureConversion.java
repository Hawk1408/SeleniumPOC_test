import java.text.DecimalFormat;

public class TemperatureConversion {

    private static DecimalFormat df = new DecimalFormat("0");


    public static String convertKtoC(Float temp){
        return df.format(temp - 273.15);
    }

    public static String convertKtoF(Float temp){
        return df.format((Double.parseDouble(convertKtoC(temp)) * 9/5) + 32);
    }
}
