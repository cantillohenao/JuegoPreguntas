package com.company;

import com.company.modelos.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<ArrayList<Pregunta>> preguntas = new ArrayList<>();
    private static ArrayList<Premio> premios = new ArrayList<>();
    private static ArrayList<Categoria> categorias = new ArrayList<>();
    private static ArrayList<Integer> puntajes = new ArrayList<>();
    public static void inicializarBaseDeDatos(){
        //Pregunta #1
        ArrayList<Opcion> opcionesPregunta1 = new ArrayList<>();
        Opcion opcion1 = new Opcion(1, "6");        //Correcta
        Opcion opcion2 = new Opcion(2, "3");
        Opcion opcion3 = new Opcion(3, "7");
        Opcion opcion4 = new Opcion(4, "20");

        opcionesPregunta1.add(opcion1) ;
        opcionesPregunta1.add(opcion2) ;
        opcionesPregunta1.add(opcion3) ;
        opcionesPregunta1.add(opcion4) ;


        Pregunta pregunta1 = new Pregunta(opcionesPregunta1, "¿Cuánto es 1 + 5 ?", 1);

        //Pregunta #2
        ArrayList<Opcion> opcionesPregunta2 = new ArrayList<>();
        Opcion opcion5 = new Opcion(1, "Europa");
        Opcion opcion6 = new Opcion(2, "Asia");
        Opcion opcion7 = new Opcion(3, "América");   //Correcta
        Opcion opcion8 = new Opcion(4, "África");

        opcionesPregunta2.add(opcion5) ;
        opcionesPregunta2.add(opcion6) ;
        opcionesPregunta2.add(opcion7) ;
        opcionesPregunta2.add(opcion8) ;
        Pregunta pregunta2 = new Pregunta(opcionesPregunta2, "¿En qué continente está Ecuador", 3);

        //Pregunta #3
        ArrayList<Opcion> opcionesPregunta3 = new ArrayList<>();
        Opcion opcion9 = new Opcion(1, "Aves");
        Opcion opcion10 = new Opcion(2, "Mamiferos");
        Opcion opcion11 = new Opcion(3, "Reptiles");
        Opcion opcion12 = new Opcion(4, "Peces");

        opcionesPregunta3.add(opcion9);
        opcionesPregunta3.add(opcion10);
        opcionesPregunta3.add(opcion11);
        opcionesPregunta3.add(opcion12);
        Pregunta pregunta3 = new Pregunta(opcionesPregunta3,"¿Que tipo de animal son las ballenas?",2);

        //Pregunta #4
        ArrayList<Opcion> opcionesPregunta4 = new ArrayList<>();
        Opcion opcion13 = new Opcion(1, "Amarillo, Azul, Verde");
        Opcion opcion14 = new Opcion(2, "Verde, Azul");
        Opcion opcion15 = new Opcion(3, "Blanco, Rojo, Azul");
        Opcion opcion16 = new Opcion(4, "Amarillo, Azul, Rojo");

        opcionesPregunta4.add(opcion13);
        opcionesPregunta4.add(opcion14);
        opcionesPregunta4.add(opcion15);
        opcionesPregunta4.add(opcion16);

        Pregunta pregunta4 = new Pregunta(opcionesPregunta4, "¿Cuáles son los colores de la bandera de Colombia",4);

        //Pregunta # 5
        ArrayList<Opcion> opcionesPregunta5 = new ArrayList<>();
        Opcion opcion17 = new Opcion(1, "Plutón");
        Opcion opcion18 = new Opcion(2, "Tierra");       //Correcta
        Opcion opcion19 = new Opcion(3, "Martes");
        Opcion opcion20 = new Opcion(4, "Júpiter");

        opcionesPregunta5.add(opcion17);
        opcionesPregunta5.add(opcion18);
        opcionesPregunta5.add(opcion19);
        opcionesPregunta5.add(opcion20);
        Pregunta pregunta5 = new Pregunta(opcionesPregunta5, "¿Cuál es el tercer planeta en el sistema solar",2);

        //Pregunta #6
        ArrayList<Opcion> opcionesPregunta6 = new ArrayList<>();
        Opcion opcion21 = new Opcion(1, "Italia");       //Correcta
        Opcion opcion22 = new Opcion(2, "Inglaterra");
        Opcion opcion23 = new Opcion(3, "Mexico");
        Opcion opcion24 = new Opcion(4, "Francia");

        opcionesPregunta6.add(opcion21);
        opcionesPregunta6.add(opcion22);
        opcionesPregunta6.add(opcion23);
        opcionesPregunta6.add(opcion24);
        Pregunta pregunta6 = new Pregunta(opcionesPregunta6, "¿Qué país tiene forma de bota?",1);

        //Pregunta #7
        ArrayList<Opcion> opcionesPregunta7 = new ArrayList<>();
        Opcion opcion25 = new Opcion(1, "Rusia");
        Opcion opcion26 = new Opcion(2, "Inglaterra");
        Opcion opcion27 = new Opcion(3, "China");
        Opcion opcion28 = new Opcion(4, "Estados Unidos");

        opcionesPregunta7.add(opcion25);
        opcionesPregunta7.add(opcion26);
        opcionesPregunta7.add(opcion27);
        opcionesPregunta7.add(opcion28);
        Pregunta pregunta7 = new Pregunta(opcionesPregunta7, "¿Cuál es el pais más poblado del planeta Tierra?",3);

        //Pregunta #8
        ArrayList<Opcion> opcionesPregunta8 = new ArrayList<>();
        Opcion opcion29 = new Opcion(1, "Rusia");
        Opcion opcion30 = new Opcion(2, "Inglaterra");
        Opcion opcion31 = new Opcion(3, "China");
        Opcion opcion32 = new Opcion(4, "Estados Unidos");

        opcionesPregunta8.add(opcion29);
        opcionesPregunta8.add(opcion30);
        opcionesPregunta8.add(opcion31);
        opcionesPregunta8.add(opcion32);
        Pregunta pregunta8 = new Pregunta(opcionesPregunta8, "¿Cuál es el país más grande del mundo?",1);

        //Pregunta #9
        ArrayList<Opcion> opcionesPregunta9 = new ArrayList<>();
        Opcion opcion33 = new Opcion(1, "6");
        Opcion opcion34 = new Opcion(2, "4");
        Opcion opcion35 = new Opcion(3, "2");
        Opcion opcion36 = new Opcion(4, "8");

        opcionesPregunta9.add(opcion33);
        opcionesPregunta9.add(opcion34);
        opcionesPregunta9.add(opcion35);
        opcionesPregunta9.add(opcion36);
        Pregunta pregunta9 = new Pregunta(opcionesPregunta9,"¿Cuántas patas tiene una araña",4);

        //Pregunta #10
        ArrayList<Opcion> opcionesPregunta10 = new ArrayList<>();
        Opcion opcion37 = new Opcion(1, "Francia");
        Opcion opcion38 = new Opcion(2, "España");
        Opcion opcion39 = new Opcion(3, "Argentina");
        Opcion opcion40 = new Opcion(4, "Colombia");

        opcionesPregunta10.add(opcion37);
        opcionesPregunta10.add(opcion38);
        opcionesPregunta10.add(opcion39);
        opcionesPregunta10.add(opcion40);
        Pregunta pregunta10 = new Pregunta(opcionesPregunta10, "¿De qué país es el futbolista Lionel Messi?",3);

        //Pregunta #11
        ArrayList<Opcion> opcionesPregunta11 = new ArrayList<>();
        Opcion opcion41 = new Opcion(1, "Filosofía");
        Opcion opcion42 = new Opcion(2, "Cartografía");
        Opcion opcion43 = new Opcion(3, "Geología");
        Opcion opcion44 = new Opcion(4, "Naturales");

        opcionesPregunta11.add(opcion41);
        opcionesPregunta11.add(opcion42);
        opcionesPregunta11.add(opcion43);
        opcionesPregunta11.add(opcion44);
        Pregunta pregunta11 = new Pregunta(opcionesPregunta11, "¿Cómo se llama la ciencia que estudia los mapas?",2);

        //Pregunta #12
        ArrayList<Opcion> opcionesPregunta12 = new ArrayList<>();
        Opcion opcion45 = new Opcion(1, "Polo Norte");
        Opcion opcion46 = new Opcion(2, "Antártida");
        Opcion opcion47 = new Opcion(3, "Polo Sur");
        Opcion opcion48 = new Opcion(4, "Noruega");

        opcionesPregunta12.add(opcion45);
        opcionesPregunta12.add(opcion46);
        opcionesPregunta12.add(opcion47);
        opcionesPregunta12.add(opcion48);
        Pregunta pregunta12 = new Pregunta(opcionesPregunta12, "¿Cuál es el lugar mas frio del mundo?",2);

        //Pregunta #13
        ArrayList<Opcion> opcionesPregunta13 = new ArrayList<>();
        Opcion opcion49 = new Opcion(1, "Pulmones");
        Opcion opcion50 = new Opcion(2, "Corazón");
        Opcion opcion51 = new Opcion(3, "Cerebro");
        Opcion opcion52 = new Opcion(4, "Pancreas");

        opcionesPregunta13.add(opcion49);
        opcionesPregunta13.add(opcion50);
        opcionesPregunta13.add(opcion51);
        opcionesPregunta13.add(opcion52);
        Pregunta pregunta13 = new Pregunta(opcionesPregunta13, "Qué órgano del cuerpo humano consume más energía",3);

        //Pregunta #14
        ArrayList<Opcion> opcionesPregunta14 = new ArrayList<>();
        Opcion opcion53 = new Opcion(1, "H2O2");
        Opcion opcion54 = new Opcion(2, "H2O");
        Opcion opcion55 = new Opcion(3, "CO2");
        Opcion opcion56 = new Opcion(4, "H2S");

        opcionesPregunta14.add(opcion53);
        opcionesPregunta14.add(opcion54);
        opcionesPregunta14.add(opcion55);
        opcionesPregunta14.add(opcion56);
        Pregunta pregunta14 = new Pregunta(opcionesPregunta14, "Cuál es la fórmula química del agua",2);

        //Pregunta #15
        ArrayList<Opcion> opcionesPregunta15 = new ArrayList<>();
        Opcion opcion57 = new Opcion(1, "Miguel de Cervantes");
        Opcion opcion58 = new Opcion(2, "Victor Hugo");
        Opcion opcion59 = new Opcion(3, "Gabriel García Márquez");
        Opcion opcion60 = new Opcion(4, "Julio Cortázar");

        opcionesPregunta15.add(opcion57);
        opcionesPregunta15.add(opcion58);
        opcionesPregunta15.add(opcion59);
        opcionesPregunta15.add(opcion60);
        Pregunta pregunta15 = new Pregunta(opcionesPregunta15, "¿Quién escribió Cien años de soledad",3);

        //Pregunta #16
        ArrayList<Opcion> opcionesPregunta16= new ArrayList<>();
        Opcion opcion61 = new Opcion(1, "AU");
        Opcion opcion62 = new Opcion(2, "OR");
        Opcion opcion63 = new Opcion(3, "UA");
        Opcion opcion64 = new Opcion(4, "RO");

        opcionesPregunta16.add(opcion61);
        opcionesPregunta16.add(opcion62);
        opcionesPregunta16.add(opcion63);
        opcionesPregunta16.add(opcion64);

        Pregunta pregunta16 = new Pregunta(opcionesPregunta16, "Cuál es el símbolo químico del oro",1);

        //Pregunta #17
        ArrayList<Opcion> opcionesPregunta17= new ArrayList<>();
        Opcion opcion65 = new Opcion(1, "1960");
        Opcion opcion66 = new Opcion(2, "1380");
        Opcion opcion67 = new Opcion(3, "1460");
        Opcion opcion68 = new Opcion(4, "1492");

        opcionesPregunta17.add(opcion65);
        opcionesPregunta17.add(opcion66);
        opcionesPregunta17.add(opcion67);
        opcionesPregunta17.add(opcion68);
        Pregunta pregunta17 = new Pregunta(opcionesPregunta17, "¿En qué año llegó Cristóbal Colón a América?",3);

        //Pregunta #18
        ArrayList<Opcion> opcionesPregunta18 = new ArrayList<>();
        Opcion opcion69 = new Opcion(1, "Mexico");
        Opcion opcion70 = new Opcion(2, "Chile");
        Opcion opcion71 = new Opcion(3, "España");
        Opcion opcion72 = new Opcion(4, "Colombia");

        opcionesPregunta18.add(opcion69);
        opcionesPregunta18.add(opcion70);
        opcionesPregunta18.add(opcion71);
        opcionesPregunta18.add(opcion72);
        Pregunta pregunta18 = new Pregunta(opcionesPregunta18, "¿En qué país se encuentra el desierto de Atacama?",2);

        //Pregunta #19
        ArrayList<Opcion> opcionesPregunta19 = new ArrayList<>();
        Opcion opcion73 = new Opcion(1, "Ecuador");
        Opcion opcion74 = new Opcion(2, "Chile");
        Opcion opcion75 = new Opcion(3, "Argentina");
        Opcion opcion76 = new Opcion(4, "Colombia");

        opcionesPregunta19.add(opcion73);
        opcionesPregunta19.add(opcion74);
        opcionesPregunta19.add(opcion75);
        opcionesPregunta19.add(opcion76);
        Pregunta pregunta19 = new Pregunta(opcionesPregunta19, "¿En qué país se encuentra la Casa Rosada",3);

        //Pregunta #20
        ArrayList<Opcion> opcionesPregunta20 = new ArrayList<>();
        Opcion opcion77 = new Opcion(1, "España");
        Opcion opcion78 = new Opcion(2, "Suiza");
        Opcion opcion79 = new Opcion(3, "Australia");
        Opcion opcion80 = new Opcion(4, "Suecia");

        opcionesPregunta20.add(opcion77);
        opcionesPregunta20.add(opcion78);
        opcionesPregunta20.add(opcion79);
        opcionesPregunta20.add(opcion80);
        Pregunta pregunta20 = new Pregunta(opcionesPregunta20, "Qué país tiene más islas en el mundo",4);

        //Pregunta #21
        ArrayList<Opcion> opcionesPregunta21 = new ArrayList<>();
        Opcion opcion81 = new Opcion(1, "Mandarín");
        Opcion opcion82 = new Opcion(2, "Persa");
        Opcion opcion83 = new Opcion(3, "Coreano");
        Opcion opcion84 = new Opcion(4, "Nihali");

        opcionesPregunta21.add(opcion81);
        opcionesPregunta21.add(opcion82);
        opcionesPregunta21.add(opcion83);
        opcionesPregunta21.add(opcion84);
        Pregunta pregunta21 = new Pregunta(opcionesPregunta21,"Cómo se llama la lengua oficial en china",1);

        //Pregunta #22
        ArrayList<Opcion> opcionesPregunta22 = new ArrayList<>();
        Opcion opcion85 = new Opcion(1, "1980");
        Opcion opcion86 = new Opcion(2, "1982");
        Opcion opcion87 = new Opcion(3, "1984");
        Opcion opcion88 = new Opcion(4, "1986");

        opcionesPregunta22.add(opcion85);
        opcionesPregunta22.add(opcion86);
        opcionesPregunta22.add(opcion87);
        opcionesPregunta22.add(opcion88);
        Pregunta pregunta22 = new Pregunta(opcionesPregunta22,"En que año sucedió el desastre de Chernobyl",4);

        //Pregunta #23
        ArrayList<Opcion> opcionesPregunta23 = new ArrayList<>();
        Opcion opcion89 = new Opcion(1, "Perseo");
        Opcion opcion90 = new Opcion(2, "Hermes");
        Opcion opcion91 = new Opcion(3, "Atenea");
        Opcion opcion92 = new Opcion(4, "Ares");

        opcionesPregunta23.add(opcion89);
        opcionesPregunta23.add(opcion90);
        opcionesPregunta23.add(opcion91);
        opcionesPregunta23.add(opcion92);
        Pregunta pregunta23 = new Pregunta(opcionesPregunta23,"En la mitología griega, ¿quién era el mensajero de los dioses?",2);

        //Pregunta #24
        ArrayList<Opcion> opcionesPregunta24 = new ArrayList<>();
        Opcion opcion93 = new Opcion(1, "Nikola Tesla");
        Opcion opcion94 = new Opcion(2, "Thomas Edison");
        Opcion opcion95 = new Opcion(3, "Benjamin Franklin");
        Opcion opcion96 = new Opcion(4, "Stephen Gray");

        opcionesPregunta24.add(opcion93);
        opcionesPregunta24.add(opcion94);
        opcionesPregunta24.add(opcion95);
        opcionesPregunta24.add(opcion96);
        Pregunta pregunta24 = new Pregunta(opcionesPregunta24, "¿Quien fue el auténtico padre de la electricidad?",1);

        //Pregunta #25
        ArrayList<Opcion> opcionesPregunta25 = new ArrayList<>();
        Opcion opcion97 = new Opcion(1, "Aleksandr Oparin");
        Opcion opcion98 = new Opcion(2, "Luis Pasteur");
        Opcion opcion99 = new Opcion(3, "Charles Darwin");
        Opcion opcion100 = new Opcion(4, "Alexander Fleming");

        opcionesPregunta25.add(opcion97);
        opcionesPregunta25.add(opcion98);
        opcionesPregunta25.add(opcion99);
        opcionesPregunta25.add(opcion100);
        Pregunta pregunta25 = new Pregunta(opcionesPregunta25, "¿Quién es el autor de la teoría sobre el origen de las especies?",3);

        //Ronda 1
        Premio premioRonda1 = new Premio(100, "Televisor Pantalla Plana");
        ArrayList<Pregunta> preguntasRonda1 = new ArrayList<>();
        preguntasRonda1.add(pregunta1);
        preguntasRonda1.add(pregunta2);
        preguntasRonda1.add(pregunta3);
        preguntasRonda1.add(pregunta4);
        preguntasRonda1.add(pregunta5);
        Categoria categoria1 = new Categoria("Muy Fácil");
        int puntaje1 = 100;
        //Ronda 2
        Premio premioRonda2 = new Premio(100, "Motocicleta 0 Km");
        ArrayList<Pregunta> preguntasRonda2 = new ArrayList<>();
        preguntasRonda2.add(pregunta6);
        preguntasRonda2.add(pregunta7);
        preguntasRonda2.add(pregunta8);
        preguntasRonda2.add(pregunta9);
        preguntasRonda2.add(pregunta10);
        Categoria categoria2 = new Categoria("Fácil");
        int puntaje2 = 200;
        //Ronda 3
        Premio premioRonda3 = new Premio(100, "Carro Ultimo modelo");
        ArrayList<Pregunta> preguntasRonda3 = new ArrayList<>();
        preguntasRonda3.add(pregunta11);
        preguntasRonda3.add(pregunta12);
        preguntasRonda3.add(pregunta13);
        preguntasRonda3.add(pregunta14);
        preguntasRonda3.add(pregunta15);
        Categoria categoria3 = new Categoria("Medio");
        int puntaje3 = 300;
        //Ronda 4
        Premio premioRonda4 = new Premio(100, "Viaje a San Andrés");
        ArrayList<Pregunta> preguntasRonda4 = new ArrayList<>();
        preguntasRonda4.add(pregunta16);
        preguntasRonda4.add(pregunta17);
        preguntasRonda4.add(pregunta18);
        preguntasRonda4.add(pregunta19);
        preguntasRonda4.add(pregunta20);
        Categoria categoria4 = new Categoria("Difícil");
        int puntaje4 = 400;
        //Ronda 5
        Premio premioRonda5 = new Premio(100, "Viaje a Cancún");
        ArrayList<Pregunta> preguntasRonda5 = new ArrayList<>();
        preguntasRonda5.add(pregunta21);
        preguntasRonda5.add(pregunta22);
        preguntasRonda5.add(pregunta23);
        preguntasRonda5.add(pregunta24);
        preguntasRonda5.add(pregunta25);
        Categoria categoria5 = new Categoria("Legendario");
        int puntaje5 = 500;


        preguntas.add(preguntasRonda1);
        preguntas.add(preguntasRonda2);
        preguntas.add(preguntasRonda3);
        preguntas.add(preguntasRonda4);
        preguntas.add(preguntasRonda5);

        premios.add(premioRonda1);
        premios.add(premioRonda2);
        premios.add(premioRonda3);
        premios.add(premioRonda4);
        premios.add(premioRonda5);

        categorias.add(categoria1);
        categorias.add(categoria2);
        categorias.add(categoria3);
        categorias.add(categoria4);
        categorias.add(categoria5);

        puntajes.add(puntaje1);
        puntajes.add(puntaje2);
        puntajes.add(puntaje3);
        puntajes.add(puntaje4);
        puntajes.add(puntaje5);
    }
    public static Ronda iniciarRonda(int numeroRonda) {
        int aleatorio;
        int min_val = 0;
        int max_val = 4;
        aleatorio = (int)(Math.random()*( max_val - min_val));
        Premio premioRonda = premios.get(numeroRonda-1);
        ArrayList<Pregunta> preguntasRonda = preguntas.get(numeroRonda-1);
        Categoria categoriaRonda = categorias.get(numeroRonda-1);
        int puntajeRonda = puntajes.get(numeroRonda-1);
        return new Ronda(puntajeRonda, premioRonda, preguntasRonda.get(aleatorio), categoriaRonda);
    }
    public static void iniciarJuego(){


            System.out.println("Hola usuario, por favor ingrese su nombre: ");
            Scanner scanner = new Scanner(System.in);
            String nombre = scanner.nextLine();
            System.out.println("Hola Bienvenido: " + nombre);
            System.out.println("Iniciemos el Juego");
            System.out.println("Presione 0 en cualquier ronda para retirarse con el premio acumulado");


            //Lógica del negocio
            boolean bandera = true;
            int numeroRonda = 1;
            int puntaje = 0;
            StringBuilder prem = new StringBuilder();
            while (bandera) {
                try {
                    System.out.println("Ronda " + numeroRonda);
                    Ronda ronda = iniciarRonda(numeroRonda);
                    System.out.println(ronda.getPreguntas().getDescripcion());
                    ArrayList<Opcion> listaOpcionesRonda1 = ronda.getPreguntas().getOpciones();
                    System.out.println("Por Favor ingrese un número de las siguientes opciones");
                    for (Opcion opcion :
                            listaOpcionesRonda1) {
                        System.out.println(opcion.getNumero() + ") " + opcion.getDetalle());
                    }
                    System.out.println("Dificultad: " + ronda.getCategoria().getTipo());

                    int respuesta = Integer.parseInt(scanner.nextLine());

                    if (numeroRonda <= 4 && respuesta != 0) {
                        if (respuesta == ronda.getPreguntas().getRespuestaCorrecta()) {
                            System.out.println("Felicidades, pasas a la siguiente ronda");
                            puntaje = puntaje + ronda.getPuntaje();
                            System.out.println("Tu puntaje actual es: " + puntaje);
                            prem.append(ronda.getPremio().getDescripcion());
                            prem.append(", ");
                            System.out.println("Premios acumulados: " + prem);

                        } else {
                            System.out.println("Suerte en la próxima");
                            bandera = false;
                        }
                    }
                    numeroRonda++;
                    if (numeroRonda > 5 || respuesta == 0) {
                        bandera = false;
                        System.out.println("Gracias por participar, te retiraste con un total de " + puntaje + " puntos" + " y " + prem);
                    }
                } catch (NumberFormatException e){
                    System.out.println("El valor ingresado no es un número");

            }

    }
    }
    public static void main(String[] args) {
        inicializarBaseDeDatos();
        iniciarJuego();
    }
}
