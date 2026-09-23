package Enums;

public enum TipoProgramador {
    SENIOR, JUNIOR;

    public static String tipoProgramadorParaString(TipoProgramador tipo){
          switch(tipo){
              case JUNIOR:
                  return "Junior";
              case SENIOR:
                  return "Senior";
              default:
                  return "Desconhecido";
          }
    }
}
