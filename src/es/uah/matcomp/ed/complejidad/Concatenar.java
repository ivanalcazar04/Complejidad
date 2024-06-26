package es.uah.matcomp.ed.complejidad;
import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.ZoneId;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.XSSFWorkbook;

public class Concatenar {
    String excel = "";

    public Concatenar() {
        //Workbook datos = new XSSFWorkbook();
        //Sheet hoja = datos.createSheet("Hoja 1");
        File dir = new File(".");
        String ubi = dir.getAbsolutePath();
        String ubiSalida = ubi.substring(0, ubi.length() - 1) + "datos.xlsx";
        FileOutputStream opS;
    }

    public long getSegundos() {
        return LocalDateTime.now().atZone(ZoneId.systemDefault()).toEpochSecond();
    }
    public void testConcatenar(long pTiempo, String pCadena) {
        System.out.println("Ejecutando metodo de concatenacion");
        int cont = 0;
        String res = "";
        long tiempoA = getSegundos();
        long tiempoInicio = getSegundos();
        long tiempoTranscurrido = getSegundos() - tiempoInicio;
        while (tiempoTranscurrido < pTiempo) {
            res = res + pCadena;
            cont++;
            if (getSegundos() - tiempoA >= 1) {
                tiempoA = getSegundos();
                tiempoTranscurrido = getSegundos() - tiempoInicio;
                System.out.println(String.valueOf(cont) + "," + String.valueOf(tiempoTranscurrido));
            }
            tiempoTranscurrido = getSegundos() - tiempoInicio;
        }
    }

    public void testLista(long pTiempo, String pCadena) {
        System.out.println("Ejecutando metodo de lista");
        int cont = 0;
        StringBuilder res = new StringBuilder();
        long tiempoA = getSegundos();
        long tiempoInicio = getSegundos();
        long tiempoTranscurrido = getSegundos() - tiempoInicio;
        while (tiempoTranscurrido < pTiempo) {
            res.append(pCadena);
            cont++;
            if (getSegundos() - tiempoA >= 1) {
                tiempoA = getSegundos();
                tiempoTranscurrido = getSegundos() - tiempoInicio;
                System.out.println(String.valueOf(cont) + "," + String.valueOf(tiempoTranscurrido));
            }
            tiempoTranscurrido = getSegundos() - tiempoInicio;
        }

    }
}

