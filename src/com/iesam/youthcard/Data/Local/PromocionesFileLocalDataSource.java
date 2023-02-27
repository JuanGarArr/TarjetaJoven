package com.iesam.youthcard.Data.Local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.youthcard.Domain.Models.Promociones;
import com.iesam.youthcard.Domain.Models.Usuario;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PromocionesFileLocalDataSource {

    private static PromocionesFileLocalDataSource instance = null;

    private Gson gson = new Gson();

    private final Type typeAlumnList = new TypeToken<ArrayList<Promociones>>() {
    }.getType();

    private void PromocionesFileLocalDataSource() {
    }



    private void saveToFile(List<Promociones> promociones) {
        try {
            FileWriter myWriter = new FileWriter("promociones.txt");
            myWriter.write(gson.toJson(promociones));
            myWriter.close();
            System.out.println("contact guardado correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }
    }



    public List<Promociones> findAll() {
        try {
            File myObj = new File("promociones.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeAlumnList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return new ArrayList<Promociones>();
    }



    public static PromocionesFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new PromocionesFileLocalDataSource();
        }
        return instance;
    }
}
