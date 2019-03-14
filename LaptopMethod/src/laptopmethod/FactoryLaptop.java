/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopmethod;

/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
class FactoryLaptop {
    public Laptop getLaptop(String modelo, String marca) {
        //TODO implementar tratativa para cada marca e modelo diferente
        if (marca.equals("Apple")) {
            return new Notebook(modelo);
        }
        if (marca.equals("Dell")) {
            return new Ultrabook(modelo);
        }
        return null;
    }
}
