package quedeleite;

import java.util.Scanner;
import quedeleite.Biscoiteria.BiscoiteriaFactory;
import quedeleite.Biscoiteria.BiscoitosMamae;
import quedeleite.Biscoiteria.BiscoitosVovo;
import quedeleite.Biscoiteria.Doce;
import quedeleite.Biscoiteria.Salgado;
import quedeleite.Boloteria.Bolo;
import quedeleite.Boloteria.BoloAniversario;
import quedeleite.Boloteria.BoloCasamento;
import quedeleite.Boloteria.BoloExecutivo;
import quedeleite.Boloteria.BoloFesta;
import quedeleite.Boloteria.BoloteriaFactory;
import quedeleite.Doceteria.DoceDeLeite;
import quedeleite.Doceteria.DoceteriaPrototype;
import quedeleite.Doceteria.Pacoca;
import quedeleite.Doceteria.PeDeMoleque;
import quedeleite.Doceteria.Suspiro;

public class QueDeleite {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo a QueDeleite, sua loja de guloseimas!!!");
        System.out.println("Escolha uma opção: " + "[1]Biscoitos " + "[2]Bolos " + "[3]Doces");
        int escolha = scanner.nextInt();
        if (escolha == 1) {
            Scanner bisq = new Scanner(System.in);
            System.out.println("Escolha uma opção de biscoito: " + "[1]Polvilho " + "[2]Nata " + "[3]Queijo " + "[4]Mel");
            int bs = bisq.nextInt();
            BiscoiteriaFactory biscoito = new BiscoitosVovo();
            Doce doce = biscoito.biscoitoDoce();
            Salgado salgado = biscoito.biscoidoSalgado();
            if (bs == 1) {
                salgado.exibirInfoBiscoitoSalgado();
                System.out.println();
            } else if (bs == 2) {
                doce.exibirInfoBiscoitoDoce();
                System.out.println();
            } else if (bs == 3) {
                biscoito = new BiscoitosMamae();
                salgado = biscoito.biscoidoSalgado();
                salgado.exibirInfoBiscoitoSalgado();
                System.out.println();
            } else if (bs == 4) {
                biscoito = new BiscoitosMamae();
                doce = biscoito.biscoitoDoce();
                doce.exibirInfoBiscoitoDoce();
                System.out.println();
            } else {
                System.out.println("Você não selecionou nenhuma opção válida!");
            }
        } else if (escolha == 2) {
            Scanner bol = new Scanner(System.in);
            System.out.println("Escolha uma opção de Bolo: [1]Veu de Noiva " + "[2]Chocolate " + "[3]Ben 10 " + "[4]Ferrero Rocher");
            int bl = bol.nextInt();
            BoloteriaFactory boloteria = new BoloCasamento();
            Bolo bolo = boloteria.criarBolo();
            if (bl == 1) {
                bolo.exibirInfo();
                System.out.println();
            } else if (bl == 2) {
                boloteria = new BoloFesta();
                bolo = boloteria.criarBolo();
                bolo.exibirInfo();
                System.out.println();
            } else if (bl == 3) {
                boloteria = new BoloAniversario();
                bolo = boloteria.criarBolo();
                bolo.exibirInfo();
                System.out.println();
            } else if (bl == 4) {
                boloteria = new BoloExecutivo();
                bolo = boloteria.criarBolo();
                bolo.exibirInfo();
                System.out.println();
            } else {
                System.out.println("Você não selecionou nenhuma opção válida!");
            }
        } else if (escolha == 3) {
            Scanner doc = new Scanner(System.in);
            System.out.println("Escolha uma opção de Doce: " + "[1]Suspiro " + "[2]Paçoca " + "[3]Pé de Moleque " + "[4]Doce de Leite");
            int dc = doc.nextInt();
            Suspiro suspiroPrototipo = new Suspiro();
            DoceteriaPrototype suspiro = suspiroPrototipo.clonar();
            suspiro.setValorCompra(1.99);
            Pacoca pacocaPrototipo = new Pacoca();
            DoceteriaPrototype pacoca = pacocaPrototipo.clonar();
            pacoca.setValorCompra(0.25);
            PeDeMoleque peDeMolequePrototipo = new PeDeMoleque();
            DoceteriaPrototype peDeMoleque = peDeMolequePrototipo.clonar();
            peDeMoleque.setValorCompra(1.50);
            DoceDeLeite doceDeLeitePrototipo = new DoceDeLeite();
            DoceteriaPrototype doceDeLeite = doceDeLeitePrototipo.clonar();
            doceDeLeite.setValorCompra(1.25);
            if (dc == 1) {
                System.out.println(suspiro.exibirInfo());
            } else if (dc == 2) {
                System.out.println(pacoca.exibirInfo());
            } else if (dc == 3) {
                System.out.println(peDeMoleque.exibirInfo());
            } else if (dc == 4) {
                System.out.println(doceDeLeite.exibirInfo());
            } else {
                System.out.println("Você não selecionou nenhuma opção válida!");
            }
        } else {
            System.out.println("Você não selecionou nenhuma opção válida!");
        }
    }
}
