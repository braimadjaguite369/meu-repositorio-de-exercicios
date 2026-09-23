//01/04/2026
//BRAIMA DJAGUITÉ
//ENGENHARIA INFORMÁTICA    ...ESTG

import Enums.Condicao;
import Enums.Origem;
import Enums.Tipologia;
import triler.Triler;

public class Main {
    public static void  main(String[] arg){
        Triler triler = new Triler(50);
        Truck truck = new Truck(5, "Lamburdjine", "Lambur", "2026-04-01",
                Origem.NACIONAL, 400, Condicao.NEW, 5000, 3, 150, Tipologia.TIR);
        Car car = new Car(2, "Toyota", "Toyota", "2026-04-02", Origem.NACIONAL, 300, Condicao.NEW, 45000, 4, 4);
        Motociclo motociclo = new Motociclo(1, "Ranje", "Rover", "2026-04-02", Origem.NACIONAL, 400, Condicao.USED, 40000, 4, 9);

        Veiculos veiculos = new Veiculos();
        veiculos.addVeiculo(truck);
        veiculos.addVeiculo(car);
        veiculos.addVeiculo(motociclo);
        veiculos.remVeiculo(2);
        veiculos.listarVeiculos();
        System.out.println(veiculos.apresentarVeiculosPorTipo());

    }
}