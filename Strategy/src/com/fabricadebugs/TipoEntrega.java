package com.fabricadebugs.ServicoDeEntrega;

import com.fabricadebugs.ServicoDeEntrega.Entregas.AirDeliver;
import com.fabricadebugs.ServicoDeEntrega.Entregas.ExpressAtlantic;
import com.fabricadebugs.ServicoDeEntrega.Entregas.Expresso;
import com.fabricadebugs.ServicoDeEntrega.Entregas.Normal;

public enum TipoEntrega {

    NORMAL {
        @Override
        public Entrega gEntrega(){
            return new Normal();
        }
    },
    EXPRESSO {
        @Override
        public Entrega gEntrega() {
            return new Expresso();
        }
    },
    AIRDELIVER {
        @Override
        public Entrega gEntrega() {
            return new AirDeliver();
        }
    },
    EXPRESSATLANTIC {
        @Override
        public Entrega gEntrega() {
            return new ExpressAtlantic();
        }
    };

    public abstract Entrega gEntrega();
}
