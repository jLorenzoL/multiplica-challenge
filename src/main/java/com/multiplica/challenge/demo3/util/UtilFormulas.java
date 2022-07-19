package com.multiplica.challenge.demo3.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class UtilFormulas {

    public static double calculaDistanciaGeo(double lat1, double lng1, double lat2, double lng2){

        double radioTierra = 6371.009;
        double dLat = Math.toRadians(lat2 - lat1);
        double dLng = Math.toRadians(lng2 - lng1);
        double sindLat = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.sin(dLng / 2) * Math.sin(dLng / 2);
        double c = 2 * Math.atan2(Math.sqrt(sindLat), Math.sqrt(1 - sindLat));
        double r = radioTierra * c;
        return new Double(String.format("%.3f", r));

    }

    public double logarithm(double x){
        return Math.log10(x);
    }

    private float convertRadians (float value) {

        return (float) (( Math.PI / 180 ) * value);
    }

    public static long calcularDiferenciaEdad (String fechaA, String fechaB) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date firstDate = sdf.parse(fechaA);
        Date secondDate = sdf.parse(fechaB);

        long diff = secondDate.getTime() - firstDate.getTime();
        TimeUnit time = TimeUnit.DAYS;
//        return time.convert(diff, TimeUnit.MILLISECONDS);
        return diff / 12;
    }

}
